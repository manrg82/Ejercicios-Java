package ejsArrays1D;

import java.util.Scanner;

public class SumaListaApp {

	public static void main(String[] args) {
		int[] array=new int[10];
		Scanner teclado=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=teclado.nextInt();
			if(array[i]!=0) {
				array[i]=array[i]-1;
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
