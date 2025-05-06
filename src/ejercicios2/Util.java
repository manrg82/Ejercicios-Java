package ejercicios2;

public class Util {
	public static int generaNumAleatorio(int min, int max) {
		int dif=max-min;
		int numal=(int)(Math.random()*(dif+1)+min);
		return numal;
	}
	
}
