package ejsArrays1D;

import java.util.Scanner;

public class EjemploArrayStringApp {

	public static void main(String[] args) {
		//array basicos: int, bool, doub, etc
		//todos los elementos han de ser del mimo tipo
		int num=0;
		String arce="arce";
		//array int
		int[] listaNumeros=new int[10];
		//array de strings
		String[] listaArboles=new String[4];
		listaArboles[0]=new String("abedul");//hay que inicializar cada objeto en su asignación a un puesto del array
		listaArboles[1]="olmo";//string es el unico que se puede asignar de esta manera simple
		listaArboles[2]=listaArboles[0];//apunta al sitio 0 de la cadena
		listaArboles[3]=arce;
		
		for (int i=0;i<listaArboles.length;i++) {
			System.out.println(listaArboles[i]);
			System.out.println(listaArboles[i].toUpperCase());
		}
		listaArboles[2]=listaArboles[2].replace('a','-');
		System.out.println(listaArboles[2]);
		String[] palabras={"manzana","pera","platano"};
		for (int i=0;i<10;i++) {
			double azar=Math.random()*palabras.length;
			System.out.println(palabras[(int)azar]);
		}
		
		//ej1 extraer un azar pero que tenga un numero minimo de caracteres
		double azar1=Math.random()*palabras.length;
		
		
		
		
		//ej2 crear una lista de 4 preguntas y 4 respuestas, extraer pregunta al azar y leer respuesta del usuario, si no acierta mostrar respuesta
		String preg[]=new String[4];
		preg[0]="Cual es la capital de Suecia?";
		preg[1]="De que color es una naranja?";
		preg[2]="En que año acabó la guerra civil?";
		preg[3]="Cuantas horas dura un dia?";
		String resp[]=new String[4];
		resp[0]="estocolmo";
		resp[1]="naranja";
		resp[2]="1939";
		resp[3]="24";
		Scanner tec=new Scanner(System.in);
			double azar=Math.random()*preg.length;
			System.out.println(preg[(int)azar]);
			String respUser=tec.nextLine().toLowerCase().trim();
			if (respUser.equals(resp[(int)azar])) {
				System.out.println("Es Correcto!");
			}else {
				System.out.println("Respuesta incorrecta, la respuesta correcta es: "+resp[(int)azar]);
			}
		
		
		//ej3 seleccionar palabra al azar crear un array de caracteres del mismo tamaño que la palabra que ha salido. rellenalo con "_" y muestralo en la consola
		
		System.out.println(palabras[(int)azar]);
		String array[]=new String[(palabras[(int)azar].length())];
		for (int i=0;i<array.length;i++) {
			array[i]="_ ";
			for(int j=0;j<palabras[(int)azar].length()-1;j++) {
				array[i]=array[i]+"_ ";
			}
			azar=Math.random()*palabras.length;
		}
		System.out.println(array[0]);
		
		
		
	}

}
