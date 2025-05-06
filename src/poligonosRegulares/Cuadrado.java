package poligonosRegulares;

public class Cuadrado extends PoligonoRegular implements Dibujable{
	protected static int NUMLADOS=4;
	//constructores
	public Cuadrado() {
		super();
	}
	//metodos
	public static float getPerimetro() {
		float per=longitudLado*NUMLADOS;
		return per;
	}
	public static float getArea() {
		float ar=longitudLado*longitudLado;
		return ar;
	}
	public void dibujar() {
		System.out.println("Cuadrado");
	}
}
