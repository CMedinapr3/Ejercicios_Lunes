package Adapter_Dos;

public class Refrigeradores implements Artefactos2 {

	@Override
	public void costo() {
		System.out.println("Costo de 200 bs un refrigerador");
	}

	@Override
	public void tiempoGarantia() {
		System.out.println("Garantia de refrigerador: 5 años");
	}

}
