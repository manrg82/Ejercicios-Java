package EjemploFicheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirPersonasApp {

	public static void main(String[] args) {
		final String FILE="personas.dat";
		String[] noms= {"Pedro","Antonio","Andres"};
		Boolean[] myEd= {true,false,true};
		Double[] sld={10.4,4.12,1238.98};
		try(DataOutputStream stDat=new DataOutputStream(new FileOutputStream(FILE))){
			for(int i=0;i<noms.length;i++) {
				stDat.writeChars(noms[i]);
			}
			for(int i=0;i<myEd.length;i++) {
				stDat.writeBoolean(myEd[i]);
			}
			for(int i=0;i<sld.length;i++) {
				stDat.writeDouble(sld[i]);
			}
		}catch(FileNotFoundException FNF) {
			System.out.println("FILENOTFOUNT: "+FNF);
		}catch(EOFException EOF) {
			System.out.println("EOF: "+EOF);
		}catch(IOException exc){
			System.out.println("ERROR: "+exc);
		}

	}

}
