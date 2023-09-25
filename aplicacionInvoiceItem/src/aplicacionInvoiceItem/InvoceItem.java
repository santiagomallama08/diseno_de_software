package aplicacionInvoiceItem;

public class InvoceItem {
	private String id; 
	private String desc; 
	private int qty; 
	private double unitPrice; 

		
	public InvoceItem(String id, String desc, int qty, double unitePrice) {
		
		this.id = id; 
		this.desc = desc; 
		this.qty = qty ; 
		this.unitPrice = unitePrice;
	}
	
	public String getID() {
		return id ; 
	}
	
	public String getDesc(){
		return desc; 
	}
	
	public int getQty() {
		return qty ; 
	}
	
	public void setQty(int qty) {
		this.qty = qty; 
	}
	
	public double UnitPrice() {
		return unitPrice ; 
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice ;
	}
	
	public double getTotal() {
		double total = unitPrice * qty; 
		return total; 
	}

	@Override
	public String toString() {
		return " id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "";
	}

}
