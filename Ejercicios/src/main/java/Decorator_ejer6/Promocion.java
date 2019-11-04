package Decorator_ejer6;

import java.util.Random;

public class Promocion extends Decorator {

	public Promocion(IBanco componente) {
		super(componente);
	}

	public void operation() {
		super.operation();
		Random rnd = new Random();
		int res = rnd.nextInt(2) + 1;
		System.out.println("Monto: " + getMonto());
		if (res % 2 == 0) {

			setMonto(getMonto() * 2);
			System.out.println("Monto duplicado " + getMonto());
		} else {
			System.out.println("No suerte ");
		}
	}
}
