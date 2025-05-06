package es.maestredam;
	public class EjTareaEntornosApp{
		public static void main(String[] args) {
		int a=0;
		final int NUM=5;
		int numero=NUM;
		final int finbucle=2;
		//System.out.println("Antes del bucle");
		while(numero!=finbucle){
			//System.out.printf("Dentro de bucle %d%n",numero);
			a=a*numero-1;
			numero--;
		}
		//System.out.println("Despues del bucle");
		System.out.printf("Factorial de %d = %d%n",a,numero);
	}
}