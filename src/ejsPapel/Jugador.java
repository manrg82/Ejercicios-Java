package ejsPapel;

public class Jugador {
	private static String username;
	private static boolean isHabilitada;
	private static String clave;
	private static String correo;
	
	//constructores
	public Jugador(String nombre) {
		this(nombre,"","");
		habilitar();
	}
	public Jugador(String nombre,String clave1,String correo) {
		this.username=nombre;
		this.clave=cifrar(clave1);
		this.correo=correo;
		habilitar();
	}
	//metodos
	public static boolean getHabilitada() {
		return isHabilitada;
	}
	public static String getUsername() {
		return username;
	}
	public static String getCorreo() {
		return correo;
	}
	public static void habilitar() {
		if(!isHabilitada) {
			isHabilitada=true;
		}
	}
	public static void deshabilitar() {
		if(isHabilitada) {
			isHabilitada=false;
		}
	}
	public static boolean autentificar(String claveClara) {
		if(cifrar(claveClara).equals(clave)) {
			return true;
		}else {
			return false;
		}
	}
	public static String cifrar(String claveClara) {
		StringBuffer clave=new StringBuffer(claveClara.length());
		for(int i=0;i<claveClara.length();i++) {
			if(claveClara.charAt(i)=='}') {
				clave.append(" ");
			}else {
				clave.append((claveClara.charAt(i))+1);
			}
		}
		return clave.toString();
	}
	public static void main(String[] args) {
		Jugador j1=new Jugador("Antonio","1234","a@a.com");
		System.out.println(autentificar("1234"));
	}
	
}
