package Objetos;
/*
 * App reserva pistas padel
 * @author manuel
 * @version 1.0 (POO)
 */
public class GestionPadelApp {

	public static void main(String[] args) {
		Pista[] pistas=new Pista[5];
		for(int i=0;i<pistas.length;i++) {
			pistas[i]=new Pista(i);
			pistas[i].reservar();
			System.out.println("La pista "+pistas[i].numPista()+" ha sido reservada");
		}
		for(Pista p:pistas) {//el tipo de bucle este usa referencias a el array mientras lo recorre por lo que es util para este tipo de situaciones
			p.reservar();
		}
		
		/*//ej uso clase pista
		//creo el objeto (2 maneras)
		Pista PistaA=new Pista();
		PistaA.setCubierta(true);
		System.out.println("PistaA está cubierta? "+PistaA.isCubierta());
		Pista PistaB;
		PistaB=new Pista();//pistas no cubierta
		System.out.println("Reservo una pista");
		PistaA.reservar();
		System.out.println("Esta reservada PistaA? ");
		System.out.println(PistaA.isReservada());
		System.out.println("Esta reservada PistaB? ");
		System.out.println(PistaB.isReservada());
		PistaA.cancelar();
		System.out.println("Esta reservada PistaA despues de cancelarla? ");
		System.out.println(PistaA.isReservada());
		System.out.println("Ahora mismo hay "+PistaA.getNumJugadores()+" jugadores");
		//PistaA.añadirJugador("Pedro");
		//PistaA.añadirJugador("Antonio");
		System.out.println("Ahora mismo hay "+PistaA.getNumJugadores()+" jugadores");
		PistaA.eliminarJugador("Pedro");
		System.out.println("Ahora mismo hay "+PistaA.getNumJugadores()+" jugadores");
		for(int i=0;i<100;i++) {
			PistaA.añadirJugador("i");
		}
		Pista PistaC=new Pista(9,true,true,0);
		System.out.println("Está reservada pista C? "+ PistaC.isCubierta());
		System.out.println("La pista C tiene "+PistaC.getNumJugadores()+" jugadores");
		*/
	}

}
