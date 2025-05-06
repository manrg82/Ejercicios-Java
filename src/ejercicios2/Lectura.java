package ejercicios2;

import java.util.Scanner;

public class Lectura {
	public static int leeNumPos() {
		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			num=teclado.nextInt();	
		}while(num<0);
		return num;
	}
	public static char leeVocal() {
		Scanner teclado = new Scanner(System.in);		
		char voc=teclado.next().charAt(0);
		while(voc!='a'||voc!='e'||voc!='i'||voc!='o'||voc!='u') {
			while(voc=='a'||voc=='e'||voc=='i'||voc=='o'||voc=='u') {
				return voc;
			}
			voc=teclado.next().charAt(0);
		}
		System.out.println("Traza2");
		return voc;
	}
	public static int leeNumRango(int min, int max) {
		Scanner teclado = new Scanner(System.in);
		int num=teclado.nextInt();
		while(num>max||num<min) {
			num=teclado.nextInt();
		}
		return num;
	}
	
}
