package Strings;

public class PruebaString {

	public static void main(String[] args) {
		//var de tipo simple (int)
		int num = 5;
		//creo objeto de la clase String.
		//new es la ref al objeto creado
		String mail = new String("jk@maestre.es");
		int num2=0;//le doy un valor inicial 
		String mail2=null;//le doy un valor inicial pero no definitivo que no apunta a ningun obrejo(nulo)
		mail2=new String("tt@maestre.es");//ahora si le asigno una ref a un objeto
		//otro objeto string
		String palMagica=new String("    Abracadabra   ");
		//oye ojeto mail ¿que long tienes?
		System.out.println("La longitud de mail es"+mail.length());
		//oye ojeto mail ¿tienes el caracter @?
		int tieneArroba=mail.indexOf("@");
		if (tieneArroba==-1) {
			System.out.println("No tiene @");
		}else {
			System.out.println("Si tiene @");
		}
		//oye ojeto mail ¿que caracter ocupa la posicion 10?
		char posArroba=mail.charAt(10);
		System.out.println("la pos de @ es "+posArroba);
		//oye ojeto mail ¿estas vacio?
		boolean estaVacio=mail.isEmpty();
		if (estaVacio==true) {
		System.out.printf(mail," está vacio");
		}else {
			System.out.println(mail+" no está vacio ");
		}
		String nuevoMail = new String("");
		if (nuevoMail.isEmpty()){
			System.out.println("nuevoMail está vacio");
		}else {
			System.out.println("nuevoMail no está vacio"); 
		}
		
		
	}

}
