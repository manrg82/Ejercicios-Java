package ejercicios2;

public class PotenciaBApp {

	public static void main(String[] args) {
		// B)
		System.out.printf("N     N²     N³%n");
		System.out.printf("---------------%n");
		int cont=0;
		for (int i=0;i<100;i++) {
			int cuadrado=Calculador.potencia(cont, 2);
			int cubo=Calculador.potencia(cont,3);
			System.out.printf("%d     %d     %d%n",cont,cuadrado,cubo);
			cont++;
	    }
	}

}

