package ejsArrays1D;

public class pruebaArraysApp {	
	public static void main(String[] args) {
		char[] vocales= {'a','e','i','o','u'};
		final int TEMAS=10;
		final int NUM_ALUMNOS=5;
		int[]notas=new int[NUM_ALUMNOS+2];
		System.out.printf("%c%n",vocales[0]);
		System.out.printf("%c%n",vocales[vocales.length-1]);
		System.out.printf("La vocal central es la %c%n",vocales[vocales.length/2]);
		boolean[] inscritos= {false,true,true,false,false,false};
		inscritos[0]=true;
		inscritos[inscritos.length-1]=false;
		for(int i=0;i<vocales.length;i++) {
			System.out.println(vocales[i]);
		}
		
		//contar cuantos inscritos hay
		int cantalum=0;
		for(int i=0;i<notas.length;i++) {
			cantalum++;
		}
		System.out.println("Hay "+cantalum+" alumnos");
		//poner todas las notas a 10
		for(int i=0;i<notas.length;i++) {
			notas[i]=10;
		}
		//poner un 5 al del medio
		notas[notas.length/2]=5;
		System.out.println("el de el medio tiene un "+notas[notas.length/2]);
		//comparar el array vocales con el siguiente
		char[] otro= {'a','e','i','O','u'};
		boolean distintos=false;
		for(int i=0;i<vocales.length&& !distintos;i++) {
			if (vocales[i]!=otro[i]) {
				distintos=true;
			}
		}
		if (distintos==true) {
			System.out.println("Son distintos");
		}else {
			System.out.println("Son iguales");
		}
		
		//calcular la media aritmetica de las notas
		int totnota=0;
		for(int i=0;i<notas.length;i++) {
			totnota=totnota+notas[i];
		}
		double media=(double)totnota/notas.length;
		System.out.printf("La media es %.2f%n",media);
		//inscribir a los que no lo estaban ya
		for(int i=0;i<inscritos.length;i++) {
			if (!inscritos[i]) {
				System.out.printf("inscribo al %d%n",i);
				inscritos[i]=true;
			}
			System.out.println(inscritos[i]);
		}
		//copiar array notas en otro
		int copianotas[]=new int[notas.length];
		for(int i=0;i<notas.length;i++) {
			copianotas[i]=notas[i];
		}
		//hacer que notas crezca hasta 10
		int notasnuevo[]=new int[10];
		for(int i=0;i<notas.length;i++) {
			notasnuevo[i]=notas[i];
		}
		notas=notasnuevo;
		for(int i=0;i<notas.length;i++) {
			System.out.println(notas[i]);
		}	
		
	}

}
