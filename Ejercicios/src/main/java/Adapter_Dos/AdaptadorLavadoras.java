package Adapter_Dos;

public class AdaptadorLavadoras implements Artefactos1 {
	private Lavadoras lavadoras = new Lavadoras();

	public AdaptadorLavadoras(Lavadoras lavadoras) {
		this.lavadoras = lavadoras;
	}

	@Override
	public void precio() {
		System.out.println("Precio de lavadora: 1000 dolares");

	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de Vida: 20 años");

	}

}
