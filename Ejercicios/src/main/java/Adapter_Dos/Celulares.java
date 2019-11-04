package Adapter_Dos;

public class Celulares implements Artefactos1 {

	@Override
	public void precio() {
		System.out.println("Precio de celular: 100 dolares");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida del celular: 2 años");
	}

}
