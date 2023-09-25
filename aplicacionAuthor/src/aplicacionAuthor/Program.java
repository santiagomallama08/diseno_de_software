package aplicacionAuthor;
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author autor1 = new Author( "Santiago Mallama", " ", 'M'); 
		System.out.println("Los datos del autor sin email son: " + autor1);
		Scanner teclado = new Scanner(System.in); 
		System.out.println(" Ingrese por favor el email: "  );	
		autor1.setEmail(teclado.next());
		System.out.println("Los datos del autor son: " + autor1);

		Libro libro1 = new Libro(" Fisica aritmetica" , autor1 , 0, 0  );
		System.out.println("El libro que usted esta llevando tiene esta definicion:" + libro1);
		Scanner teclado1 = new Scanner(System.in);
		System.out.println("Ingrese por favor el precio del libro");
		libro1.setPrice(teclado.nextInt());
		System.out.println(" ingrese la cantidad de libros que llevara");
		libro1.setqty(teclado.nextInt ());
		System.out.println(" La cuenta final del articulo o los articulos es:  " + libro1);
	}

}
