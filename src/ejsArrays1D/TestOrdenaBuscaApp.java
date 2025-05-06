package ejsArrays1D;

import java.util.Scanner;
import java.util.Arrays;

public class TestOrdenaBuscaApp {
	
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		int longitud=tec.nextInt();
		int[] arr1=ArraysManuel.getRandomList(0,100,longitud);
		int[] arr2=ArraysManuel.copyOf(arr1);
		int[] arr3=ArraysManuel.copyOf(arr1);
		Arrays.sort(arr1);
		for (int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
