package poligonosRegulares;

public class TrianguloEquilatero extends PoligonoRegular implements Dibujable{
	protected static float altura;
	protected static int NUMLADOS=3;
	//constructores
	public TrianguloEquilatero () {
		this(10);
	}
	public TrianguloEquilatero (float altura) {
		super();
		this.altura=altura;
	}
	//metodos
	public static float getPerimetro() {
		float per=longitudLado*NUMLADOS;
		return per;
	}
	public static float getArea() {
		float ar=(longitudLado*altura)/2;
		return ar;
	}
	public void dibujar() {
		System.out.println("Triangulo");
	}
	
	
}
