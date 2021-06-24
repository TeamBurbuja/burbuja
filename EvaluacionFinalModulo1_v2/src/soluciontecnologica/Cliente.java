package soluciontecnologica;
/**
 * Clase para el registro de usuario perfil Cliente
 * @author The Bubble
 * @version 1.0
 */
public class Cliente extends Usuario {
	/**
	 * Atributos que definen la clase
	 */
	private int rut;
	private String direccion;
	private String comuna;
	private int cantidadEmpleados;
	private String telefono;
	private String razonSocial;
	
	/**
	 * Constructor vacío o por defecto
	 */
	public Cliente() {
		
	}

	/**
	 * Constructor con datos de entrada
	 * @param rut del cliente
	 * @param direccion del cliente
	 * @param comuna del cliente
	 * @param cantidadEmpleados del cliente
	 * @param telefono del cliente
	 * @param razonSocial del cliente
	 */
	public Cliente(int rut, String direccion, String comuna,
			int cantidadEmpleados, String telefono, String razonSocial) {
		super();
		this.rut = rut;
		this.direccion = direccion;
		this.comuna = comuna;
		this.cantidadEmpleados = cantidadEmpleados;
		this.telefono = telefono;
		this.razonSocial = razonSocial;
	}

	// Getters and Setters
	public int getRut() {
		return rut;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRut(int rut) {
		this.rut = rut;
		while (this.rut > 99999999) {
			this.rut = leerInt("Ingrese un run válido por favor");
		}
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
		while (this.direccion.length() > 70) {
			this.direccion = leerString("Ingrese máximo 70 caracteres");
		}
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
		while (this.comuna.length() > 50) {
			this.comuna = leerString("Ingrese máximo 50 caracteres");
		}
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
		while (this.cantidadEmpleados < 1) {
			this.cantidadEmpleados = leerInt("Ingresa un valor mayor a cero");
		}
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
		while (this.telefono.isEmpty() || this.telefono.isBlank()) {
			this.telefono = leerString("Este campo es obligatorio");
		}
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
		while (this.razonSocial.length() > 50) {
			this.razonSocial = leerString("Ingrese máximo 50 caracteres");
		}
	}

	/**
	 * Método obtenerNombre
	 * @return nombre de la razón social del cliente
	 */
	public String obtenerNombre() {
		return razonSocial;
	}
	
	/**
	 * Método obtenerNombreUsuario
	 * @return nombre del usuario
	 */
	public String obtenerNombreUsuario() {
		return this.getNombre();
	}
	
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "\nUsuario\nNombre: " + super.getNombre()
				+ "\nFecha de nacimiento: " + super.getFechaNacimiento()
				+ "\nRUN: " + super.getRun() + "\nTipo de usuario: "
				+ super.getTipoUsuario() + "\n[Rut: " + rut + ", Dirección: "
				+ direccion + ", Comuna: " + comuna + ", Cantidad de empleados: "
				+ cantidadEmpleados + ", Telefono: " + telefono
				+ ", RazonSocial: " + razonSocial + "]";
	}

	/**
	 * Método analizarUsuario
	 */
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección: " + direccion + ", Comuna: " + comuna);
	}
}
