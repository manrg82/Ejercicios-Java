package Jugador;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import EjemploFicheros.Persona;

public class GanadorApp {

	public static void main(String[] args) {
		LinkedList<Jugador> lsJug=new LinkedList<Jugador>();
		lsJug.add(new Jugador(1, "JUG1", 1));
		lsJug.add(new Jugador(2, "JUG2", 2));
		lsJug.add(new Jugador(3, "JUG3", 3));
		LinkedList<Jugador> lsJug2=new LinkedList<Jugador>();
		lsJug2.add(lsJug.get(0));
		lsJug2.add(lsJug.get(1));
		lsJug2.add(lsJug.get(2));
		lsJug2.add(new Jugador(4, "JUG4", 4));
		lsJug2.add(new Jugador(5, "JUG5", 5));
		final String FILE="jugadores1.dat";
		Persona p1=new Persona("Juan",true,1000);
		Persona p2=new Persona("Ana",true,2000);
		Persona p3=new Persona("Daniel",false,0);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FILE))){//ObjectOutputStream necesita un FileOutputStream 
			for(int i=0;;i++)
				oos.writeObject(lsJug.get(i));
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("ERROR FNF: "+e);
		} catch(IOException e1) {
			System.out.println("ERROR IOE: "+e1);
		}
	}

}
