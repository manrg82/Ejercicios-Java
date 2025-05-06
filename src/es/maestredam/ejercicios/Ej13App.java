package es.maestredam.ejercicios;

import java.util.Scanner;

public class Ej13App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = teclado.nextInt();
		teclado.close();
		switch(num) {
	        case 1: System.out.println("Enero");
	        	break;
	        case 2: System.out.println("Febrero");
	    		break;
	        case 3: System.out.println("Marzo");
	    		break;
	        case 4: System.out.println("Abril");
	    		break;
        }
	}
}
