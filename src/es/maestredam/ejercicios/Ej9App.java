package es.maestredam.ejercicios;
import java.util.Scanner;
/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class Ej9App {
	/**
	 * Main
	 * @param args command-line arguments (not used yet)
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num = teclado.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		while(fib2<=num) {
			System.out.println(fib1);
			fib1 = fib1 + fib2;
			if (fib2<=num) {
				System.out.println(fib2);
				fib2 = fib2 + fib1;
			}
		}
	}
}