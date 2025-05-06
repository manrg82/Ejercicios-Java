package ejsArrays1D;

public class ReferenciasApp {

	public static void main(String[] args) {
		int lista1[]=new int[5];
		lista1[0]=10;
		for(int i=1;i<lista1.length;i++) {
			lista1[i]=lista1[i-1]+10;
		}
		int[] lista2=lista1;
		int[] lista3=new int[5];
		lista1=lista3;
		for(int i=0;i<lista2.length;i++) {
			lista3[i]=lista2[i];
			System.out.println(lista2[i]);
		}
		
		for(int i=0;i<lista3.length;i++) {
			System.out.println(lista3[i]);
		}
		boolean distintos=false;
		for(int i=0;i<lista1.length&& !distintos;i++) {
			if (lista1[i]!=lista3[i]) {
				distintos=true;
			}
		}
		if (distintos==true) {
			System.out.println("Son distintos");
		}else {
			System.out.println("Son iguales");
		}
		
		int totnota=0;
		for(int i=0;i<lista2.length;i++) {
			totnota=totnota+lista1[2];
		}
		double media=(double)totnota/lista1.length;
		System.out.printf("La media es %.0f%n",media);
		
		
	}

}
