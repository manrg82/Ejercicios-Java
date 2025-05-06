package Strings;

import java.util.Scanner;

public class DivideCadenaApp {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		String pal=new String(tec.next());
		String mit1=pal.substring(0,(pal.length()/2));
		String mit2=pal.substring((pal.length()/2),pal.length());
		System.out.print(mit1+" | "+mit2);
		
	}

}
