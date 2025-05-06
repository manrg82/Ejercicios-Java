package es.maestredam;

public class SimpleDniApp2 {

	public static void main(String[] args) {

		Dni2 dni1 = new Dni2();
		Dni2 dni2 = new Dni2(90888655);
		Dni2 dni3 = new Dni2("80888655");
		
		//Dni2 dniError = new Dni2(-45000012);

		// Miro si el primer DNI está caducado		
		System.out.printf("¿Está caducado? %b%n", dni1.estaCaducado());
		
		// Creo un array con todos los DNIs (colección)
		Dni2[] listaDNIs = new Dni2[3];
		listaDNIs[0] = dni1;
		listaDNIs[1] = dni2;
		listaDNIs[2] = dni3;
		
		// Recorrido para revisar la caducidad de cada DNI
		for (int i=0;i<listaDNIs.length;i++) {
			System.out.printf("¿Está caducado? %b%n", 
					listaDNIs[i].estaCaducado());
		}
		
		// Mejor, hago un método que lo haga con la lista de DNIs
		revisarCaducidad(listaDNIs);
	}
	
	public static void revisarCaducidad(Dni2 [] lista) {
		for (Dni2 d :lista) {
			System.out.printf("¿Está caducado? %b%n", d.estaCaducado());
		}
	}

}
