package ejrecursividad;

public class PruebaRecursivApp {

	public static void main(String[] args) {
		Recursiv.pintaLineaR(5,'@');
		System.out.println("");
//		Recursiv.factorialR(5);
		StringBuffer sb=new StringBuffer();
		System.out.println(Recursiv.decToBinR(11,sb));
	}

}
