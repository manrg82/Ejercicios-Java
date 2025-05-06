package es.maestredam.stringbuffer;

import java.util.Scanner;

public class ConcursoApp {
	public static boolean preg1() {
		String ans1=new String("helsinki");//cap finlandia
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cual es la capital de Finlandia?");
		String inp=new String(teclado.nextLine());
		if (inp.strip().toLowerCase()==ans1) {
			return true;
		}else {
			preg1();
		}
		return true;

	}
		
	
	public static void main(String[] args) {
		double numazar=Math.random();
		String ans2=new String("1978");//año const
		String ans3=new String("teide");//pico mas alto de esp
		if (numazar>=0.3) {
			boolean pregu1=preg1();
			if(numazar>=0.5&&pregu1==true) {
				//preg2;
			}else {
				//preg3
			}
		}else if(numazar<=0.6) {
			//preg2
			if(numazar>=0.5) {
				//preg2
			}else {
				//preg3
			}
		}else {
			//preg3
			if(numazar>=0.5) {
				preg1();
			}else {
				//preg2()
			}
		}		
			
		
		
		
	}	
}

