package Decorator_ejer6;

public class Client {
    public static void main(String[] args) {
        IBanco banco = new Banco("Uno",2000);
        banco = new BancoPorInternet(banco);
        banco = new SeguroCuenta(banco);
        banco = new Promocion(banco);

        banco.operation();


    }
}