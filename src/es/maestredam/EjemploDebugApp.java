package es.maestredam;
/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class EjemploDebugApp{
	/**
	 * Método main : punto de entrada de la aplicación.
	 * @param args argumentos de la linea de ordenes (no usados)
	 */
	public static void main(String[] args) {
		int conta=5;
		boolean salir=true;
		while(conta<=5 && salir) {
			System.out.printf("%d ",conta);
			conta++;
		}
		
	}

}
