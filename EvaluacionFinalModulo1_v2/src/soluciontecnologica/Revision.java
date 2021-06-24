package soluciontecnologica;
import java.util.Scanner;
/**
 * Clase para el registro de la Revisión
 * @author The Bubble
 * @version 1.0
 */
public class Revision {
	/**
	 * Atributos que definen la clase
	 */
	private String idRevision; // Obligatorio
	private String idVisita; // Obligatorio
	private String nombreRevision; // Obligatorio
	private String detalleRevision;
	private String estadoRevision;

	/**
	 * Constructor vacío o por defecto
	 */
	public Revision() {
		
	}

	/**
	 * Constructor con entrada de datos
	 * @param idRevision de la revisión
	 * @param idVisita de la revisión
	 * @param nombreRevision de la revisión
	 * @param detalleRevision de la revisión
	 * @param estadoRevision de la revisión
	 */
	public Revision(String idRevision, String idVisita, String nombreRevision,
			String detalleRevision, String estadoRevision) {
		super();
		this.idRevision = idRevision;
		this.idVisita = idVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estadoRevision = estadoRevision;
	}

	// Getters and Setters
	public String getIdRevision() {
		return idRevision;
	}

	public String getIdVisita() {
		return idVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public String getEstadoRevision() {
		return estadoRevision;
	}

	public void setIdRevision(String idRevision) {
		this.idRevision = idRevision;
		while (this.idRevision.isEmpty() || this.idRevision.isBlank()) {
			this.idRevision = leerString("Este campo es obligatorio");
		}
	}

	public void setIdVisita(String idVisita) {
		this.idVisita = idVisita;
		while (this.idVisita.isEmpty() || this.idVisita.isBlank()) {
			this.idVisita = leerString("Este campo es obligatorio");
		}
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
		while (this.nombreRevision.isEmpty() || this.nombreRevision.isBlank()
				|| this.nombreRevision.length() < 10
				|| this.nombreRevision.length() > 50) {
			this.nombreRevision = leerString("Este campo es obligatorio,"
					+ " mínimo 10 y máximo 50 caracteres");
		}
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
		while (this.detalleRevision.length() > 100) {
			this.detalleRevision = leerString("ingrese máximo 100 caracteres");
		}
	}

	public void setEstadoRevision(String estadoRevision) {
		this.estadoRevision = estadoRevision;
		if (this.estadoRevision.equals("1")) {
			this.estadoRevision = "Sin problemas";
		} else if (this.estadoRevision.equals("2")) {
			this.estadoRevision = "Con observaciones";
		} else if (this.estadoRevision.equals("3")) {
			this.estadoRevision = "No aprueba";
		} else {
			escribir("El valor ingresado es incorrecto");
		}
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita
				+ ", nombreRevision=" + nombreRevision + ", detalleRevision="
				+ detalleRevision + ", estadoRevision=" + estadoRevision + "]";
	}
	
	/**
	 * Método para lectura datos tipo String
	 * @param mensaje que recibe para ser mostrado
	 * @return dato ingresado por el usuario
	 */
	public static String leerString(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		String dato = entrada.nextLine();
		return dato;
	}
	
	/**
	 * Método para lectura datos tipo int
	 * @param mensaje que recibe para ser mostrado
	 * @return dato ingresado por el usuario
	 */
	public static int leerInt(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		int dato = entrada.nextInt();
		return dato;
	}
	
	/**
	 * Método que muestra mensaje en pantalla
	 * @param mensaje que será mostrado
	 */
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
}
