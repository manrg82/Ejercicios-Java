package es.maestredam.ejercicios;
import java.util.Scanner;
/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class Ej4App {
	public static void main(String[] args) {
		System.out.println("teclea un número:");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		int num2 = teclado.nextInt();
		int num3 = teclado.nextInt();
		teclado.close();
		if (num == num2 || num == num3) {
			System.out.println("Dos o mas números son iguales");
		}
		else if (num > num2 && num > num3) {
			System.out.println(num+" es el mas grande");
		}
		else if (num2 > num && num2 > num3) {
			System.out.println(num2+" es el mas grande");
		}
		else {
			System.out.println(num3+" es el mas grande");
		}
	}
}		