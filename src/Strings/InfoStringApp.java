package Strings;

public class InfoStringApp {

	public static void main(String[] args) {
		String texto=new String("Estoy seguro de que el universo esta lleno de vida inteligente");
		System.out.println("La longitud de texto es: "+texto.length());
		System.out.print("El primer caracter es: "+texto.charAt(0)+".");
		System.out.print("El caracter en la pos 23 es: "+texto.charAt(23)+".");
		System.out.println("El caracter en la pos penultima es: "+texto.charAt(texto.length()-2)+".");
		System.out.println("La pos de la 'y' es la: "+texto.indexOf("y"));
		boolean esE=false;
		//if (texto.charAt(0)=='E') {
		//	esE=true;
		//}else {
		//	esE=false;
		//}
		
		if (texto.startsWith("E")) {
			esE=true;
		}else {
			esE=false;
		}
		System.out.println("¿Es el primer caracter una E? "+esE);
	}

}
