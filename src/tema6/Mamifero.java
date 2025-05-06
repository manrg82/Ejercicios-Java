package tema6;

public class Mamifero extends Animal{
	protected boolean embarazada;
	
	//constructores
	public Mamifero(String id, boolean esAdulto) {
		super(id,esAdulto);
		System.out.println("Construyendo Mamifero..."+id+esAdulto);
		this.embarazada=false;
	}
	//metodos
	public void Mamar() {
		System.out.println("Mamando...");
	}
}
