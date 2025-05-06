package EjemploFicheros;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class leeFicherosBinApp {
	
	public static void main(String[] args) {
		final String FILE="num.dat";
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
