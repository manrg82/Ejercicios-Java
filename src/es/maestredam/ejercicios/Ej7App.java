package es.maestredam.ejercicios;

import java.util.Scanner;

/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class Ej7App {
	/**
	 * Main
	 * @param args command-line arguments (not used yet)
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num2 = teclado.nextInt();
		int cont = 0;
		while (cont<num2) {
			if ((cont%2)==0||(cont%3)==0) {
			System.out.println(cont);
			}
			cont++;
		}
	}
}
