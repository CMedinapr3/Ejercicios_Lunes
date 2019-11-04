package Visitor_uno;

public class Client {

	public static void main(String[] args) {
		Perro perro = new Perro();
		Gato gato = new Gato();
		Caballo caballo = new Caballo();
		Veterinario visitor = new Veterinario();

		System.out.println(perro.accept(visitor));
		System.out.println(gato.accept(visitor));
		System.out.println(caballo.accept(visitor));

	}

}
