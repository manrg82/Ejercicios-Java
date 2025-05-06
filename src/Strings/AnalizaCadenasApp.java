package Strings;

import java.util.Scanner;

public class AnalizaCadenasApp {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String pal=new String(teclado.next());
		if(pal.length()==5) {
			for(int i=0;i<5;i++) {
				if(pal.charAt(i)=='a') {
					System.out.println("Hay una a en la posición "+i);
				}
			}
		}else {
			for(int i=0;i<pal.length();i++) {
				if(pal.charAt(i)=='a') {
					System.out.println("Hay una a en la posición "+i);
				}
			}
		}
		for(int i=0;i<pal.length();i++) {
			if(pal.charAt(i)=='a') {
				System.out.print(pal.charAt(i-1));
				System.out.print("*");
			}
		}
		if(pal.length()%2!=0){
			System.out.print(pal.charAt(pal.length()-1));
		}
	}

}
