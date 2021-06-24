package soluciontecnologica;
import java.util.Scanner;
/**
 * Clase con las opciones de menú
 * @author The Bubble
 * @version 1.0
 */
public class Menu {
	/**
	 * Constructor vacío por defecto
	 */
	public Menu() {
		
	}
	/**
	 * Método para el menú de opciones
	 * @param contenedor es la instancia de la clase Contenedor
	 */
	public void menuPrincipal(Contenedor contenedor) {
		Scanner entrada = new Scanner(System.in);
		// Atributos para el control del bucle
		boolean salir = false;
		int opcion;
		// Ciclo que se muestra hasta que usuario decida salir
		while (!salir) {
			escribir("╔══════════════════════════════════════╗ \n"
					+"║           MENÚ DE OPCIONES           ║ \n"
					+"╚══════════════════════════════════════╝ ");
			escribir("1) Ingresar usuario tipo cliente");
			escribir("2) Ingresar usuario tipo profesional");
			escribir("3) Ingresar usuario tipo administrativo");
			escribir("4) Ingresar una capacitación");
			escribir("5) Eliminar un usuario");
			escribir("6) Listar total de usuarios");
			escribir("7) Listar usuarios por tipo");
			escribir("8) Listar capacitaciones");
			escribir("9) Salir");
			escribir("\nIngrese número según opción requerida:");
				opcion = entrada.nextInt();
				switch (opcion) {
					case 1:
						contenedor.almacenarCliente();
						break;
					case 2:
						contenedor.almacenarProfesional();
						break;
					case 3:
						contenedor.almacenarAdministrativo();
						break;
					case 4:
						contenedor.almacenarCapacitacion();
						break;
					case 5:
						contenedor.eliminarUsuario();
						break;
					case 6:
						contenedor.listarUsuarios();
						break;
					case 7:
						contenedor.listarUsuariosTipo();
						break;
					case 8:
						contenedor.listarCapacitaciones();
						break;
					case 9:
						salir = true;
						escribir("╔══════════════════════════════════════╗ \n"
								+"║      EL PROGRAMA HA FINALIZADO       ║ \n"
								+"╚══════════════════════════════════════╝ ");
						break;
					default:
						escribir("Ingrese una opción válida por favor");
				} // end switch
		} // end while
	}
	
	/**
	 * Método que muestra mensaje en pantalla
	 * @param mensaje que será mostrado
	 */
	public static void escribir(String mensaje) {
		System.out.println(mensaje);
	}
}
