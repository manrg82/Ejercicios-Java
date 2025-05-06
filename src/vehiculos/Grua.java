package vehiculos;

public class Grua extends Coche{
	private static int longBrazo;
	
	//construc
	public Grua(String Matric) {
		super(Matric);
		this.longBrazo=2;
	}
	public Grua() {
		super();
		this.longBrazo=2;
	}
	public Grua(int longit,String Matric) {
		super(Matric);
		this.longBrazo=longit;
	}
	public Grua(String matricula,int anno,int vol, String tipo, int nivel, int km, boolean arr, int vel, int longit) {
		super(matricula, anno,vol, tipo, nivel, km, arr, vel);
		this.longBrazo=longit;
	}
	//metodos
	public boolean equals(Object obj) throws IllegalArgumentException{
		if(obj instanceof Grua) {
			Grua g=(Grua) obj;
			if(this.longBrazo==g.longBrazo&&this.matricula==g.matricula) {
				return true;
			}else {
				return false;
			}
		}else {
			IllegalArgumentException exc=new IllegalArgumentException("Objeto Inválido, Introduce un objeto de tipo Grua");
			throw exc;
		}	
	}
	public int getLongBrazo() {
		return longBrazo;
	}
	public void setLongBrazo(int longBrazo) {
		this.longBrazo = longBrazo;
	}
	public static void subirBrazo(int cant) {
		longBrazo=longBrazo+cant;
	}
	public static void bajarBrazo(int cant) {
		longBrazo=longBrazo-cant;
	}
	public static void arrastrarCable(int longit) {
		System.out.printf("He arrastrado el cable %d%n", longit);
	}
	public String toString() {
		String str= "Matricula "+matricula+", Año compra: "+annoCompra+", Volumen del Deposito: "+volDeposito+", Tipo de vehiculo: "+tipo+", Nivel de combustible:  "+nivelComb+" Kilometros recorridos "+km+" "+"Esta encendido?" +esEncendido+" km: "+velocidad+", Longitud del brazo: "+longBrazo;
		return str;
	}
}
