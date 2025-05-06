package Objetos;

public class pruebaBombillaApp {

	public static void main(String[] args) {
		Bombilla b1=new Bombilla(false);
		Bombilla b2=new Bombilla(false);
		Bombilla b3=new Bombilla();
		b2.encender();
		if(b1.isEncendida()) {
			System.out.println("B1: ON");
		}else {
			System.out.println("B1: OFF");
		}
		if(b2.isEncendida()) {
			System.out.println("B2: ON");
		}else {
			System.out.println("B2: OFF");
		}
		if(b2.isEncendida()) {
			System.out.println("B3: ON");
		}else {
			System.out.println("B3: OFF");
		}
	}

}
