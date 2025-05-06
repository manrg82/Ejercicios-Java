package es.maestredam;
import java.util.Scanner;
public class EjemploMetodosApp {
	//metodos que escriben (no devuelven)
	
//   declara que es publico                                             
//	  ||    declara que es estatico             
//	  ||     ||   declara que no devuelve nada (en caso de que si devuelva poner el tipo de valor         
//	  ||     ||    ||    nombre del metodo a declarar con el formato de nombre "primeraSegundaTercera(params);"
//	  ||     ||    ||     ||       
//	  \/     \/    \/     \/   
	public static void pintaLinea(int cantidad,int veces,char simbolo) { //pinta cualquier caracter asignado en simbolo las veces que se le diga
     	int cont=0;
		 while (cont<veces) {
			for(int i=0;i<cantidad;i++) {
	         	System.out.print(simbolo);
	         }
	     	System.out.printf("%n");
	     	cont++;
     	}
     }
	//metodos que calculan (devuelve algo) (importante especificar en el hueco del "void" el tipo de valor que devuelven
	public static int calcularDoble(int numero){ //calcula el doble de un numero
		int result =numero*2;
		return result;
	}
	//metodos que leen
	public static int leerValidarRango(int inf,int sup) {
		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			num=teclado.nextInt();	
		}while(num<=inf||num>=sup);
		teclado.close();
		return num;
	}
	//metodo que calcula el IMC
	/**
	 * Calcula el IMC dados los datos de peso y altura de una persona
	 * @param peso es el peso en kilos
	 * @param altura es la altura en metros
	 * @return es el imc calculado
	 */
	public static double sacarImc(double peso, double altura) {
		double imc =peso/(altura*altura);
		return imc;
	}
	//metodo que comprueba si una hora es correcta
	/**
	 * @param hora
	 * @param min
	 * @param seg
	 * @param tipohora
	 * @return si la hora es verdadera o falsa
	 */
	public static char compHora(int hora,int min,int seg) {
		if(hora<24&&min<60&&seg<60) {
			char tipohora='v';
			return tipohora;
		}else {
			char tipohora='f';
			return tipohora;
		}
	}
	//metodo que dibuja una escalera de asteriscos
	/**
	 * @param cont
	 * @param cant
	 */
	public static void escaleraAst(int cant){
		int cont=0;	
		while (cont<=cant) {
			for(int i=0;i<=cont;i++) {
	         	System.out.print("*");
	         }
			System.out.printf("%n");
			cont++;
		}
	}
	//

	//main
	public static void main(String[] args) {
	/**	
		//metodo que escribe
		pintaLinea(5,4,'#');
		//metodo que devuelve
		int result =calcularDoble(5)+calcularDoble(7);
		if(calcularDoble(7)>13) {
			System.out.printf("%d es mayor que 13%n",result);
		}
		//metodo que lee y devuelve
		System.out.println("Correcto! has tecleado "+leerValidarRango(6,8));
	*/
		
		//metodo que calcula el IMC
			System.out.println("Introduce tu peso en KG y tu altura en metros");
			System.out.println("Tu IMC es "+sacarImc(90,2));
		//metodo que comprueba si una hora es correcta
			System.out.println("Tu hora es "+ compHora(14,47,34));
		//metodo que dibuja una escalera de asteriscos
			escaleraAst(14);
		//
		
		
		
		
	}

}
