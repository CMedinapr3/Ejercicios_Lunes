package Adapter_Dos;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		Televisores televisor = new Televisores();
		Refrigeradores refrigerador = new Refrigeradores();
		Tablets tablet = new Tablets();
		Lavadoras lavadora = new Lavadoras();
		Computadoras computadora = new Computadoras();
		Celulares celular = new Celulares();

		AdaptadorTelevisores adaptadorTelevisores = new AdaptadorTelevisores(televisor);
		AdaptadorLavadoras adaptadorLavadoras = new AdaptadorLavadoras(lavadora);
		AdaptadorRefrigeradores adaptadorRefrigeradores = new AdaptadorRefrigeradores(refrigerador);

		ArrayList<Artefactos1> artefactos = new ArrayList<Artefactos1>();

		artefactos.add(adaptadorTelevisores);
		artefactos.add(computadora);
		artefactos.add(tablet);
		artefactos.add(celular);
		artefactos.add(adaptadorLavadoras);
		artefactos.add(adaptadorRefrigeradores);

		for (int i = 0; i < artefactos.size(); i++) {
			artefactos.get(i).precio();
			artefactos.get(i).tiempoDeVida();
		}
	}
}
