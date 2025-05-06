package tema6;

public class Pez extends Animal{
	protected boolean aguaDulce;
	public Pez() {
		super("A01");
		System.out.println("glugluglu");
		this.aguaDulce=false;
	}
	public void nadar() {
		System.out.println("Nadando...");
	}
	public void respirar() {
		System.out.println("Respirando con branquias...");
	}
}
