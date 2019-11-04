package Composite_cinco;

public abstract class Component {
	private String nombre;
	protected int precio = 0;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Component(String nombre) {
		this.nombre = nombre;
	}

	public abstract void print();

	public abstract void add(Component component);

	public abstract void remove(Component component);

}
