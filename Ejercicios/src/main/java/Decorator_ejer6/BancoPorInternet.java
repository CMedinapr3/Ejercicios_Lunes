package Decorator_ejer6;

public class BancoPorInternet extends Decorator {
	private boolean enable = false;

	public BancoPorInternet(IBanco componente) {
		super(componente);
	}

	public void operation() {
		super.operation();
		enable = true;
		System.out.println("Por internet: Habilitado ");
	}
}
