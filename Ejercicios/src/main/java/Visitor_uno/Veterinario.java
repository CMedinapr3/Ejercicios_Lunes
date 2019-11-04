package Visitor_uno;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Veterinario implements IVisitor {
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	Date date = new Date();

	Calendar fecha = new GregorianCalendar();
	int año = fecha.get(Calendar.YEAR);
	int mes = fecha.get(Calendar.MONTH);
	int dia = fecha.get(Calendar.DAY_OF_MONTH);

	@Override
	public String visit(Perro perro) {
		System.out.println("Recetando amoxicilina al perro con la enfermedad: " + perro.getEnfermedad() + " a las: "
				+ dateFormat.format(date) + " el dia: " + dia + "/" + (mes + 1) + "/" + año);
		return "";
	}

	@Override
	public String visit(Gato gato) {
		System.out.println("Recetando paracetamol al gato con la enfermedad: " + gato.getEnfermedad() + " a las: "
				+ dateFormat.format(date) + " el dia: " + dia + "/" + (mes + 1) + "/" + año);
		return "";

	}

	@Override
	public String visit(Caballo caballo) {
		System.out.println("Recetando niofen al caballo con la enfermedad: " + caballo.getEnfermedad() + " a las: "
				+ dateFormat.format(date) + " el dia: " + dia + "/" + (mes + 1) + "/" + año);
		return "";

	}
}
