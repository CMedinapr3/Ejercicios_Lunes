package Adapter_Dos;

public class Lavadoras implements Artefactos2 {

	@Override
	public void costo() {
		System.out.println("Costo de lavadora: 1000 dolares");
	}

	@Override
	public void tiempoGarantia() {
		System.out.println("Tiempo de garantia: 20 años");
	}

}
