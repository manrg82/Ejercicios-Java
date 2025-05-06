package es.maestredam;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase para crear objetos Dni.
 * <ul> 
 *   <li>
 *   Esta implementación utiliza un <strong>objeto GregorianCalendar</strong>
 *   para guardar la fecha de creación y así calcular la fecha de caducidad.
 *   </li>
 * </ul>
 * 
 * @author josema
 * @version 1.2
 */
public class Dni2 {
    
	// ATRIBUTOS -----------------------------
	
	/**
	 * Lista con las letras usadas en el Dni (Constante).
	 */
	private final static char listaLetras[]= {
			'T','R','W','A','G','M',
			'Y','F','P','D','X','B',
			'N','J','Z','S','Q','V',
	        'H','L','C','K','E'};
	/**
	 * Número de DNI
	 */
	private String numero;
	/**
	 * Letra del DNI
	 */
	private char letra;
	/**
	 * Fecha de creación de DNI. Útil para saber su caducidad.
	 * Uso un objeto de la clase GregorianCalendar para almacenar el instante
	 * de creación (d/m/a y h:m:s)
	 */
	private GregorianCalendar fechaCreacion;
	
	// MÉTODOS Privados -----------------------------
	/**
	 * Calcula la letra correspondiente al número de DNI indicado.
	 * 
	 * @param dni el número de DNI.
	 * @return la letra que le corresponde al número indicado.
	 */
	private static char obtenerLetraDNI(int dni) {
		int resto = dni % listaLetras.length;	
		return listaLetras[resto];
	}
	
	/**
	 * Calcula la letra correspondiente al número de DNI indicado.
	 * 
	 * @param dni el número de DNI indicado.
	 * @return la letra que le corresponde al número indicado.
	 */
	private static char obtenerLetraDNI(String numDni) {
		// Llamo a la otra versión del método, 
		// que toma el número como entero.
		return obtenerLetraDNI(Integer.parseInt(numDni));		
	}
	
	// CONSTRUCTORES -----------------------------

	/**
     * Construye un DNI con un número al azar. 
     */	
	public Dni2() {
		// LLamo al constructor (int numero)
		this((int) (Math.random() * 99999999));
	}
	
    /**
     * Construye un nuevo DNI indicando el número.
     * 
     * @param numero número de DNI
     */
	public Dni2(int numero) {
		// LLamo al constructor (String numero)
		this(String.valueOf(numero));
	}

	/**
	 * Construye un nuevo DNI indicando el número como una cadena.
	 * 
	 * @param numero el número del DNI en formato cadena.
	 * @throws IllegalArgumentException si el número es negativo o 
	 * su longitud no es ni 7 ni 8. 
	 */
	public Dni2(String numero) {
		// Limpio blancos
		numero = numero.trim();
		
		// Si es negativo lanzo excepción
		if (numero.charAt(0) == '-') {
			throw new IllegalArgumentException("Número DNI negativo");
		}

		// Si no tiene 7 u 8 caracteres, lanzo excepción
		if (numero.length() != 7 && numero.length() != 8) {
			throw new IllegalArgumentException("Tamaño del número DNI incorrecto");
		}
		
		this.numero = numero;
		this.letra  = obtenerLetraDNI(numero);	
		this.fechaCreacion = new GregorianCalendar();
		
		// TRAZA
		System.out.printf("Objeto Dni Creado: %s-%c (%d/%d/%d)%n", numero, letra, 
				fechaCreacion.get(Calendar.DATE),
				fechaCreacion.get(Calendar.MONTH)+1,
				fechaCreacion.get(Calendar.YEAR));
	}
	
	/**
	 * Construye un objeto que es una copia de uno dado.
	 * @param unDni objeto Dni
	 */
    public Dni2 (Dni2 unDni) {
    	this.numero        = unDni.numero; 
    	this.letra         = unDni.letra;
    	this.fechaCreacion = unDni.fechaCreacion;
    }
	
	// MÉTODOS Públicos -----------------------------
    
    // Getters
    
    /**
     * Devuelve la letra que le corresponde al número de DNI.
     * 
     * @return la letra que corresponde al DNI.
     */
	public char getLetra() {
		return letra;	
	}

	public String getNumero() {
		return numero;
	}
	
	public GregorianCalendar getFechaCreacion() {
		return fechaCreacion;
	}
	
	// Otros getters pero que devuelven "parte" de la fecha
	public int getDiaCreacion() {
		return fechaCreacion.get(Calendar.DATE);
	}

	public int getMesCreacion() {
		return fechaCreacion.get(Calendar.MONTH);
	}

	public int getAnioCreacion() {
		return fechaCreacion.get(Calendar.YEAR);
	}

	/**
	 * Obtiene la posición de la letra pasada, dentro de la lista
	 * de letras usada para el cálculo de letra de un DNI.
	 *  
	 * @param letra letra de la que quiero conocer su posición.
	 * @return la posición de la letra en la lista
	 * usada para el cálculo de letra de un DNI
	 */
	public static int posicionLetra(char letra) {
		int pos = -1;
		boolean encontrada = false;
		for (int i=0;i<listaLetras.length && !encontrada;i++) {
			if (listaLetras[i] == letra){
				encontrada=true;
				pos = i;
			}
		}
		
		return pos;
	}
	
	public boolean estaCaducado() {
		boolean caducado = false;
		
		GregorianCalendar fechaHoy = new GregorianCalendar();
		
		// Quita los comentarios para probar con una fecha posterior
		// y que salgan caducados
		
		//fechaHoy.add(Calendar.YEAR, 5); // =>Sumo 5 años 
		//fechaHoy.add(Calendar.DATE, 1); // =>Sumo 1 día
		
		// TRAZA
		System.out.printf("Hoy es: \t %d/%d/%d %n", 
				fechaHoy.get(Calendar.DATE),
				fechaHoy.get(Calendar.MONTH)+1,
				fechaHoy.get(Calendar.YEAR));
		
		// Calculo la fecha de caducidad como la fecha de creación + 5 años
		// 1) Creo un nuevo objeto GregorianCalendar con la fecha de creación
		GregorianCalendar fechaCaducidad = new GregorianCalendar(
						this.getAnioCreacion(),
						this.getMesCreacion(),
						this.getDiaCreacion());
		// 2) Le sumo a la fecha 5 años
		fechaCaducidad.add(Calendar.YEAR, 5);

		System.out.printf("El dni %s caduca: %d/%d/%d %n", numero,  
				fechaCaducidad.get(Calendar.DATE),
				fechaCaducidad.get(Calendar.MONTH)+1,
				fechaCaducidad.get(Calendar.YEAR));
				        		
		if (fechaHoy.compareTo(fechaCaducidad) >0) {			
        	caducado = true;
        }
        
		return caducado;
	}
}