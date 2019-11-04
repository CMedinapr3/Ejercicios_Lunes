package Proxy_ejer4;


public class Client {

    public static void main (String [] args){
        IServidor proxy = new Proxy(new Servidor());

        proxy.carga("UNO",enumTipo.ZIP);
        proxy.descarga();
        proxy.carga("DOS",enumTipo.RAR);
        proxy.descarga();
        proxy.carga("TRES",null);
        proxy.descarga();

    }
}