package Strings;

public class NumOcurrenciasApp {

	public static void main(String[] args) {
		int canta=0;
		int cantb=0;
		String texto=new String("Lo mejor de los booleanoses que si te equivocas estás a un sólo bit de la solución correcta");
		for(int i=0;i<texto.length();i++) {
			if(texto.substring(i,i+1).equals("a")){
				canta++;
			}
		}
		System.out.println("la letra a aparece "+canta+" veces.");
		for(int i=0;i<texto.length();i++) {
			if(texto.substring(i,i+1).equals("b")){
				cantb++;
			}
		}
		System.out.println("la letra b aparece "+cantb+" veces.");
	}
}
