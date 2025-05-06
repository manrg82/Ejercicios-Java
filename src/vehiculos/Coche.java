package vehiculos;

public class Coche {
	//att
	protected static String matricula;
	protected static int annoCompra;
	protected static int volDeposito;
	protected static String tipo;
	protected String[] tipos= {"electrico","gasolina"};
	protected static double nivelComb;
	protected static int km;
	protected static boolean esEncendido;
	protected static int velocidad;
	//const
	
	public Coche(){
		this(null,2000,1,"Gasolina",100,0,false,0);
	}
	public Coche(String Matric){
		this(Matric,2000,1,"Gasolina",100,0,false,0);
	}
	public Coche(String Matric,int vol){
		this(Matric,2000,1,"Gasolina",100,0,false,0);
	}
	public Coche(String matricula,int anno,int vol, String tipo, int nivel, int km, boolean arr, int vel) {
		this.matricula=matricula;
		this.annoCompra=anno;
		this.volDeposito=vol;
		this.tipo=tipos[0];
		this.nivelComb=nivel;
		this.km=km;
		this.esEncendido=arr;
		this.velocidad=vel;
	}
	//metod
	public static void acelerar(int cant) {
		velocidad+=cant;
	}
	public static void frenar(int cant) {
		velocidad-=cant;
	}
	public static void desplazarse(int kilom) {
		km+=kilom;
	}
	public static void repostar(int cant) {
		nivelComb+=cant;
	}
	public static void repostar() {
		nivelComb=volDeposito;
	}
	public static void arrancar() {
		if(!esEncendido) {
			esEncendido=true;
		}
	}
	public static void apagar() {
		if(esEncendido) {
			esEncendido=false;
		}
	}
	public static boolean getArrancado() {
		return esEncendido;
	}
	public String getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}
	public static int getKm() {
		return km;
	}
	public String toString() {
		String str= "Matricula "+matricula+", Año compra: "+annoCompra+", Volumen del Deposito: "+volDeposito+", Tipo de vehiculo: "+tipo+", Nivel de combustible:  "+nivelComb+" Kilometros recorridos "+km+" "+"Esta encendido?" +esEncendido+" km: "+velocidad;
		return str;
	}
}

