package Objetos;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class Dni {
	//atributos
	private static int numero;
	private static GregorianCalendar fechaCad;
	private static GregorianCalendar fechaActual;
	private static char letra;
	private static char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private static int posLetra;
	private static boolean isCaducado;
	private static String dniFinal;	
	private static final int DIV_DNI=23;
	//constructores
	public Dni() {
		
	}
	public Dni(String dni) {
		this(Integer.parseInt(dni),2001,1,1);
	}
	public Dni(int dni) {
		this(dni,2001,1,1);
	}
	public Dni(int numero, int year, int month, int day) {
		this.numero=numero;
		this.letras=new char[23];
		this.posLetra=(int)(numero/DIV_DNI);
		this.letra=letras[posLetra];
		fechaCad= new GregorianCalendar(year, month,day);
		fechaActual=new GregorianCalendar();
		
	}
	//metodos
	public static char getLetra() {
		return letra;
	}
	public static int getNumero() {
		return numero;
	}
	public static int posicionLetra(char letra) {
		boolean done=false;
		for(int i=0;i<letras.length;i++) {
			if(letras[i]==letra && !done) {
				done=true;
				return i;
			}
		}
		if(!done) {
			return -1;
		}
		return 0;
	}
	public static boolean estaCaducado() {
		if(fechaCad.compareTo(fechaActual)<=0) {
			return false;
		}else {
			return true;
		}
		
	}
	
}
