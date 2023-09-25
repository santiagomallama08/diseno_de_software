package aplicacionFabrica;
import java.util.Random; 
import java.util.List;
import java.util.ArrayList;


public class plantaFabricacion {
	private List <Carro> carrosFabricados;

    public plantaFabricacion() {
        carrosFabricados = new ArrayList<>();
    }

    public void fabricarCarros(int cantidad, int planta) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            String color = obtenerColorAleatorio();
            Llanta llantaDelantera = new Llanta(obtenerTipoLlantaAleatorio(), random.nextInt(21) + 15);
            Llanta llantaTrasera = new Llanta(obtenerTipoLlantaAleatorio(), random.nextInt(21) + 15);
            Chasis chasis = new Chasis(random.nextInt(2000) + 1000, obtenerMaterialChasisAleatorio());

            Carro carro = new Carro(llantaDelantera, llantaTrasera, chasis, color, planta);
            carrosFabricados.add(carro);

            System.out.println("\nCarro Fabricado en la planta " + planta + ":\n" + carro);
        }
    }

    
    private String obtenerColorAleatorio() {
        String[] colores = {"Rojo", "Azul", "Verde", "Blanco", "Negro", "Gris"};
        Random random = new Random();
        int indice = random.nextInt(colores.length);
        return colores[indice];
    }

    private String obtenerTipoLlantaAleatorio() {
        String[] tiposLlanta = {"Michelin", "Pirelli", "Todo Terreno"};
        Random random = new Random();
        int indice = random.nextInt(tiposLlanta.length);
        return tiposLlanta[indice];
    }

    private String obtenerMaterialChasisAleatorio() {
        String[] materiales = {"Aluminio", "Acero"};
        Random random = new Random();
        int indice = random.nextInt(materiales.length);
        return materiales[indice];
    }


}
