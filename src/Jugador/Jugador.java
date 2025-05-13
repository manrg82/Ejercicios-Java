package Jugador;

import java.io.Serializable;

public class Jugador implements Serializable {
	private int num;
	private String nombre;
	private int punt;
	//
	public Jugador(int num, String nom, int pt) {
		this.num=num;
		this.nombre=nom;
		this.punt=pt;
	}
	//
	public int getNum() {
		return num;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPunt() {
		return punt;
	}
	public void incPunt(int nm) {
		punt+=nm;
	}
	public boolean equals(Object obj) throws IllegalArgumentException{
		if(obj instanceof Jugador) {
			Jugador j2=(Jugador)obj;
			if(this.nombre.equals(j2.nombre)) {
				return true;
			}else {
				return false;
			}
		}else {
			IllegalArgumentException exc=new IllegalArgumentException("JUGADOR INCORRECTO");
			throw exc;
		}
		
	}
	public String toString() {
		StringBuffer str=new StringBuffer();
		str.append("Numero: "+num);
		str.append(" Nombre: "+ nombre);
		str.append(" Puntuacion: "+num);
		return str.toString();
	}
	
}
