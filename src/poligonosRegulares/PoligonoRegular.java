package poligonosRegulares;

abstract public class PoligonoRegular {
	protected String[] arrColores= {"NEGRO","VERDE","ROJO","AZUL"};
	protected String color;
	protected static float longitudLado;
	protected static boolean esRelleno;
	protected static boolean esRotado;
	protected static float gradosRotacion;
	//constructores
	
	public PoligonoRegular() {
		this(10,0);
	}
	public PoligonoRegular(float longitud) {
		this(longitud,0);
	}
	public PoligonoRegular(float longitud, int color) throws IllegalArgumentException{
		//para los colores 0=NEGRO, 1=VERDE, 2=ROJO, 3=AZUL
		if(color<5) {
			this.color=arrColores[color];
		}else{
			IllegalArgumentException exc=new IllegalArgumentException("Color Incorrecto, 0=NEGRO, 1=VERDE, 2=ROJO, 3=AZUL");
			throw exc;
		}
		
		this.longitudLado=longitud;
	}
	//metodos
	public static float getPerimetro() {
		float per=longitudLado*4;
		return per;
	}
	public static void rotar(float grados) {
		if(!esRotado) {
			gradosRotacion+=grados;
			esRotado=true;
		}else {
			gradosRotacion+=grados;
		}
		if(gradosRotacion==0) {
			esRotado=false;
		}
	}
	
}
