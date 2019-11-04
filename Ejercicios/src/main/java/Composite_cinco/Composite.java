package Composite_cinco;

import java.util.ArrayList;

public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();

	public Composite(String attribute) {
		super(attribute);
	}

	@Override
	public void print() {
		for (Component comp : list) {
			this.setPrecio(precio + 100);
			System.out.println("Precio: " + this.getPrecio());
			comp.print();
		}
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

}
