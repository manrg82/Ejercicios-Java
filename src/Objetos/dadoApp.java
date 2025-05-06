package Objetos;

public class dadoApp {

	public static void main(String[] args) {
		Dado d1=new Dado(5);
		int valor=d1.getUltimaTirada();
		if(valor==d1.NO_HAY_TIRADAS) {
			System.out.println("No has tirado!");
		}
		//ej1
		boolean interruptor=false;
		for (int i=0;!interruptor;i++) {
			int numero=d1.tirar();
			System.out.println("El dado "+(i+1)+" es: "+numero);
			if(numero==5) {
				interruptor=true;
			}
		}
		System.out.println("");
		//ej2
		Dado d2=new Dado(12);
		for (int i=0;i<10;i++) {
			int numero2=d2.tirar();
			System.out.println("El dado "+(i+1)+" es: "+numero2);
		}
		
	}

}
