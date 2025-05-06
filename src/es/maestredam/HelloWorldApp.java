package es.maestredam;
import java.util.Scanner;
/**
 * Aplicación de ejemplo de codificación Java
 * @author manuelruiz
 * @version 1.1
 */
public class HelloWorldApp {

	/**
	 * Método main : punto de entrada de la aplicación.
	 * @param args argumentos de la linea de ordenes (no usados)
	 */
	//un método realiza una tarea cuando es invocado
	//un método se puede utilizar en diferentes lugares mientras sea público
	//aunque a priori no se utilice en mas lugares siempre 
	//es un buen hábito de estructurar el código dividiendo
	//una tarea en subtareas
	
	//void significa que hace algo pero no devuelve nada
	
	//los parametros reales tienen que ser compatibles
	//con los formales en numero y tipo
	
	//un parametro formal es una variable local a un método declarado en param. del metodo
	//las variables ya declaradas en parametros no pueden volverse a declarar
	//las var. locales al terminar la ejecución se borran de memoria
	//se denomina "paso por valor de parámetros"
	
	//formato de cabecera de un metodo:
    //visibilidad [static] tipo_devuelto nombre_metodo ([parametos])
    //nombre -> pintaLinea
    //parametros -> uno que es la cantidad de *
    //no devuelve nada (void) porque es un metodo que escribe
    //es public (invocable fuera de su clase)
	//subprograma o metodo que pinta una linea con "*"
	
	public static void pintaLinea(int cantidad,int veces,char simbolo) { //pinta cualquier caracter asignado en simbolo
     	int cont=0;
		 while (cont<veces) {
			for(int i=0;i<cantidad;i++) {
	         	System.out.print(simbolo);
	         }
	     	System.out.printf("%n");
	     	cont++;
     	}
     }
	 
	 public static void pintaLinea(int cantidad,int veces) { //solo pinta con asteriscos
	     	int cont=0;
			 while (cont<veces) {
				for(int i=0;i<cantidad;i++) {
		         	System.out.print("*");
		         }
		     	System.out.printf("%n");
		     	cont++;
	     	}
	     }
	 
	 public static void pintaLinea(int cantidad) { //hace llamada recursiva
		 pintaLinea(cantidad,cantidad,'*');
	     	}
	     
	 
    public static void main(String[] args) {
    //apuntes funcionamiento java
		
	//punto de entrada
    	
	    //declaración de variables enteras(siempre 1ª en minuscula)
	        //short varShort = 45;
	        int varEntera = 2;
	        //long varLong = 123;    
	    //declaración de variables reales
	        //double varReal = 10.67;
	    //declaración de variábles lógicas (boolean)(intentar siempre estructurar como "esCUALQUERCOSA")
	        boolean esVerdadero = true;
	        //boolean esFalso = false;
	    //declaración de constantes (siempre mayuscula)(con final se bloquean para no poderse modificar)
	        //final int IVA = 21;
	        //final double PI = 3.1416;
	    //declaración de caracter
	        //char letraTeclearda;
	        char inicialNombre ='M';
	    //operadores:
	        
	    //aritmeticos: +,-,*,/, mod -> %
	        
	    //relacionales: <,>,<=,>=,==,!=
	        
	    //lógicos and -> &&, or -> ||, not -> !
	        
	    //instrucciones de la programación estructurada
	                
	    //asignación <-
	        varEntera = 2;
	        varEntera = varEntera * (1+2);
	    //escribir algo
	        System.out.println("Hola mundo");
	        System.out.println("esVerdadero contiene: " + esVerdadero);
	        System.out.println("inicialNombre contiene: " + inicialNombre);
	    //1 leer por consola (se necesita crear un objeto Scanner que se asocie al teclado)
	        System.out.println("teclea un número:");
	        Scanner teclado = new Scanner(System.in);
	    //2 ahora leo un valor entero de la consola
	        int numleido = teclado.nextInt();
	        System.out.println("Has tecleado: "+numleido);
	    //3 cierro el canal
	        
	    //condicional simple
	        if (numleido > 9) {
	        	System.out.println("El número que has tecleado tiene mas de una cifra");
	        }
	    //condicional doble
	        if (numleido % 2 == 0) {
	        	System.out.println("Es par");
	        }
	        else {
	        	System.out.println("Es impar");
	        }
	    //bucle repetitivo 
	        int cont = 0;
			while (cont<numleido) {
	        	System.out.println("Hola "+cont);
	        	cont++;
	        }	
		//PrintStream es una clase de la que puedo crear objetos
		//out es un objeto de PrintStream YA CREADO en la clase SYSTEM
			int num = 7;
			String numBin = Integer.toBinaryString(num);
	        String texto = "Programación Java";
	        double mitadPi = Math.PI/2;
	        System.out.printf("Num contiene %d y texto contiene %s %n", num , texto);
	        System.out.printf("Num contiene %d,(en binario %s)",num,numBin);
	        System.out.printf("PI vale %f%nLa mitad de PI es %f%n",Math.PI,mitadPi);
	    //solo con 2 decimales
	        System.out.printf("PI vale %.2f%nLa mitad de PI es %.2f%n",Math.PI,mitadPi);

    //condicional multiple: sentencia switch        
    //tradicional: solo admite valores enteros
        int numer=8;
        switch(numer) {
        case 1: System.out.println("Enero");
        	break;
        case 2: System.out.println("Febrero");
    		break;
        case 3: System.out.println("Marzo");
    		break;
        case 4: System.out.println("Abril");
    		break;
    	default:
    		System.out.println("Julio o posterior");
        }
    //switch con "case L ->"  solo admite valores enteros y cadenas
        char letra='g';
        switch(letra) {
        	case'a','e','i','o','u'->{
        		System.out.printf("%c es vocal%n",letra);
        	}
        	case'b','c'->{
        		System.out.printf("%c es b o c%n",letra);        		
        	}
        	case'y','z'->{
        		System.out.printf("%c es una de las ultimas letras%n",letra);        		
        	}
        	default->{
        		System.out.printf("%c no es una de las letras en el rango%n",letra);
        	}
        }
        String Palabra="Tonto";
        switch(Palabra) {
    	case"Tonto"->{
    		System.out.printf("%s es patata%n",letra);
    	}
    	case"Patata"->{
    		System.out.printf("%s es camion%n",letra);        		
    	}
    	case"Camion"->{
    		System.out.printf("%s es tonto%n",letra);        		
    	}
    	default->{
    		System.out.printf("%s no es una de las palabras en el rango%n",letra);
    	}
    }
    //expresion switch con yield
    //switch toma la forma de expresión y aparece en el lado dereho de **sig
    //una asignación a variable de cualquier tipo
        int mes=4;
        int tempMedia=switch(mes) {
	        case 1->{
	        	yield 8;
	        }
	        case 2->{
	        	yield 13;
	        }
	        case 3->{
	        	yield 15;
	        }
	        case 4->{
	        	yield 16;
	        }
	//es OBLIGATORIO usar default en este caso porque la var **sig
	//no puede estar vacia
	        default->{
	        	yield 20;
	        }
        };
        System.out.printf("Para mes %d la temp. media es %dº%n",mes,tempMedia);
        
    //ahora quiero pintar un cuadrado relleno
        int numero=teclado.nextInt();
        int cantid=teclado.nextInt();
        char simbolo ='@';
        pintaLinea(numero,cantid,simbolo);
    //conversion entre tipos
        //string a int SI(necesita un metodo)
        String strNum="123";
        int numeroo = Integer.parseInt(strNum);
        //int a boolean NO(no son compatibles)
        
        //double a int NO
        
        //int a double SI(no metodo)
        int real =25;
        double numreal=real;
        //int a long SI(no metodo)
        long largo =numeroo;
        //long a int NO(sigue siendo entero pero al ocupar mas bytes no puede pasarse)
        
        //long a int SI(con casting)(conversion explicita)
        numeroo=(int)largo;
        //double a int SI(con casting)(conversion explicita)(pierdo cualquier decimal)
        numeroo=(int)real;
        //char a int SI(porque un char es un int disfrazado, es decir da el numero asignado a la letra)
        char letraa='A';
        numeroo=letraa;
        //int a charSI(con casting)(da aquel valor asignado a la letra, en este caso el "0" porque es el valor del 48)
        numeroo=48;
        letra=(char)numeroo;
        
        
    //final
        teclado.close();
	}

}
