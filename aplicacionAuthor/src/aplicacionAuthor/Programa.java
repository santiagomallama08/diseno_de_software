package aplicacionAuthor;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author autor1 = new Author( "Santiago mallama", " ", 'M'); 
		System.out.println("Los datos del autor sin email son: " + autor1);
		Scanner teclado = new Scanner(System.in); 
		System.out.println(" Ingrese por favor el email: "  );	
		autor1.setEmail(teclado.next());
		System.out.println("Los datos del autor son: " + autor1);

	}

}
