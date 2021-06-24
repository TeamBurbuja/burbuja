package soluciontecnologica;
/**
 * Clase para el registro de usuario perfil Administrativo
 * @author The Bubble
 * @version 1.0
 */
public class Administrativo extends Usuario {
	/**
	 * Atributos que definen la clase
	 */
	private String nombreSuperior;
	private String area;
	private String expPrevia;
	private String funcion;
	
	/**
	 * Constructor vacío o por defecto
	 */
	public Administrativo() {
		
	}

	/**
	 * Constructor con entrada de datos
	 * @param nombreSuperior del administrativo
	 * @param area del administrativo
	 * @param expPrevia del administrativo
	 * @param funcion del administrativo
	 */
	public Administrativo(String nombreSuperior, String area, String expPrevia,
			String funcion) {
		super();
		this.nombreSuperior = nombreSuperior;
		this.area = area;
		this.expPrevia = expPrevia;
		this.funcion = funcion;
	}

	// Getters and Setters
	public String getNombreSuperior() {
		return nombreSuperior;
	}

	public String getArea() {
		return area;
	}

	public String getExpPrevia() {
		return expPrevia;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setNombreSuperior(String nombreSuperior) {
		this.nombreSuperior = nombreSuperior;
	}

	public void setArea(String area) {
		this.area = area;
		while (this.area.isEmpty() || this.area.isBlank()
			|| this.area.length() < 5 || this.area.length() > 20) {
			this.area = leerString("Este campo es obligatorio, mínimo 5 y"
					+ " máximo 20 caracteres");
		}
	}

	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
		while (this.expPrevia.length() > 100) {
			this.expPrevia = leerString("Ingrese máximo 100 caracteres");
		}
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "\nUsuario\nNombre: " + super.getNombre()
				+ "\nFecha de nacimiento: " + super.getFechaNacimiento()
				+ "\nRUN: " + super.getRun() + "\nTipo de usuario: "
				+ super.getTipoUsuario()  + "\n[Nombre de superior: "
				+ nombreSuperior + ", Área: " + area + ", Experiencia Previa: "
				+ expPrevia + ", Función: " + funcion + "]";
	}

	/**
	 * Método analizarUsuario
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: " + area + ", Experiencia Previa: "
		+ expPrevia);
	}
}
