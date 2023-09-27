package herenciaCH;

class CilindroHueco extends Cilindro {
    private double radioInterior;

    public void leerRadioInterior(double radioInterior) {
        this.radioInterior = radioInterior;
    }

    public double areaSuperficialExterna() {
        double radioExterno = super.radio;
        return 2 * Math.PI * radioExterno * (radioExterno + altura);
    }

    public double areaSuperficialInterna() {
        return 2 * Math.PI * radioInterior * (radioInterior + altura);
    }

    public double volumen() {
        double radioExterno = super.radio;
        return Math.PI * altura * (radioExterno * radioExterno - radioInterior * radioInterior);
    }
}
