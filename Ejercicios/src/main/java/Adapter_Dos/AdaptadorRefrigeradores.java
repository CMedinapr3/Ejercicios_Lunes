package Adapter_Dos;

public class AdaptadorRefrigeradores implements Artefactos1 {
	private Refrigeradores refrigeradores = new Refrigeradores();

	public AdaptadorRefrigeradores(Refrigeradores refrigeradores) {
		this.refrigeradores = refrigeradores;
	}

	@Override
	public void precio() {
		System.out.println("Precio de 200 bs un refrigerador");
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida de refrigerador: 5 años");

	}

}
