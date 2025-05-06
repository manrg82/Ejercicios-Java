package es.maestredam.ejercicios;
/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class Ej8App {
	/**
	 * Main
	 * @param args command-line arguments (not used yet)
	 */
	public static void main(String[] args) {
		final int VALORINICIAL = 0;
		final int VALORFINAL = 360;
		double radianes;
		System.out.println("GRADOS   SENO");
		for(int grados = VALORINICIAL; grados <= VALORFINAL; grados++ ) {
			radianes = Math.toRadians(grados);
			double seno = Math.sin(radianes);
			System.out.printf("%d        %.4f %n",grados,seno);
		}
	}
}
