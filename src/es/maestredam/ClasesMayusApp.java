package es.maestredam;

public class ClasesMayusApp {
	//escribe la letra dada en parametro en mayuscula
	public static void pasarMayus(char letra){
		System.out.println(Character.toUpperCase(letra));
	}
	//escribe la letra dada en parametro en minuscula
	public static void pasarMinus(char letra){
		System.out.println(Character.toLowerCase(letra));
	}
	//escribe una serie de números dados en parametros
	public static void serieNum(int primnum,int segnum){
		while(primnum<=segnum) {
			System.out.print(primnum+" ");
			primnum++;
		}
	}
	//hacer una app que los use
	public static void main(String[] args) {
		
	char letraMay='a';
	pasarMayus(letraMay);
	pasarMayus('e');
	pasarMayus('z');
	pasarMayus('i');
		
	char letraMin='A';
	pasarMinus(letraMin);
	pasarMinus('G');
	pasarMinus('D');
	pasarMinus('O');
	
	int primnum=7;
	int segnum=9;
	serieNum(primnum,segnum);
	System.out.println();
	serieNum(10,12);
	System.out.println();
	serieNum(1,9);	
	}
	
}
