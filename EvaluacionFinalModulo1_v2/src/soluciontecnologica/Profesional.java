package soluciontecnologica;
/**
 * Clase para el registro de usuario perfil Profesional
 * @author The Bubble
 * @version 1.0
 */
public class Profesional extends Usuario {
	/**
	 * Atributos que definen la clase
	 */
	private int aniosExperiencia;
	private String departamento;
	private String titulo;
	private String fechaIngreso;
	
	/**
	 * Constructor vacío o por defecto
	 */
	public Profesional() {
		
	}

	/**
	 * Constructor con entrada de datos
	 * @param aniosExperiencia del profesional
	 * @param departamento del profesional
	 * @param titulo del profesional
	 * @param fechaIngreso del profesional
	 */
	public Profesional(int aniosExperiencia, String departamento,
			String titulo, String fechaIngreso) {
		super();
		this.aniosExperiencia = aniosExperiencia;
		this.departamento = departamento;
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	// Getters and Setters
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
		while (this.aniosExperiencia < 1) {
			this.aniosExperiencia = leerInt("Ingrese un valor mayor a cero");
		}
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
		while (this.departamento.isEmpty() || this.departamento.isBlank()) {
			this.departamento = leerString("Este campo es obligatorio");
		}
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
		while (this.titulo.isEmpty() || this.titulo.isBlank()
				|| this.titulo.length() < 10 || this.titulo.length() > 50) {
			this.titulo = leerString("Este campo es obligatorio,"
					+ " mínimo 10 y máximo 70 caracteres");
		}
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "\nUsuario\nNombre: " + super.getNombre()
				+ "\nFecha de nacimiento: " + super.getFechaNacimiento()
				+ "\nRUN: " + super.getRun() + "\nTipo de usuario: "
				+ super.getTipoUsuario() + "\n[Años de Experiencia: "
				+ aniosExperiencia + ", Departamento: " + departamento
				+ ", Título: " + titulo + ", Fecha de ingreso: "
				+ fechaIngreso + "]";
	}

	/**
	 * Método analizarUsuario
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: " + titulo + ", Fecha de Ingreso: "
		+ fechaIngreso);
	}
}
