package aplicacionAuthor;
import aplicacionAuthor.Libro;
public class Libro {
	private String name; 
	private Author author; 
	private double price; 
	private int qty = 0; 
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String name,Author author, double price ) {
		this.name = name; 
		this.author = author; 
		this.price = price; 	
	}
	
	public Libro(String name, Author author,double price,int qty) {
		this.name = name; 
		this.author = author; 
		this.price = price; 
		this.qty = qty; 
	}
	
	public String getName() {
		return name; 
	}
	
	public Author getAutor() {
		return author ;
	}
	
	public double getPrice() {
		return price; 
	}
	
	public void setPrice(double price ) {
		this.price = price; 
	}
	
	public int getqty() {
		return qty;
	}
	
	public void setqty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		
		return "El libro de nombre:" + name + " Con ficha bibliografica " + author + " tiene un precio de:" + price +" Y la cantidad que esta llevando es :" + qty;
	}

}
