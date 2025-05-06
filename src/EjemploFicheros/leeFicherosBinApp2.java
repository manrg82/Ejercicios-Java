package EjemploFicheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class leeFicherosBinApp2 {
	
	public static void main(String[] args) {
		/*
		 * Aplicación que genera un fichero con N valores reales
		 * el num de valores está en el int de la cabecera
		 * Formato int  | double double ...
		 */
		final String FILE="numcif.dat";
		double numarr[]= {1.34,3.65,234.45,3.567345,1.4435,1.5346};
		try(DataOutputStream stDat=new DataOutputStream(new FileOutputStream(FILE))){
			int nmfn=0;
			for(int i=0;i<numarr.length;i++) {
				nmfn++;
				stDat.writeDouble(numarr[i]);
			}
			//stDat.writeDouble(num); HAY METODOS PROPIOS PARA ESCRIBIR CADA TIPO DE DATO!!!!!!!
		}catch(IOException exc){
			System.out.println("ERROR: "+ exc);
		}
		
		try(DataInputStream stDat=new DataInputStream(new FileInputStream(FILE))){
			double st=0;
			while(true){
				st=stDat.readDouble();
				System.out.println(st);
			}
			//System.out.println(stDat.readDouble());
		}catch(FileNotFoundException FNF) {
			System.out.println("FILENOTFOUNT: "+FNF);
		}catch(EOFException EOF) {
			System.out.println("EOF: "+EOF);
		}catch(IOException exc){
			System.out.println("ERROR: "+exc);
		}
		

	}

}
