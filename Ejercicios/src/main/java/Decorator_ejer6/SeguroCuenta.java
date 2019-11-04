package Decorator_ejer6;

public class SeguroCuenta extends Decorator {
    private double descuento=27.0;
    public SeguroCuenta(IBanco componente) {
        super(componente);
    }
    public void operation(){
        super.operation();
        System.out.println("Monto: "+getMonto()+" por: " + descuento);
        setMonto(getMonto()-descuento);
        System.out.println("Monto "+descuento+" descuento el seguro de la cuenta ");
    }
}
