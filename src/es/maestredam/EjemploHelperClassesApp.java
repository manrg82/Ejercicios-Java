package es.maestredam;

import javax.swing.JOptionPane;

/**
 * Aplicación de ejemplo que usa metodos (subprogramas) de clases
 * del API de Java. Concretamente son los "Helper classes" o clases de utilidad"
 * @author manuelruiz
 * @version 1.0
 */
public class EjemploHelperClassesApp {
	/**
	 * Main
	 * @param args command-line arguments (not used yet)
	 */
	public static void main(String[] args) {
		/*double sqrt(double a)*/
		//si el metodo es static (helper class) se le llama con el nombre de la clase y el metodo
		//nombreclase.metodo(parámetros);
		double raiz = Math.sqrt(16.0);
		//las helperclasses tambien pueden tener CONSTANTES (Siempre mayusculas)
		System.out.println(raiz);
		System.out.println(Math.PI+" " +Math.E);
		//lee un número con un cuadro de dialogo gráfico
		String cadena = JOptionPane.showInputDialog("Teclea un número:");
		//ahora lo convierte a un entero
		int numleido = Integer.parseInt(cadena);
		System.out.println("Has escrito "+numleido);
		//mostrar el doble del numero tecleado en pantalla
		JOptionPane.showMessageDialog(
				null, //ventana padre
				"El doble es "+numleido *2, //contenido de la ventana
				"El doble",//titulo de la ventana
				JOptionPane.INFORMATION_MESSAGE);//icono de la ventana
		
	}
}
