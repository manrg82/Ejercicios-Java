package es.maestredam.ejercicios;

import java.util.Scanner;

/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class Ej6App {
	/**
	 * Main
	 * @param args command-line arguments (not used yet)
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num = teclado.nextInt();
		teclado.close();
		int cont = 1;
		while (cont <= num) {
				System.out.println(cont);
				cont = cont+3;
		}
		
		
		
		
		
	}

}
