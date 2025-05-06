package EjemploFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class streams1App {
	public static void main(String[] args){
		final int EOF = -1;
		/*
	//lee del teclado
		try {
			InputStreamReader streamTeclado=new InputStreamReader (System.in);
			char inp = (char)streamTeclado.read();
			System.out.printf("Has escrito: %c%n",inp);
			streamTeclado.close();
		} catch (IOException exc) {
			System.out.println("ERROR: "+exc);
		}
	//lee de un archivo
		try {
			FileReader streamArchivo=new FileReader("texto1.txt");
			char inp = (char)streamArchivo.read();
			System.out.printf("El 1er char del archivo es: %c%n",inp);
			streamArchivo.close();
		} catch (IOException exc) {
			System.out.println("ERROR: "+exc);
		}
	//lee el archivo entero
		
		try {
			//se ejecuta primero (se envuelve el bloque de codigo en esto porsi lanza exception
			FileReader streamArchivo=new FileReader("texto1.txt");
			int car= streamArchivo.read();
			while(streamArchivo.read()!=EOF) {
				System.out.printf("%c",(char)car);
				car= streamArchivo.read();
			}
			System.out.printf("%n");
			streamArchivo.close();
		} catch (IOException exc) {
			//atrapa la excepcion y lanza un codigo de rror
			System.out.println("ERROR: "+exc);
		}
		finally {
			//se ejecuta siempre haya o no excepción
		}
		//usar try-with-resourcer para que se cierren automaticamente los recursos, sería así
		try (FileReader streamFichero = new FileReader ("texto1.txt")){
			char inp = (char)streamFichero.read();
			System.out.printf("Has escrito: %c%n",inp);
		} catch (FileNotFoundException exc) {
			//atrapa la excepcion y lanza un codigo de rror
			System.out.println("ERROR: "+exc);
		}catch (IOException exc2) {
			//atrapa la excepcion y lanza un codigo de rror
			System.out.println("ERROR: "+exc2);
		}
		
		//copiafichero
		try (FileWriter leeArchivo=new FileWriter("arch2.txt");FileReader streamFichero = new FileReader ("arch1.txt")){
			char car= (char)streamFichero.read();
			while(car!=EOF) {
				leeArchivo.write(car);
				
				car= (char)streamFichero.read();
			}
		} catch (FileNotFoundException exc) {
			System.out.println("ERROR: "+exc);
		}catch (IOException exc2) {
			System.out.println("ERROR: "+exc2);
		}
		
		//copiafichero pero cifra a +3
		try (FileWriter leeArchivo=new FileWriter("arch2.txt");FileReader streamFichero = new FileReader ("arch1.txt")){
			int car= streamFichero.read();
			while(car!=EOF) {
				leeArchivo.write((char)car+3);
				
				car= streamFichero.read();
			}
		} catch (FileNotFoundException exc) {
			System.out.println("ERROR: "+exc);
		}catch (IOException exc2) {
			System.out.println("ERROR: "+exc2);
		}
		
		try (FileReader streamFichero = new FileReader ("index.html"); FileWriter esc=new FileWriter("index.html");
				BufferedReader br=new BufferedReader(streamFichero);
				BufferedWriter escbf=new BufferedWriter(esc);){
			String ln= br.readLine();
			int numln=0;
			while(ln!=null) {
				escbf.write(ln);
				ln= br.readLine();
				numln++;
			}
			escbf.write(
					"<h3>FIN DE LA COPIA<h3> <h4>num lineas: </h4>"+numln
					);			
			
		} catch (FileNotFoundException exc) {
			System.out.println("ERROR: "+exc);
		}catch (IOException exc2) {
			System.out.println("ERROR: "+exc2);
		}
		*/
		
		final String FILE="num.dat";
		double numarr[]= {1.34,3.65,234.45,3.567345,1.4435,1.5346};
		try(DataOutputStream stDat=new DataOutputStream(new FileOutputStream(FILE))){
			
			for(int i=0;i<numarr.length;i++) {
				stDat.writeDouble(numarr[i]);
			}
			//stDat.writeDouble(num); HAY METODOS PROPIOS PARA ESCRIBIR CADA TIPO DE DATO!!!!!!!
		}catch(IOException exc){
			System.out.println("ERROR: "+ exc);
		}
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
