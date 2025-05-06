package ejercicios2;
import java.util.Scanner;
public class DibujoApp {

	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		System.out.println("Introduce el numero de caracteres:");
		int num=teclado.nextInt();
		System.out.println("Introduce el caracter:");
		char car=teclado.next().charAt(0);
		System.out.printf("Elige una opción:%n1)Linea%n2)Cuadrado%n3)Piramide%n4)Rombo");
		
		int opcion=teclado.nextInt();
		switch(opcion) {
    	case 1->{
    		Dibujo.pintaLinea(num,car);
    	}
    	case 2->{
    		Dibujo.pintaCuadrado(num,car);        		
    	}
    	case 3->{
    		System.out.printf("Elige una opción:%n1)Piramide normal%n2)Piramide Invertida%n");
    		int opcion2=teclado.nextInt();
    		switch(opcion2) {
	    		case 1->{
	    			Dibujo.pintaPiramide(num, car);
	    		}
	    		case 2->{
	    			Dibujo.pintaPiramideInver(num,car);
	    		}
	    		default->{
	        		System.out.printf("%c no es una de las opcione en el rango%n",opcion2);
	        	}
    		}
    	}
    	case 4->{
    		Dibujo.pintaRombo(num,car);        		
    	}
    	default->{
    		System.out.printf("%c no es una de las opcione en el rango%n",opcion);
    	}
    }
		
		
	}

}
