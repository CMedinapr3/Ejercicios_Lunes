package Adapter_Dos;

public class Televisores implements Artefactos2 {

	@Override
	public void costo() {
		System.out.println("Costo de telvisores: 200 dolares");
	}

	@Override
	public void tiempoGarantia() {
		System.out.println("Garantia: 10 años");
	}

}
