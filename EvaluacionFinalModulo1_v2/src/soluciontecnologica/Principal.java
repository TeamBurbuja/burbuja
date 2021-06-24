package soluciontecnologica;
/**
 * Clase principal para la ejecucuión del proyecto
 * @author The Bubble
 * @version 1.0
 */
public class Principal {
	
	public static void main(String[] args) {
		/**
		 * Instancia de objeto contendor
		 */
		Contenedor contenedor = new Contenedor();
		
		/**
		 * Instancia de objeto menu
		 */
		Menu menu = new Menu();
		menu.menuPrincipal(contenedor);
		
	} // End main
}
