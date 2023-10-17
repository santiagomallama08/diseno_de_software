package trianguloAbstracto;

public abstract class trianguloBase {
	protected int  lado;
	protected int hipotenusa;
	
	public trianguloBase(int lado, int hipotenusa) {
		this.lado = lado;
		this.hipotenusa = hipotenusa;
		
	}
	abstract double Perimetro();
	public double  CalcularAreaConHipotenusa(){
		
		return  (lado*hipotenusa)/2;
	}
	
	

}
