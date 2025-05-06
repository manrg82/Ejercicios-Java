package chatbot;

import java.util.Scanner;

public class ChatbotBasicoApp {
	
	public static String getPalabrasClave(String input) {
		String[] inpsep=input.split("\\s+");
		StringBuffer palabraslimpio=new StringBuffer();
		for(int i=0;i<inpsep.length;i++) {
			if(inpsep[i].length()>=3) {
				palabraslimpio.append(inpsep[i]+" ");
			}
		}
		return palabraslimpio.toString();
	}
	
	public static void respuestaBot(String palabras) {
		String[] inpsep=palabras.split("\\s+");
		for(int i=0;i<inpsep.length;i++) {

			if(inpsep[i].equals("fecha")||inpsep[i].equals("dia")) {
				System.out.printf("Hoy es el 13/01/2025%n");
			}
			if(inpsep[i].equals("hora")) {
				System.out.printf("Son las 14:37%n");
			}
		}
	}
	
	public static void principal() {
		boolean sw=false;
		Scanner tec=new Scanner(System.in);
		if(sw=false) {
			System.out.println("Hola, hazme una pregunta! (Si quieres salir escribe un '!'");
			String input=tec.nextLine();
			if(input.equals("!")) {
				sw=true;
			}
			tec.close();
			respuestaBot(getPalabrasClave(input));
			principal();
		}				
				
	}
	 
	public static void main(String[] args) {
		principal();
	}

}
