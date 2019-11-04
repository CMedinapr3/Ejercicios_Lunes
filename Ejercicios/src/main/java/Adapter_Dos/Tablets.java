package Adapter_Dos;

public class Tablets implements Artefactos1 {

	@Override
	public void precio() {
		System.out.println("precio de tablet: 500 dolares");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida 5 años");
	}

}
