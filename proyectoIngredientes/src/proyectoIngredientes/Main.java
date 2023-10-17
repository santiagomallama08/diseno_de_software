package proyectoIngredientes;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Ingredientes> listaIngredientes = new ArrayList<>();
        List<Receta> listaRecetas = new ArrayList<>();

        Ingredientes ejemplo = new Ingredientes("Zanahoria", "1 Kg", 5000, "Tienda de Uno");
        Ingredientes ejemplo2 = new Ingredientes("Cebolla", "2 Kg", 4000, "Tienda Primax");
        Ingredientes ejemplo3 = new Ingredientes("Melocoton", "2 Kg", 4000, "Tienda Primax");
        Ingredientes ejemplo4 = new Ingredientes("Carne", "2 Kg", 4000, "Tienda Primax");
        Ingredientes ejemplo5 = new Ingredientes("Pollo", "2 Kg", 4000, "Tienda Primax");

        listaIngredientes.add(ejemplo);
        listaIngredientes.add(ejemplo2);
        listaIngredientes.add(ejemplo3);
        listaIngredientes.add(ejemplo4);
        listaIngredientes.add(ejemplo5);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar nuevo ingrediente");
            System.out.println("2. Agregar nueva receta");
            System.out.println("3. Listar ingredientes");
            System.out.println("4. Listar recetas");
            System.out.println("5. Eliminar ingrediente");
            System.out.println("6. Salir");
            System.out.println("7. Editar receta");
            System.out.println("8. Eliminar receta");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del nuevo ingrediente a añadir: ");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.println("Ingrese la unidad en KG, G, LB, L: ");
                    String unidad = scanner.nextLine().toLowerCase();
                    
                    if(!unidad.equals("kg") && !unidad.equals("lb") && !unidad.equals("g") && !unidad.equals("l")) {
                        System.out.println("No se puede ingresar la unidad");
                    } else {
                        System.out.println("Ingrese las calorias: ");
                        int calorias = scanner.nextInt();
                        if (calorias < 0) {
                            System.out.println("No se puede agregar un valor negativo");
                        } else {
                            scanner.nextLine();
                            System.out.println("Ingrese el sitio de compras: ");
                            String sitioCompras = scanner.nextLine();
                            
                            Ingredientes nuevoIngrediente = new Ingredientes(nombreIngrediente, unidad, calorias, sitioCompras);
                            listaIngredientes.add(nuevoIngrediente);
                            System.out.println("Ingrediente agregado con éxito.");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la nueva receta: ");
                    String nombreReceta = scanner.nextLine();
                    System.out.println("Ingrese el tiempo de preparación en minutos: ");
                    int tiempoPreparacion = scanner.nextInt();
                    scanner.nextLine(); // Consumir la línea en blanco
                    System.out.println("Ingrese la cantidad de personas a servir: ");
                    int cantidadPersonas = scanner.nextInt();
                    scanner.nextLine(); // Consumir la línea en blanco
                    System.out.println("Ingrese la descripción de la receta: ");
                    String descripcion = scanner.nextLine();

                    Receta nuevaReceta = new Receta(nombreReceta, tiempoPreparacion, cantidadPersonas, descripcion);

                    while (true) {
                        System.out.println("Ingrese el nombre de un ingrediente para agregar a la receta (o escriba 'fin' para terminar): ");
                        String nombreIngredienteReceta = scanner.nextLine();
                        if (nombreIngredienteReceta.equalsIgnoreCase("fin")) {
                            break; // Sale del bucle si se ingresa 'fin'
                        }
                        boolean encontrado = false;
                        for (Ingredientes ingrediente : listaIngredientes) {
                            if (ingrediente.getNombre().equalsIgnoreCase(nombreIngredienteReceta)) {
                                nuevaReceta.agregarIngrediente(ingrediente);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Ingrediente no encontrado en la lista de ingredientes.");
                        }
                    }

                    listaRecetas.add(nuevaReceta);
                    System.out.println("Receta agregada con éxito.");
                    break;

                case 3:
                    System.out.println("Ingredientes existentes:");
                    for (Ingredientes ingrediente : listaIngredientes) {
                        System.out.println(ingrediente);
                    }
                    break;

                case 4:
                    System.out.println("Recetas existentes:");
                    for (Receta receta : listaRecetas) {
                        System.out.println(receta);
                    }
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del ingrediente a eliminar: ");
                    String nombreIngredienteEliminar = scanner.nextLine();
                    if (!seUtilizaEnReceta(listaRecetas, nombreIngredienteEliminar)) {
                        eliminarIngrediente(listaIngredientes, nombreIngredienteEliminar);
                        System.out.println("Ingrediente eliminado con éxito.");
                    } else {
                        System.out.println("No se puede eliminar el ingrediente, ya que se utiliza en una receta.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;

                case 7:
                    System.out.println("Ingrese el nombre de la receta a editar: ");
                    String nombreRecetaEditar = scanner.nextLine();
                    editarReceta(listaRecetas, nombreRecetaEditar);
                    break;

                case 8:
                    System.out.println("Ingrese el nombre de la receta a eliminar: ");
                    String nombreRecetaEliminar = scanner.nextLine();
                    eliminarReceta(listaRecetas, nombreRecetaEliminar);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }

    private static void eliminarIngrediente(List<Ingredientes> listaIngredientes, String nombreIngredienteEliminar) {
        Iterator<Ingredientes> iterator = listaIngredientes.iterator();
        while (iterator.hasNext()) {
            Ingredientes ingrediente = iterator.next();
            if (ingrediente.getNombre().equalsIgnoreCase(nombreIngredienteEliminar)) {
                iterator.remove();
                System.out.println("Ingrediente eliminado con éxito");
                return;
            }
        }
        System.out.println("Ingrediente no encontrado en la lista.");
    }

    private static boolean seUtilizaEnReceta(List<Receta> listaRecetas, String nombreIngrediente) {
        for (Receta receta : listaRecetas) {
            for (Ingredientes ingrediente : receta.getIngredientes()) {
                if (ingrediente.getNombre().equalsIgnoreCase(nombreIngrediente)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void editarReceta(List<Receta> listaRecetas, String nombreRecetaEditar) {
        for (Receta receta : listaRecetas) {
            if (receta.getNombre().equalsIgnoreCase(nombreRecetaEditar)) {
                System.out.println("Ingrese el nuevo nombre de la receta: ");
                String nuevoNombreReceta = scanner.nextLine();
                System.out.println("Ingrese el nuevo tiempo de preparación en minutos: ");
                int nuevoTiempoPreparacion = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea en blanco
                System.out.println("Ingrese la nueva cantidad de personas a servir: ");
                int nuevaCantidadPersonas = scanner.nextInt();
                scanner.nextLine(); // Consumir la línea en blanco
                System.out.println("Ingrese la nueva descripción de la receta: ");
                String nuevaDescripcion = scanner.nextLine();

                receta.setNombre(nuevoNombreReceta);
                receta.setTiempoPreparacionMinutos(nuevoTiempoPreparacion);
                receta.setCantidadPersonas(nuevaCantidadPersonas);
                receta.setDescripcion(nuevaDescripcion);

                System.out.println("Receta editada con éxito.");
                return;
            }
        }
        System.out.println("Receta no encontrada en el listado.");
    }

    private static void eliminarReceta(List<Receta> listaRecetas, String nombreRecetaEliminar) {
        Iterator<Receta> iterator = listaRecetas.iterator();
        while (iterator.hasNext()) {
            Receta receta = iterator.next();
            if (receta.getNombre().equalsIgnoreCase(nombreRecetaEliminar)) {
                iterator.remove();
                System.out.println("Receta eliminada con éxito.");
                return;
            }
        }
        System.out.println("Receta no encontrada en el listado.");
    }

   
}