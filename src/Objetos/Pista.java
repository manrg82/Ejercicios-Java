package Objetos;

import java.util.Arrays;

/*
 * Clase que permite crear objetos Pista
 * 
 */
public class Pista {
	//Atributos: (guardan el estado del objeto)
	private final static int MAX_JUGADORES=4;
	private final static int NUM_PISTA_DEF=0;
	private final static boolean ES_CUBIERTA_DEF=false;
	
	private int numJugadores;
	private int numPista;
	private boolean reservada;
	private boolean cubierta;
	
	private boolean[] libres;
	private String[] jugadores;
	//constructor
	/**
	 * Constructor predeteminado sin parametros
	 */
	public Pista() {
		this(NUM_PISTA_DEF,ES_CUBIERTA_DEF,false,0);
	}
	/**
	 * constructor con 1 parametro
	 */
	public Pista(int numPista) {
		this(numPista, ES_CUBIERTA_DEF, false, 0);
	}
	/**
	 * Constructor con 2 parámetros
	 * @param numPista numero de pista
	 * @param cubierta si está o no cubierta la pista
	 */
	/*public Pista(int numPista, boolean cubierta) {
		//inicializo atributos
		this(numPista, cubierta, false, 0);
	}*/
	/**
	 * Constructor más especifico a el cual llamar
	 * @param numPista
	 * @param reservada
	 * @param cubierta
	 * @param numJugadores
	 */
	public Pista(int numPista, boolean reservada, boolean cubierta, int numJugadores) {
		this.numPista=numPista;
		this.reservada=reservada;
		this.cubierta=cubierta;
		this.numJugadores=numJugadores;
		//creo estructura de datos
		String[] jugadores=new String[4];
		Arrays.fill(jugadores,"");
	}
	
	
	//Método: (operaciones del objeto) estos pueden ser o no publicos depende de la situación, estos
	//metodos tienen acceso a todos los atrib y solo tiene que tener de parametros los valores 
	//externos y deben mantener datos coherentes en el objeto
	/**
	 * getter if reservada
	 * @return si está reservada o no
	 */
	public boolean isReservada(){//se denomina "Getter" porque devuelve el valor de un atributo
		return reservada;	
	}//se suelen escribir como "isThing" o "getThing"
	
	public boolean isCubierta(){//devuelve si la pista es cubierta
		return cubierta;
	}
	
	public int getNumJugadores() {
		return numJugadores;
	}
	
	public int numPista(){//devuelve el nª de pista
		return numPista;
	}
	//setters(cambian un valor)
	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}
	
	
	public void reservar(){//operación reservar
		if(!reservada) {
			reservada=true;
		}
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////	
	public void añadirJugador(String nombre)throws IllegalArgumentException{//operación añadir jugador a pista
		if(nombre.trim().length()==0) {
			IllegalArgumentException exc= new IllegalArgumentException("Nombre vacío");
			throw exc;
			//also(throw new IllegalArgumentException("Nombre vacío");)
		}
		if(numJugadores<MAX_JUGADORES) {
			System.out.printf("Voy a añadir al jugador %s%n",nombre);
			numJugadores++;
			for(int i=0;i<MAX_JUGADORES;i++) {
				if(jugadores[i]=="") {
					jugadores[i]=nombre;
				}
			}
		}else {
			System.out.println("ERROR, DEMASIADOS JUGADORES!!");
		}
	}
	
	public void eliminarJugador(String nombre){//operación eliminar jugador a pista
		System.out.printf("Voy a eliminar al jugador %s%n",nombre);
		numJugadores--;
		for(int i=0;i<MAX_JUGADORES;i++) {
			if(jugadores[i]==nombre) {
				jugadores[i]="";
			}
		}
	}
	
	public void cancelar(){//operación cancelar reserva
		if(reservada) {
			reservada=false;
		}
	}
	
	//metodos papel
	
	/*public void añadirJugador(String nom) {
		if(this.numJugadores<MAX_JUGADORES) {
			boolean done=false;
			for(int i=0;i<this.jugadores.length&&!done;i++) {
				if(this.libres[i]) {
					this.jugadores[i]=nom;
					this.numJugadores++;
					libres[i]=false;
					done=true;
				}
			}
		}else {
			System.out.println("ERROR, demasiados jugadores");
		}
	}*/
	
	public void elimJugador(String nombre) {
		boolean done=false;
		for(int i=0;i<this.jugadores.length&&!done;i++) {
			if(this.jugadores[i].equals(nombre)) {
				this.numJugadores++;
				libres[i]=true;
				jugadores[i]="";
			}
		}
	}
	public void elimJugador(int pos) {
		if(!this.libres[pos]) {
			jugadores[pos]="";
			this.numJugadores--;
			libres[pos]=true;
		}else {
			System.out.println("La posición "+pos+" está libre");
		}
	}
	
}
