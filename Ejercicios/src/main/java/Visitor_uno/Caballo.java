package Visitor_uno;

public class Caballo implements Animal {

	private String enfermedad = "catarro";

	public String getEnfermedad() {
		return enfermedad;
	}

	@Override
	public String accept(IVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String enfermedad() {
		return this.getEnfermedad();
	}
}
