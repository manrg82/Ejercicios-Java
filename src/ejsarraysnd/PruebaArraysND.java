package ejsarraysnd;

import java.util.Arrays;

public class PruebaArraysND {

	public static void main(String[] args) {
		int[] dam1=new int[20];
		int[] asir1=new int[20];
		int[][] notas=new int[2][20];
		notas[0]=dam1;
		notas[1]=asir1;
		//para acceder a un elemento hay que indicar su posición en ambos ejes del array
		Arrays.fill(notas[0],10);
		Arrays.fill(notas[1],7);
		notas[0][2]=8;
		notas[1][5]=5;
		//System.out.printf("Nota=%d%n",notas[1][5]);
		//sumo 1 a la primera lista[0] y le resto 1 a la segunda[1]
		for(int i=0;i<notas.length;i++) {
			if(i==0) {
				for(int j=0;j<notas[0].length;j++) {
					notas[0][j]=notas[0][j]+1;
				}
			}else if(i==1) {
				for(int j=0;j<notas[1].length;j++) {
					notas[1][j]=notas[1][j]-1;
				}	
			}
			
		}		
		for(int elem:notas[0]) {
			System.out.printf(elem+" ");
		}
		System.out.println();
		//recorrido para escribir todas las notas
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				System.out.printf(j+"ºNota=%d, ",notas[i][j]);
			}
			System.out.printf("%n");
		}
	}
}


