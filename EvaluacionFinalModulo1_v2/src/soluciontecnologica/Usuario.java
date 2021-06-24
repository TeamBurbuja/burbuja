package soluciontecnologica;
import java.util.Scanner;
/**
 * Clase que define la super clase Usuario
 * @author The Bubble
 * @version 1.0
 */
public class Usuario implements IAsesoria {
	/**
	 * Atributos que definen la clase
	 */
	private String nombre; // Obligatorio
	private String fechaNacimiento; // Obligatorio
	private int run; 
	private String tipoUsuario; // Obligatorio
	
	/**
	 * Constructor vacío o por defecto
	 */
	public Usuario() {
		
	}
	
	/**
	 * Constructor con entrada de datos
	 * @param nombre del usuario con acceso a la plataforma
	 * @param fechaNacimiento del usuario con acceso a la plataforma
	 * @param run del usuario con acceso a la plataforma
	 * @param tipoUsuario del usuario a registrar
	 */
	public Usuario(String nombre, String fechaNacimiento, int run,
		String tipoUsuario) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
		this.tipoUsuario = tipoUsuario;
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		while (this.nombre.isEmpty() || this.nombre.isBlank()
				|| this.nombre.length() < 5 || this.nombre.length() > 50) {
			this.nombre = leerString("Este campo es obligatorio,"
					+ " mínimo 5 y máximo 50 caracteres");
		}
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		while (this.fechaNacimiento.isEmpty() || this.fechaNacimiento.isBlank()) {
			this.fechaNacimiento = leerString("Este campo es obligatorio");
		}
	}

	public void setRun(int run) {
		this.run = run;
		while (this.run > 99999999) {
			this.run = leerInt("Ingrese un run válido por favor");
		}
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	/**
	 * Método para mostrar edad de Usuario
	 * @return edad del usuario
	 */
	public String mostrarEdad() {
		String[] fecha = fechaNacimiento.split("/"); 
		String anioNacimiento = fecha[2];
		int anioEdad = Integer.valueOf(anioNacimiento);
		int anioActual = 2021;
		int edadFinal = anioActual - anioEdad;
		
		return "El/La usuario/a tiene " + edadFinal + " años";
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Usuario \nNombre: " + nombre + "\nFecha de Nacimiento: "
				+ fechaNacimiento + "\nRun=" + run + "\nTipo de usuario: "
				+ tipoUsuario;
	}

	/**
	 * Método analizarusuario
	 */
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre: " + nombre + ", RUN: " + run);
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
