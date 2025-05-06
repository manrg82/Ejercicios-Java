package instrumento;

import java.util.ArrayList;

abstract public class Instrumento {

	public enum Nota {DO, RE, MI, FA, SOL, LA, SI};
	
	protected ArrayList<Nota> notas;  
	
	public Instrumento(ArrayList Notas[]) {
		
	}
	public Instrumento() {
		/*
		notas = new int [1];
		notas[0] = VACIA;
		
		Nota unaNota;
		unaNota = Nota.FA;
	*/
		
		notas = new ArrayList<>();
	}
	/*
	public Instrumento(int[] notas) {
		
	}
	*/
	
	public Instrumento(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	public void añadirNota(Nota laNota) {
		notas.add(laNota);
	}
	abstract public void interpretar();
	
}
