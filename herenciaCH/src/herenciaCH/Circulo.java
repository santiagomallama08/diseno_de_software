package herenciaCH;

public class Circulo {
		protected double radio;

	    public void leerRadio(double radio) {
	        this.setRadio(radio);
	    }

	    public double area() {
	        return Math.PI * getRadio() * getRadio();
	    }

	    public double circunferencia() {
	        return 2 * Math.PI * getRadio();
	    }

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}

}
