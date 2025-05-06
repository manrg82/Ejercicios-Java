package ejrecursividad;

public class Recursiv {
	public static void pintaLineaR(int num, char car) {
		if(num==0) {
			return;
		}
		if(num>0) {
			System.out.print(car);
			pintaLineaR(num-1,car);
		}
			
	}
	public static long factorialR(int num) {
		long factor = num;
		
		if(num!=0) {
			System.out.printf("!"+(num)+"= "+factorialR(num-1));
		}
		return factor;
	}
	public static String decToBinR(int num, StringBuffer sb) {
		if(num<2) {
			sb.append(num);
			sb.reverse();
		}
		if(num>1) {
			sb.append(num%2);
			num=num/2;
			decToBinR(num,sb);
		}
		return sb.toString();
	}
//	public static long terminoFiboR(int num) {
//		long fibfin = 0;
//		return fibfin;
//		
//	}
}
