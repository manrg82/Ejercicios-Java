package es.maestredam.ejercicios;

import java.util.Scanner;

public class Ej11App {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);
		int adiv = tecla.nextInt();
		int intentos = 0;
		final int CLAVE = 9;
		boolean adivina = false;
		while(adivina=false && intentos<3){
			if(adiv!=CLAVE){
				System.out.println("Error, intenta de nuevo");
				adiv = tecla.nextInt();
			}else if (adiv==CLAVE) {
				adivina=true;
			}
			intentos++;
		}
		tecla.close();
		if (adivina=true) {
			System.out.println("Correcto!");
		}else {
			System.out.println("Demasiados intentos!");
		}
	}

}
