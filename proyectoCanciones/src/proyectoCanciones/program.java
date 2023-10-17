package proyectoCanciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    private static List<Canciones> listaCanciones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean seguir = true;

        while (seguir) {
            System.out.println("1. Agregar canción");
            System.out.println("2. Eliminar canción");
            System.out.println("3. Editar canción");
            System.out.println("4. Mostrar lista de canciones");
            System.out.println("5. Salir");
            System.out.println("seleccione una opcion");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // 
            switch (opcion) {
                case 1:
                    agregarCancion();
                    break;
                case 2:
                    eliminarCancion();
                    break;
                case 3:
                    editarCancion();
                    break;
                case 4:
                	Canciones cancion1 = new Canciones("ayer y hoy",2,50,"julio jaramillo","julio jaramillo");
                	Canciones cancion2 = new Canciones("entre el amor y yo",3,30,"Dario gomez","dario gomez");
                	Canciones cancion3 = new Canciones("mi desesperacion",3,20,"romulo caicedo","romulo caicedo");
                	Canciones cancion4 = new Canciones("olvidala",5,30,"jorge celedon","jorge celedon");
                	System.out.println(cancion1);
                	System.out.println(cancion2);
                	System.out.println(cancion3);
                	System.out.println(cancion4);
                	
                	
                    mostrarListaCanciones();
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    private static void agregarCancion() {
        System.out.print("Ingrese el título: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese la duración en minutos: ");
        int duracionMinutos = scanner.nextInt();
        System.out.print("Ingrese la duración en segundos: ");
        int duracionSegundos = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Ingrese los intérpretes: ");
        String interpretes = scanner.nextLine();
        System.out.print("Ingrese el compositor: ");
        String compositor = scanner.nextLine();

        Canciones cancion = new Canciones(titulo, duracionMinutos, duracionSegundos, interpretes, compositor);
        listaCanciones.add(cancion);
        System.out.println("Canción agregada con éxito.");
    }

    private static void eliminarCancion() {
        System.out.print("Ingrese el título de la canción que desea eliminar: ");
        String titulo = scanner.nextLine();
        Canciones.eliminarCancion(listaCanciones, titulo);
        System.out.println("Canción eliminada con éxito.");
    }

    private static void editarCancion() {
        System.out.print("Ingrese el título de la canción que desea editar: ");
        String titulo = scanner.nextLine();
        boolean encontrada = false;
        
        for (Canciones cancion : listaCanciones) {
            if (cancion.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.print("Nuevo título (deje en blanco para no cambiar): ");
                String nuevoTitulo = scanner.nextLine();
                if (!nuevoTitulo.isEmpty()) {
                    cancion.setTitulo(nuevoTitulo);
                }

                System.out.print("Nueva duración en minutos (deje en blanco para no cambiar): ");
                String nuevaDuracionMinutosStr = scanner.nextLine();
                if (!nuevaDuracionMinutosStr.isEmpty()) {
                    int nuevaDuracionMinutos = Integer.parseInt(nuevaDuracionMinutosStr);
                    cancion.setDuracionMinutos(nuevaDuracionMinutos);
                }

                System.out.print("Nueva duración en segundos (deje en blanco para no cambiar): ");
                String nuevaDuracionSegundosStr = scanner.nextLine();
                if (!nuevaDuracionSegundosStr.isEmpty()) {
                    int nuevaDuracionSegundos = Integer.parseInt(nuevaDuracionSegundosStr);
                    cancion.setDuracionSegundos(nuevaDuracionSegundos);
                }

                System.out.print("Nuevos intérpretes (deje en blanco para no cambiar): ");
                String nuevosInterpretes = scanner.nextLine();
                if (!nuevosInterpretes.isEmpty()) {
                    cancion.setInterpretes(nuevosInterpretes);
                }

                System.out.print("Nuevo compositor (deje en blanco para no cambiar): ");
                String nuevoCompositor = scanner.nextLine();
                if (!nuevoCompositor.isEmpty()) {
                    cancion.setCompositor(nuevoCompositor);
                }

                System.out.println("Canción editada con éxito.");
                encontrada = true;
                break; // Salir del bucle una vez que se haya editado la canción
            }
        }
        
        if (!encontrada) {
            System.out.println("No se encontró una canción con el título especificado.");
        }
    }

        
    
    

    private static void mostrarListaCanciones() {
        System.out.println("Lista de canciones:");
        for (Canciones cancion : listaCanciones) {
            System.out.println(cancion);
        }
    }
}







