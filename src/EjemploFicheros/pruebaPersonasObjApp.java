package EjemploFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class pruebaPersonasObjApp {

	public static void main(String[] args) {
		final String FILE="objetos.dat";
		Persona p1=new Persona("Juan",true,1000);
		Persona p2=new Persona("Ana",true,2000);
		Persona p3=new Persona("Daniel",false,0);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FILE))){//ObjectOutputStream necesita un FileOutputStream 
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FNF: "+e);
		} catch (IOException e) {
			System.out.println("ERROR IOE: "+e);
		}
		p1=null;
		p2=null;
		p3=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(FILE))){//ObjectInputStream necesita un FileInputStream 
			Persona p4=(Persona) ois.readObject();
			Persona p5=(Persona) ois.readObject();
			Persona p6=(Persona) ois.readObject();
			LinkedList<Persona> ll=new LinkedList<Persona>();
			ll.add(p4);
			ll.add(p5);
			ll.add(p6);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR FNF: "+e);
		} catch (ClassNotFoundException e) {
			System.out.println("ERROR CNF: "+e);
		} catch (IOException e) {
			System.out.println("ERROR IOE: "+e);
		}
		LinkedList ll=new LinkedList<Persona>();
		ll.add(p4);
	}

}
