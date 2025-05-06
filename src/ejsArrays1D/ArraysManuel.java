package ejsArrays1D;

import java.util.Arrays;

public class ArraysManuel {
	//metodos que no modifican el array
	public static int[] copyOf(int[] lista) {
		int copialista[]=new int[lista.length];
		for(int i=0;i<lista.length;i++) {
			copialista[i]=lista[i];
		}
		return copialista;
	}
	public static double calcMediaAritmetica(int[] lista) {
		double media=0.0;
		for(int i=0;i<lista.length;i++) {
			media=media+lista[i];
		}
		return media/lista.length;
	}
	//metodos que si modifican el array
	public static void inc(int[] lista,int val) {//inc en x cada elemento del array
		/**
		 * Incrementa todas las posiciones del array dado con el entero dado
		 * @param lista es el array el cual va a ser incrementado 
		 * @param val es el entero con el cual se va a incrementar cada posición el array
		 */
		for (int i=0;i<lista.length;i++) {
			lista[i]+=val;
		}
	}
	public static void inc(int[] lista) {//inc en 1 cada elemento del array
		/**
		 * Incrementa en 1 el array dado
		 * @param lista es el array el cual va a ser incrementado 
		 */
		for (int i=0;i<lista.length;i++) {
			lista[i]++;
		}
//also		inc(lista[],1);
	}
	public static void fill(int[] lista, int val) {
		/**
		 * Rellena un array de enteros con un entero dado
		 * @param lista es el array el cual se va a rellenar
		 * @param val es el entero con el cual se va a rellenar el array
		 */
		for (int i=0;i<lista.length;i++) {
			lista[i]=val;
		}
	}
	public static void fill(String nombresPista, String string) {
		/**
		 * Rellena un array de enteros con un entero dado
		 * @param lista es el array el cual se va a rellenar
		 * @param val es el entero con el cual se va a rellenar el array
		 */
		for (int i=0;i<nombresPista.length();i++) {
			nombresPista=string;
		}
	}
	public static void fill(String[] lista, String val) {
		/**
		 * Rellena un array de Strings con un String dado
		 * @param lista es el array el cual se va a rellenar
		 * @param val es el String con el cual se va a rellenar el array
		 */
		for (int i=0;i<lista.length;i++) {
			lista[i]=val;
		}
	}
	public static int search(int[] lista, int valor) {
		/**
		 * Busca un valor dentro de un array de valores
		 * @param lista[] es el array de valores donde se va a buscar el valor pedido
		 * @param valor es el valora buscar
		 * @return devuelve la pos en la cual se ha encontrado el valor, si no se encuentra devuelve -1
		 */
		int pos=-1;
		for (int i=0;i<lista.length;i++) {
			if(lista[i]==valor) {
				pos=i;
				return pos;
			}
		}
		return pos;
	}
	public static int[] getRandomList(int min, int max, int cant) {
		int[]array=new int[cant];
		int numrand=(int)(Math.random()*(max-min))+min;
		for (int i=0;i<array.length;i++) {
			array[i]=numrand;
			numrand=(int) ((Math.random() * (max - min)) + min);
		}	
		
		return array;
	}
	public static int[] multipleSearch(int[] lista,int valor) {
		int[]array=new int[lista.length];
		int cont=0;
		for (int i=0;i<lista.length;i++) {
			if(lista[i]==valor) {
				array[cont]=i;
				cont++;
			}
		}
		int[]arr2=new int[cont];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=array[i];
		}
		return arr2;
	}
	
	
	public static void main(String[] Args) {
		/*//pruba fill
		int[]numeros= new int[10];
		ArraysManuel.fill(numeros, 82);
		for (int i=0;i<numeros.length;i++) {
			System.out.println("nº"+i+": "+numeros[i]);
		}
		//prueba search
		int[]numeros2={4,7,10,13,7,7};
		int pos=ArraysManuel.search(numeros2, 7);
		if(pos!=-1) {
			System.out.println("Número encontrado en la posición nº "+pos);
		}else {
			System.out.println("Número no encontrado");
		}
		//prueba getRandomList
		int[]rand= {};
		rand=getRandomList(1,10,20);
		for (int i=0;i<rand.length;i++) {
			System.out.println(rand[i]);
		}*/
		//prueba multipleSearch
		int[]numeros2={4,7,10,13,7,7};
		int[]posiciones={};
		posiciones=multipleSearch(numeros2,7);
		for (int i=0;i<posiciones.length;i++) {
			System.out.println(posiciones[i]);
		}
	}
}
