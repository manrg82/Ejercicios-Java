package Objetos;

public class Dado {
	//atributos
	private int numcaras;
	public final int MIN_NUMERO=1;
	private int ultimaTirada;
	public final int NO_HAY_TIRADAS=-1;
	public final int CARAS_DEF= 3;
	//constructores
	/**
	 * Constructor que asigna el numero de caras a 3 por defecto si no se pasa ningun parametro
	 */
	public Dado() {
		this.numcaras=CARAS_DEF;
		this.ultimaTirada=NO_HAY_TIRADAS;
	}
	/**
	 * Constructor que asigna el numero de caras segun el parametro
	 * @param numcaras numero de caras que la aplicacion quiere que tenga el dado
	 */
	public Dado(int numcaras) {
		this.ultimaTirada=NO_HAY_TIRADAS;
		if(numcaras>3) {
			this.numcaras=numcaras;
		}else {
			this.numcaras=CARAS_DEF;
		}
	}
	
	//metodos
	/**
	 * Tirar el dado
	 * @return el valor al azar del dado
	 */
	public int tirar() {
		int resultado=(int)(Math.random()*numcaras+MIN_NUMERO);
		ultimaTirada=resultado;
		return resultado;
	}
	/**
	 * Getter ultimaTirada
	 * @return devuelve la ultima tirada, si no hay ultima tirada devuelve 0 (que es el valor por defecto de ultimaTirada
	 */
	public int getUltimaTirada() {
		return ultimaTirada;
	}
	/**
	 * Getter numcaras
	 * @return devuelve el numero de caras
	 */
	public int getNumCaras() {
		return numcaras;
	}
}
