package trianguloAbstracto;

public class Acutangul extends trianguloBase {

    public Acutangul(int lado, int hipotenusa) {
        super(lado, hipotenusa); 
        
    }

    @Override
    public double Perimetro() {
        return (lado+hipotenusa);
    }
}
