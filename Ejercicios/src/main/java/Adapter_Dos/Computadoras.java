package Adapter_Dos;

public class Computadoras implements Artefactos1 {

	@Override
	public void precio() {
		System.out.println("Precio de computadora: 800 dolares");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida de computadora: 4 años");
	}

}
