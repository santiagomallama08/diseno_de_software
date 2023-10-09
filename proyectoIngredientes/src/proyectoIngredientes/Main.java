package proyectoIngredientes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco

            switch (opcion) {
                case 1:
                	   System.out.println("Ingrese el nombre del nuevo ingrediente a añadir: ");
                       String nombreIngrediente = scanner.nextLine();
                       System.out.println("Ingrese la unidad: ");
                       String unidad = scanner.nextLine();
                       System.out.println("Ingrese el precio: ");
                       int precio = scanner.nextInt();
                       scanner.nextLine(); // Consumir la línea en blanco
                       System.out.println("Ingrese el sitio de compras: ");
                       String sitioCompras = scanner.nextLine();

                       Ingredientes nuevoIngrediente = new Ingredientes(nombreIngrediente, unidad, precio, sitioCompras);
                       listaIngredientes.add(nuevoIngrediente);
                       System.out.println("Ingrediente agregado con éxito.");
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

                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        }
    }

    // Método para eliminar un ingrediente de la lista
    private static void eliminarIngrediente(List<Ingredientes> listaIngredientes, String nombreIngredienteEliminar) {
        Iterator<Ingredientes> iterator = listaIngredientes.iterator();
        while (iterator.hasNext()) {
            Ingredientes ingrediente = iterator.next();
            if (ingrediente.getNombre().equalsIgnoreCase(nombreIngredienteEliminar)) {
                iterator.remove();
                System.out.println("Ingrediente eliminado con éxito.");
                return;
            }
        }
        System.out.println("Ingrediente no encontrado en la lista.");
    }

    // Método para verificar si un ingrediente se utiliza en alguna receta
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
}