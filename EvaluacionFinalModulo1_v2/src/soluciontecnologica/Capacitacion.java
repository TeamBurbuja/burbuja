package soluciontecnologica;
import java.util.Scanner;
/**
 * Clase para el registro de la Capacitación
 * @author The Bubble
 * @version 1.0
 */
public class Capacitacion {
	/**
	 * Atributos que definen la clase
	 */
	private String id; // Obligatorio
	private String rutCliente; // Obligatorio
	private String dia;
	private int hora; // HH
	private int minutos; // MM
	private String lugar; // Obligatorio
	private String duracion;
	private String cantidadAsistentes;
	
	/**
	 * Constructor vacío o por defecto
	 */
	public Capacitacion() {
		
	}

	/**
	 * Constructor con entrada de datos
	 * @param id de la capacitación
	 * @param rutCliente de la capacitación
	 * @param dia de la capacitación
	 * @param hora de la capacitación
	 * @param lugar de la capacitación
	 * @param duracion de la capacitación
	 * @param cantidadAsistentes a la capacitación
	 */
	public Capacitacion(String id, String rutCliente, String dia, int hora,
			int minutos, String lugar, String duracion,
			String cantidadAsistentes) {
		super();
		this.id = id;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.minutos = minutos;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}

	// Getters and Setters
	public String getId() {
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

	public String getDuracion() {
		return duracion;
	}

	public String getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
		while (this.rutCliente.isEmpty() || this.rutCliente.isBlank()) {
			this.rutCliente = leerString("Este campo es obligatorio");
		}
	}

	public void setDia(String dia) {
		this.dia = dia.toLowerCase();
		while (!this.dia.equals("lunes") && !this.dia.equals("martes")
			&& !this.dia.equals("miercoles") && !this.dia.equals("miércoles")
			&& !this.dia.equals("jueves") && !this.dia.equals("viernes")
			&& !this.dia.equals("sabado") && !this.dia.equals("sábado")
			&& !this.dia.equals("domingo")) {
			this.dia = leerString("Ingrese un día válido (lunes a domingo)");
		}
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

	public void setDuracion(String duracion) {
		this.duracion = duracion;
		while (this.duracion.length() > 70) {
			this.duracion = leerString("Ingrese máximo 70 caracteres");
		}
	}

	public void setCantidadAsistentes(String cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
			while (this.cantidadAsistentes.isEmpty()
					|| this.cantidadAsistentes.isBlank()) {
				this.cantidadAsistentes = leerString("Este campo es"
						+ " obligatorio: ");
			}
		int valor = Integer.valueOf(this.cantidadAsistentes);
			while (valor > 1000) {
				valor = leerInt("Ingrese un valor menor a 1000");
			}
		this.cantidadAsistentes = String.valueOf(valor);
	}

	/**
	 * Método mostrarDetalle
	 * @return mensaje con el detalle de la capacitación
	 */
	public String mostrarDetalle() {
		return "\nLa capacitación será en " + lugar + " a las " + hora + ":"
				+ minutos + " hrs. del día " + dia + ", y durará " + duracion
				+ " minutos";
	}
	
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "\nCapacitacion\nID: " + id + "\nRUT Cliente: " + rutCliente
				+ "\nDia: " + dia + "\nHora: " + hora + ":"+ minutos + " hrs."
				+ "\nLugar: " + lugar + "\nDuración: " + duracion + " minutos."
				+ "\nCantidad de Asistentes: " + cantidadAsistentes;
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
