package Composite_cinco;

public class Main {

	public static void main(String[] args) {
		Composite computadora = new Composite(" Computadora");
		System.out.println("Precio de una computadora");
		computadora.add(new Computadora("Computadora1"));
		computadora.print();
		
		Composite laboratorio = new Composite(" Laboratorio");
		System.out.println("Precio de laboratorio");
		laboratorio.add(computadora);
		laboratorio.add(computadora);
		laboratorio.add(computadora);
		laboratorio.print();

		Composite contenedores = new Composite(" Contenedor de computadora");
		System.out.println("Precio de contenedor");
		contenedores.add(laboratorio);
		contenedores.add(laboratorio);

		contenedores.print();
	}

}
