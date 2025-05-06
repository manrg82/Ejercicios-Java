package ejercicios2;

import java.util.Scanner;

public class ClaveAzarApp {

	public static void main(String[] args) {
		for(int i=0;i<8;i++) {
			System.out.print(Letras.generaLetra());
		}
		for(int i=0;i<3;i++) {
			System.out.print(Util.generaNumAleatorio(0,9));
		}
		/*
		Scanner teclado=new Scanner(System.in);
		System.out.println(Letras.generaLetra());
		System.out.println(Letras.generaLetra());
		System.out.println(Letras.generaLetra());
		System.out.println(Util.generaNumAleatorio(34,91));
		System.out.println(Util.generaNumAleatorio(34,91));
		*/
	}

}
