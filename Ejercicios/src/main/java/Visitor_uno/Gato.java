package Visitor_uno;

public class Gato implements Animal {
	private String enfermedad = "sarna";

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
