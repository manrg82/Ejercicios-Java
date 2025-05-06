package ejsArrays1D;

import java.util.Scanner;

public class PadelApp {
	private static int getPistaVacia(boolean[] cantPista) { //ej1
		int numVacias=0;
		for (int i=0;i<cantPista.length;i++) {
			if(cantPista[i]==false) {
				numVacias++;
			}
		}
		return numVacias;
	}
	private static void obtenerNumJugadoresPista(int pista, String[][] nombresPista) {
		
		for (int i=0;i<nombresPista.length;i++) {
			for (int j=0;j<nombresPista[i].length+1;j++) {
				System.out.println(nombresPista[i][j]);
			}
		}
		
	}
	
	private static int obtenerJugadoresIns(int pista, String[][] nombresPista) {
		int cantinsc=0;
		if(pista!=1) {
			for(int i=0;i<nombresPista.length;i++)
				for (int j=0;j<nombresPista[i].length;j++) {
					if(nombresPista[i][j]!="") {
						cantinsc++;
					}
				}
		}
		if (cantinsc!=0) {
			return cantinsc;
		}else {
			return 0;
		}
	}
	
	private static void agregarJugador(int pista, String[][] nombresPista, String nombre, boolean[] vacPista) {
		boolean done=false;
		if(pista!=1) {
			for (int j=0;j<nombresPista.length;j++) {
				for (int i=0;i<nombresPista[j].length+1;i++) {
					if(nombresPista[j][i]==""&& done==false) {
						nombresPista[j][i]=nombre;
						vacPista[pista]=true;
						done=true;
					}
				}
			}
		}else {
			for (int j=0;j<nombresPista.length;j++) {
				for (int i=0;i<nombresPista[j].length+1;i++) {
					if(nombresPista[j][i]==""&& done==false) {
						nombresPista[j][i]=nombre;
						vacPista[pista]=true;
						done=true;
					}
				}
			}
		}
		if (done==false) {
			System.out.println("La pista está llena");
		}
		
	}
	private static void principal(String[][]nombresPista,boolean[]vacPista) {
		
		int numpista=0;
		Scanner tec=new Scanner(System.in);
		System.out.printf("Que desea hacer?%n 1) Ver los nombres de las pistas ya reservadas%n 2) Ver las pistas reservadas%n 3) Añadir un jugador a una pista ya reservada%n 4) Ver las pistas vacias%n 5) Ver el estado de cada pista%n");
		int opcion=tec.nextInt();
		switch(opcion){
			case 1:
				System.out.println("Indica la pista que quieres comprobar:");
				numpista=tec.nextInt();
				System.out.println("La pista "+numpista+" está ocupada por:");
				obtenerNumJugadoresPista(numpista,nombresPista);			
			break;
			case 2:
				System.out.println("Indica la pista que quieres comprobar:");
				numpista=tec.nextInt();
				System.out.println("La pista "+numpista+" tiene "+obtenerJugadoresIns(numpista,nombresPista)+" jugadores inscritos");
			break;
			case 3:
				System.out.println("Introduce el nombre de el usuario que quieres añadir:");
				String nombre=tec.next();
				System.out.println("Indica la pista a la que lo quieres añadir:");
				numpista=tec.nextInt();
				agregarJugador(numpista, nombresPista, nombre, vacPista);
				System.out.println("La pista "+numpista+" ahora está ocupada por:");
				obtenerNumJugadoresPista(numpista,nombresPista);
			break;
			case 4:
				System.out.println("Hay un total de "+getPistaVacia(vacPista)+" pistas vacias");
			break;
			case 5:
				for(int i=0;i<5;i++) {
					if(obtenerJugadoresIns(i,nombresPista)==0) {
						System.out.println("La pista "+(i+1)+" está vacia");
					}else {
						System.out.println("La pista "+(i+1)+" no está vacia");
					}
				}
			break;
			default:
				System.out.println("Numero incorrecto");
			break;
		}
		System.out.println("");
		principal(nombresPista,vacPista);
	}
	
	
	public static void main(String[] args) {
		String[][] nombresPista=new String[5][100];
		boolean[] vacPista=new boolean[5];
		for(int i=0;i<nombresPista.length;i++) {
			ArraysManuel.fill(nombresPista[i],"");
		}
		principal(nombresPista,vacPista);
		
	}

}
