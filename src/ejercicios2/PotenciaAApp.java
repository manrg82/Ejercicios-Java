package ejercicios2;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PotenciaAApp {

	public static void main(String[] args) {
		// A)
		Scanner teclado=new Scanner(System.in);
		int base=teclado.nextInt();
		int exp=teclado.nextInt();
		System.out.println(Calculador.potencia(base,exp));
		JOptionPane.showMessageDialog(null,"El resultado de "+base+" elevado a "+exp+" es "+Calculador.potencia(base,exp));
		teclado.close();
		
	}

}
