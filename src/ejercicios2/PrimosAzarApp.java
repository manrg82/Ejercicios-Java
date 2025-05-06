package ejercicios2;

import javax.swing.JOptionPane;

public class PrimosAzarApp {

	public static void main(String[] args) {
		boolean esPrimo=false;

		while(esPrimo=false) {
			int num=Util.generaNumAleatorio(1,10000);
			boolean primo=Calculador.esPrimo(num);
			if(primo=true) {
				esPrimo=true;
				JOptionPane.showMessageDialog(null, num+" es primo");
			}
		}
		
	}

}
