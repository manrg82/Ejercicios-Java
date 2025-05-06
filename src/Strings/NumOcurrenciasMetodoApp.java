package Strings;

public class NumOcurrenciasMetodoApp {

	public static int cantLetra(String texto,String car) {
		int cant=0;
		for(int i=0;i<texto.length();i++) {
			if(texto.substring(i,i+1).equals(car)){
				cant++;
			}
		}
		return cant;
	}
	
	public static void main(String[] args) {
		String texto=new String("Lo mejor de los booleanos es que si te equivocas estás a un sólo bit de la solución correcta");
		int canta=cantLetra(texto,"a");
		int cante=cantLetra(texto,"e");
		int canti=cantLetra(texto,"i");
		int canto=cantLetra(texto,"o");
		int cantu=cantLetra(texto,"u");
		if(canta>5) {
			System.out.println("La letra a aparece "+canta+" veces. Exceso de a");
		}else {
			System.out.println("La letra a aparece "+canta+" veces");
		}
		if(cante>5) {
			System.out.println("La letra e aparece "+cante+" veces. Exceso de e");
		}else {
			System.out.println("La letra e aparece "+cante+" veces");
		}
		if(canti>5) {
			System.out.println("La letra i aparece "+canti+" veces. Exceso de i");
		}else {
			System.out.println("La letra i aparece "+canti+" veces");
		}
		if(canto>5) {
			System.out.println("La letra o aparece "+canto+" veces. Exceso de o");
		}else {
			System.out.println("La letra o aparece "+canto+" veces");
		}
		if(cantu>5) {
			System.out.println("La letra u aparece "+cantu+" veces. Exceso de u");
		}else {
			System.out.println("La letra u aparece "+cantu+" veces");
		}
		
	}

}
