package tema6;

public class Animal{
	protected String identificador;
	protected boolean adulto;
	//constructor
	public Animal(String identificador) {
		this(identificador,false);
	}
	public Animal(String identificador, boolean adulto) {
		this.adulto=adulto;
		System.out.println("Constructor del animal "+identificador+this.adulto);
	}
	//metodos
	public void respirar() {
		System.out.println("Respirando con pulmones...");
	}
	public void crecer() {
		if(!adulto) {
			System.out.println("Creciendo...");
		}
	}
	public void comer() {
		System.out.println("Comiendo...");
	}
}
