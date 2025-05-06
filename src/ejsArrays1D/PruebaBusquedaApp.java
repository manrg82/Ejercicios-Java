package ejsArrays1D;

public class PruebaBusquedaApp {
	public static int buscar(String[] palabras, String palabra) {
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].equals(palabra)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String texto="patata pera manzana  kiwi";
		//extraer cada palabra en una lista con el metodo split de la clase String
		String[] palabras=texto.split("\\s+");//el parametro del metodo es el tipo de caracter que se va a usar como separador
		for (int i=0;i<palabras.length;i++) {
			System.out.println(palabras[i]);
		}
		
		//busqueda secuencial de la palabra "manzana"
		int pos=buscar(palabras,"manzana");
		if(pos==-1) {
			System.out.println("No se ha encontrado");
		}else {
			System.out.println("La posición es: "+pos);
		}
	}

}
