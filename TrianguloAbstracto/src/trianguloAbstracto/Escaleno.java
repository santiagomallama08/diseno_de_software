package trianguloAbstracto;

public class Escaleno extends trianguloBase {
   
    
    public Escaleno(int lado, int hipotenusa) {
        super(lado, hipotenusa); 
    }

    @Override
    public double Perimetro() {
        return lado+hipotenusa;
    }
}

