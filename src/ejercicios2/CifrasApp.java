package ejercicios2;

import javax.swing.JOptionPane;

public class CifrasApp {
	public static void main(String[]Args) {
		System.out.println(Calculador.terminoFibo(8));
		int cantcifras=Calculador.cuentacifras(123);
		System.out.println(cantcifras);
		JOptionPane.showMessageDialog(null,"El numero tiene "+cantcifras+" cifras");
	}
}
