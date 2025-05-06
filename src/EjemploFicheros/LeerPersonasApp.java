package EjemploFicheros;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerPersonasApp {

	public static void main(String[] args) {
		final String FILE="personas.dat";
		try(DataInputStream stDat=new DataInputStream(new FileInputStream(FILE))){
			double st=0;
			for(int i=0;st!=-1;i++) {
				st=stDat.readDouble();
				System.out.println(st);
			}
			//System.out.println(stDat.readDouble());
		}catch(IOException exc){
			System.out.println("ERROR: "+ exc);
		}

	}

}
