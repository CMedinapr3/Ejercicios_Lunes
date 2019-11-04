package Adapter_Dos;

public class AdaptadorTelevisores implements Artefactos1 {
	private Televisores televisores = new Televisores();

	public AdaptadorTelevisores(Televisores televisores) {
		this.televisores = televisores;
	}

	@Override
	public void precio() {
		System.out.println("Precio de telvisores: 200 dolares");

	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de vida 10 años");
	}

}
