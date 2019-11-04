package Composite_cinco;

public class Computadora extends Component {
	public Computadora(String nombre) {
		super(nombre);
	}

	@Override
	public void print() {
	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Product");
	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Procut");
	}

}
