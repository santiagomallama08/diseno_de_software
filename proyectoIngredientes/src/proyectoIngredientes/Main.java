
package proyectoIngredientes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Ingredientes> listaIngredientes = new ArrayList<>();

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
            System.out.println("Ingredientes existentes:");
            for (Ingredientes ingrediente : listaIngredientes) {
                System.out.println(ingrediente);
            }

            System.out.println("Ingrese el nombre del nuevo ingrediente a añadir: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la unidad: ");
            String unidad = scanner.nextLine();
            System.out.println("Ingrese el precio: ");
            int precio = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el sitio de compras: ");
            String sitioCompras = scanner.nextLine();

            Ingredientes nuevoIngrediente = new Ingredientes(nombre, unidad, precio, sitioCompras);
            listaIngredientes.add(nuevoIngrediente);

            System.out.println("¿Desea agregar otro ingrediente? (S/N): ");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("sI")) {
                break; // Sale del bucle si la respuesta no es "s"
            }
        }

        System.out.println("Ingredientes finalizados:");
        for (Ingredientes ingrediente : listaIngredientes) {
            System.out.println(ingrediente);
        }
    }
}
