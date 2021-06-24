package soluciontecnologica;
import java.util.Scanner;
/**
 * Clase para el registro de visita en terreno
 * @author The Bubble
 * @version 1.0
 */
public class VisitaEnTerreno {
	/**
	 * Atributos que definen la clase
	 */
	private int id; // Obligatorio
	private String rutCliente; // Obligatorio
	private String dia;
	private int hora; // HH
	private int minutos; // MM
	private String lugar; // Obligatorio
	private String comentarios;
	
	/**
	 * Constructor vacío o por defecto
	 */
	public VisitaEnTerreno() {
		
	}

	/**
	 * Constructor con entrada de datos
	 * @param id de la visita en terreno
	 * @param rutCliente de la visita en terreno
	 * @param dia de la visita en terreno
	 * @param hora de la visita en terreno
	 * @param lugar de la visita en terreno
	 * @param comentarios de la visita en terreno
	 */
	public VisitaEnTerreno(int id, String rutCliente, String dia, int hora,
			int minutos, String lugar, String comentarios) {
		super();
		this.id = id;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.minutos = minutos;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public int getHora() {
		return hora;
	}
	
	public int getMinutos() {
		return minutos;
	}

	public String getLugar() {
		return lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
		while (this.rutCliente.isEmpty() || this.rutCliente.isBlank()) {
			this.rutCliente = leerString("Ingrese un rut válido");
		}
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora(int hora) {
		this.hora = hora;
		while (this.hora > 23) {
			this.hora = leerInt("Ingrese un valor de 0 a 23");
		}
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
		while (this.minutos > 59) {
			this.minutos = leerInt("Ingrese un valor de 0 a 59");			
		}
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
		while (this.lugar.isEmpty() || this.lugar.isBlank()
			|| this.lugar.length() < 10 || this.lugar.length() > 50) {
			this.lugar = leerString("Este campo es obligatorio, mínimo 10 y"
					+ " máximo 50 caracteres");
		}
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
		while (this.comentarios.length() > 100) {
			this.comentarios = leerString("Ingrese máximo 100 caracteres");
		}
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "VisitaEnTerreno [id=" + id + ", rutCliente=" + rutCliente
			+ ", dia=" + dia + ", hora=" + hora + ", minutos=" + minutos
			+ ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
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
