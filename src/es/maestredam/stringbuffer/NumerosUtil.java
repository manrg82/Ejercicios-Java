package es.maestredam.stringbuffer;

public class NumerosUtil {
	public static String decToBin(int num) {
		StringBuffer numBin=new StringBuffer();
		while(num>=1) {
			numBin.append(num%2);
			num=num/2;
		}
		int numer;
		return numBin.reverse().toString();
	}
	
	
	public static int binToDec(StringBuffer num) {
		int numfin=0;
		num=num.reverse();
		int cont=0;
		for(int i=0;i<num.length();i++) {
			if(num.charAt(i)=='1') {
				int pot=(int)(Math.pow(2,cont));
				numfin=numfin+pot;
			}
			cont++;
			
		}
				
		return numfin;
	}
	
}
