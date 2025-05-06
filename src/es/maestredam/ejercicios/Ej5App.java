package es.maestredam.ejercicios;
import java.util.Scanner;
/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class Ej5App {
	public static void main(String[] args){
		System.out.println("Introduce la superficie: ");
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		teclado.close();
		final double Pi = 3.1416;
		double rad = num / Pi;
		System.out.println("El pivote tiene que medir "+rad+"m");
		double longit = 2*Pi*rad;
		System.out.println("Necesitamos "+longit+"m de valla");
	}
}
