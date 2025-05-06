package ejercicios2;
import java.util.Scanner;
public class Dibujo {
	public static void pintaLinea(int numero,char car){
		int num=numero;
		for(int i=0;i<num;i++) {
			System.out.printf(""+car);
		}
	}
	public static void pintaCuadrado(int num,char car) {
		for(int i=0;i<num;i++) {
			pintaLinea(num,car);
		}
	}
	public static void pintaPiramide(int num, char car) {
		int numesp=num+1;
		char esp=' ';
		int numcar=1;
		for(int i=0;i<=num;i++){
			pintaLinea(numesp,esp);
			pintaLinea(numcar,car);
			System.out.printf(" %n");
			numesp--;
			numcar+=2;
			}
	}
			
	public static void pintaPiramideInver(int num, char car) {
		int numesp=1;
		char esp=' ';
		int numcar=(num*2)-1;
		for(int i=0;i<=num;i++){
			pintaLinea(numesp,esp);
			pintaLinea(numcar,car);
			System.out.printf(" %n");
			numesp++;
			numcar-=2;
		}
	}
	public static void pintaRombo(int num, char car) {
		if(num%2==0) {
			pintaPiramide((num/2)-1,car);
		}else {
			pintaPiramide((num/2)-1,car);
			pintaLinea(num,car);
			System.out.printf("%n");
		}
		pintaPiramideInver(num/2,car);
		
	}
	
}

