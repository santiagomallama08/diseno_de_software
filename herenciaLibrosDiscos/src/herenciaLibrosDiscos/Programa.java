package herenciaLibrosDiscos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Publicacion publicacion1 = new Publicacion("",0);
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese el titulo");
		publicacion1.setTitulo(teclado.next());
		System.out.println("ingrese el precio");
		publicacion1.setPrecio(teclado.nextFloat());
		System.out.println(publicacion1);
		
	}

}
