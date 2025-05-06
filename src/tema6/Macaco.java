package tema6;

public class Macaco extends Mamifero {
	//no atrib propio
	
	//constructores
	public Macaco(String id, boolean esAdulto) {
		this(id,esAdulto,false);
		System.out.println("Construyendo Macaco..."+id+false);
		this.embarazada=false;
	}
	public Macaco(String id, boolean esAdulto,boolean esEmb) {
		super(id,esAdulto);
		this.embarazada=esEmb;
		System.out.println("Construyendo Macaco..."+id+esAdulto+this.embarazada);
	}
	//metodos
	public static final void comerPlatano() {//final en un metodo hace que al heredarse no se pueda sobreescribir
		System.out.println("Comiendo platano...");
	}
	public void crecer() {
		System.out.println("Macaco creciendo...");
	}
}
