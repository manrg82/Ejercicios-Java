package es.maestredam.ejercicios;

import java.util.Scanner;

public class Ej12App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce el lado del cuadrado: ");
		int cant = teclado.nextInt();
		int cont = 0;
		teclado.close();
		if (cant<3) {
			System.out.print("Error!, no puede ser menor que 3");
			return;
		}
		if(cant>=3) {
				for(int i=0;i!=cant;i++) {
					System.out.print("*");
				}
					System.out.printf("%n");
				do {
					System.out.print("*");
					for (int i=0;i!=(cant-2);i++) {
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.printf("%n");
					cont++;
				}while(cont<cant-2);
					for(int i=0;i!=cant;i++) {
						System.out.print("*");
					}
		}
	}
}
