package Strings;

public class TransformaCadenaApp {
	public static void main(String[] Args) {
		String texto=new String("Estoy seguro de que el universo está lleno de vida inteligente");
		texto=(texto+" Simplemente ha sido demasiado inteligente como para venir aqui");
		System.out.println(texto.concat("."));
		String univ=texto.substring(texto.indexOf("universo"),(texto.indexOf("universo")+8));
		System.out.println(univ);
		String may=texto.toUpperCase();
		System.out.println(may);
	}
}
