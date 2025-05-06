package es.maestredam.stringbuffer;

import java.util.Scanner;

public class NumBaseApp {


	public static void main(String []Args) {
		Scanner t=new Scanner(System.in);
		System.out.printf("Escribe un numero decimal: ");
		System.out.printf("Tu numero en decimal es: "+NumerosUtil.decToBin(t.nextInt())+"%n");
		for(int i=0;i<255;i++) {
			StringBuffer num=new StringBuffer(i);
			System.out.printf(i+"||");
			System.out.printf(NumerosUtil.binToDec(num)+"%n");
		}
		System.out.println(CadenasUtil.getCountLetters("12"));
		
	}

}
