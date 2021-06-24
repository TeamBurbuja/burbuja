package soluciontecnologica;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase contenedor implementa las listas y métodos de ingreso de datos
 * @author The Bubble
 * @version 1.0
 */
public class Contenedor {
	/**
	 * Atributos que definen la clases
	 */
	private ArrayList<IAsesoria> usuarios = new ArrayList();
	private ArrayList<Capacitacion> capacitaciones = new ArrayList();
	
	Cliente cliente = new Cliente();
	Profesional profesional = new Profesional();
	Administrativo admin = new Administrativo();
	
	private boolean controlCliente = false;
	
	/**
	 * Método para agregar usuarios tipo cliente
	 */
	public void almacenarCliente() {
		cliente = new Cliente();
		cliente.setNombre(leerString("Ingrese nombre de usuario: "));
		cliente.setFechaNacimiento(leerString("Ingrese su fecha de nacimiento:"
				+ " (DD/MM/AAAA)"));
		cliente.setRun(leerInt("Ingrese su RUN: (sin puntos y sin dígito"
				+ " verificador)"));
		cliente.setTipoUsuario("CLIENTE");
		cliente.setRut(leerInt("Ingrese RUT de la empresa: (sin puntos y sin"
				+ " dígito verificador)"));
		cliente.setRazonSocial(leerString("Ingrese razón social: "));
		cliente.setDireccion(leerString("Ingrese Dirección: "));
		cliente.setComuna(leerString("Ingrese comuna: "));
		cliente.setCantidadEmpleados(leerInt("Ingrese cantidad de empleados: "));
		cliente.setTelefono(leerString("Ingrese teléfono: "));
		usuarios.add(cliente);
		controlCliente = true;
	}
	
	/**
	 * Método para agregar usuarios tipo profesional
	 */
	public void almacenarProfesional() {
		profesional = new Profesional();
		profesional.setNombre(leerString("Ingrese nombre de usuario: "));
		profesional.setFechaNacimiento(leerString("Ingrese su fecha de"
				+ " nacimiento:(DD/MM/AAAA)"));
		profesional.setRun(leerInt("Ingrese su RUN: (sin puntos y sin dígito"
				+ " verificador)"));
		profesional.setTipoUsuario("PROFESIONAL");
		profesional.setAniosExperiencia(leerInt("Ingrese años de experiencia"
				+ " previa: "));
		profesional.setDepartamento(leerString("Ingrese departamento: "));
		profesional.setTitulo(leerString("Ingrese título profesional: "));
		profesional.setFechaIngreso(leerString("Ingrese fecha de ingreso:"
				+ "(DD/MM/AAAA)"));
		usuarios.add(profesional);
	}
	
	/**
	 * Método para agregar usuarios tipo administrativo
	 */
	public void almacenarAdministrativo() {
		admin = new Administrativo();
		admin.setNombre(leerString("Ingrese nombre de usuario: "));
		admin.setFechaNacimiento(leerString("Ingrese su fecha de nacimiento:"
				+ " (DD/MM/AAAA)"));
		admin.setRun(leerInt("Ingrese su RUN: (sin puntos y sin dígito"
				+ " verificador)"));
		admin.setTipoUsuario("ADMINISTRATIVO");
		admin.setNombreSuperior(leerString("Ingrese nombre del superior: "));
		admin.setArea(leerString("Ingrese área: "));
		admin.setExpPrevia(leerString("Comente su experiencia previa: "));
		admin.setFuncion(leerString("Ingrese función o cargo: "));
		usuarios.add(admin);
	}
	
	/**
	 * Método para agregar capacitaciones
	 */
	public void almacenarCapacitacion() {
		if (controlCliente == false) {
			escribir("Debes primero crear un cliente");
		} else {
		Capacitacion capacitacion = new Capacitacion();
		capacitacion.setRutCliente(leerString("Ingrese RUT: (sin puntos y"
				+ " sin dígito verificador)"));
		capacitacion.setId(capacitacion.getRutCliente()+"A");
		capacitacion.setDia(leerString("Ingrese día de la semana: "
				+ "(lunes a domingo)"));
		capacitacion.setHora(leerInt("Ingrese hora: (valor de 0 a 23)"));
		capacitacion.setMinutos(leerInt("Ingrese minutos: (valor de 0 a 59)"));
		capacitacion.setLugar(leerString("Ingrese lugar: "));
		capacitacion.setDuracion(leerString("Ingrese duración (minutos): "));
		capacitacion.setCantidadAsistentes(leerString("Ingrese cantidad de"
				+ " asistentes: "));
		capacitaciones.add(capacitacion);
		}
	}
	
	/**
	 * Método para eliminar usuario
	 */
	public void eliminarUsuario() {
		int run =  leerInt("Ingrese run de usuario: (sin puntos y sin"
				+ " dígito verificador)");
		usuarios.removeIf(usuario ->((Usuario) usuario).getRun() == run);
	}
	
	/**
	 * Método para listar la totalidad de usuarios
	 */
	public void listarUsuarios() {
		for (IAsesoria iAsesoria : usuarios) {
			escribir(iAsesoria.toString());
		}
	}
	
	/**
	 * Método para listar usuarios por tipo
	 */
	public void listarUsuariosTipo() {
		String tipoUsuario = leerString("Ingrese número según tipo de"
				+ "usuario:\n1) CLIENTE\n2) PROFESIONAL\n3) ADMINISTRATIVO");
			if (tipoUsuario.equals("1")) {
				for (IAsesoria iAsesoria : usuarios) {
					if (((Usuario)iAsesoria).getTipoUsuario().equals
							("CLIENTE")){
						System.out.println(iAsesoria.toString());
					}
				}
			} else if (tipoUsuario.equals("2")) {
				for (IAsesoria iAsesoria : usuarios) {
					if (((Usuario)iAsesoria).getTipoUsuario().equals
							("PROFESIONAL")){
						System.out.println(iAsesoria.toString());
					}
				}
			} else if (tipoUsuario.equals("3")) {
				for (IAsesoria iAsesoria : usuarios) {
					if (((Usuario)iAsesoria).getTipoUsuario().equals
							("ADMINISTRATIVO")){
						System.out.println(iAsesoria.toString());
					}
				}
			}
	}
	
	/**
	 * Método para listar totalidad de capacitaciones
	 */
	public void listarCapacitaciones() {
		for (Capacitacion iCapacitacion : capacitaciones) {
			escribir(iCapacitacion.toString());
			escribir(iCapacitacion.mostrarDetalle());;
		}
	}
	
	// Método para lectura datos tipo String
	public static String leerString(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		String dato = entrada.nextLine();
		return dato;
	}
	
	// Método para lectura datos tipo int
	public static int leerInt(String mensaje) {
		escribir(mensaje);
		Scanner entrada = new Scanner(System.in);
		int dato = entrada.nextInt();
		return dato;
	}
	
	// Método que muestra mensaje en pantalla
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
}
