package aplicacionInvoiceItem;
import java.util.Scanner;

public class Programa {

	public Programa() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		InvoceItem invoiceItem1 = new InvoceItem("12000", "camiseta", 0, 0 ); 
		Scanner teclado = new Scanner(System.in ); 
		System.out.println("ingrese la cantidad de articulos"); 
		invoiceItem1.setQty(teclado.nextInt ());
		System.out.println(" ingrese el valor de la prenda:");
		invoiceItem1.setUnitPrice(teclado.nextInt());
		System.out.println(" el total de la cuenta de los articulos sera:" + invoiceItem1.getTotal()); 
		System.out.println(" La factura sera:" + invoiceItem1  ); 
		 
	}

}


