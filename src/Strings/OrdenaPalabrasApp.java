package Strings;

import java.util.Scanner;

public class OrdenaPalabrasApp {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String pal1=new String(teclado.next());
		String pal2=new String(teclado.next());
		if(pal1.compareTo(pal2)<0) {
			System.out.println("En orden "+pal1+" y "+pal2);
		}else if(pal1.compareTo(pal2)>0) {
			System.out.println("En orden "+pal2+" y "+pal1);
		}else {
			System.out.println(pal1+" y "+pal2+" son iguales.");
		}
	}

}