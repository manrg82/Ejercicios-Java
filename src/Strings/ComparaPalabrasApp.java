package Strings;

import java.util.Scanner;

public class ComparaPalabrasApp {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String pal1=new String(teclado.next());
		String pal2=new String(teclado.next());
		System.out.println("Tecleadas "+pal1+" y "+pal2);
		if(pal1.equals(pal2)) {
			System.out.println("Son exactamente iguales.");
		}else {
			System.out.println("NO son exactamente iguales.");
		}
		
		if(pal1.length()==pal2.length()) {
			System.out.println("Tienen la misma longitud.");
		}else if(pal1.length()<pal2.length()){
			System.out.println(pal1+" es mas larga que "+pal2);
		}else if(pal1.length()>pal2.length()){
			System.out.println(pal2+" es mas larga que "+pal1);
		}
		
		if(pal1.equalsIgnoreCase(pal2)) {
			System.out.println("Son iguales si ignoramos las mayusculas.");
		}else {
			System.out.println("Aun sin tener en cuenta las mayusculas siguen sin ser iguales.");
		}
	}

}
