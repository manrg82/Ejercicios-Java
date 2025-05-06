package ejercicios2;

public class Calculador {
	public static int redondear(double num) {
		int numfin=(int)num;
		double decimal=num-numfin;
		if (decimal>=0.5) {
			numfin=numfin+1;
		}
		return numfin;
	}
	public static int potencia(int base,int exp) {
		int numfin = base;
		if(exp>1) {
			for(int i=0;i<(exp-1);i++) {
				numfin=numfin*base;
			}
			return numfin;
		}else {
			return base;
		}
		
	}
	public static int cuentacifras(int num) {
		int cantcifras=0;
		if (num>=10) {
			while(num>=1) {
				cantcifras++;
				num=num/10;
			}
		}else {
			cantcifras=1;
		}
		return cantcifras;
	}
	public static long factorial(int num) {
		long calcfact=num-1;
		long fact=num;
		while(calcfact>0) {
			fact=fact*calcfact;
			calcfact--;
		}
		return fact;
	}
	public static boolean esPrimo(int num) {
		boolean esPrimo=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				esPrimo=false;
			}
		}
		return esPrimo;
	}
	public static int terminoFibo(int num) {
		if (num==1) {
			return 0;
		}
		int num1 = 0;
		int num2 = 1;
		int fib = '\0';
		for (int i = 2; i < num; i++) {
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
		}
		return fib;
	}
	
	
	
	
	
}
