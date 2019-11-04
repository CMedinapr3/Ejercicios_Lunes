package Proxy_ejer4;

public class Proxy implements IServidor {
	private enumTipo tipo;
	private Servidor servidor;
	private Servidor servidorbackup = null;

	public Proxy(Servidor servidor) {

		this.servidor = servidor;
	}

	@Override
	public void descarga() {
		servidor.descarga();
	}

	@Override
	public void carga(String archivo, enumTipo tipo) {
		if (tipo == enumTipo.RAR || tipo == enumTipo.ZIP) {
			servidor.carga(archivo, tipo);
			cloneServidor();
		} else {
			System.out.println("Archivo incompatible ");
		}

	}

	public void cloneServidor() {
		servidorbackup = new Servidor();
		servidorbackup.setArchivo(servidor.getArchivo());
		servidorbackup.setTipo(servidor.getTipo());

	}
}