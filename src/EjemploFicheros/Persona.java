package EjemploFicheros;

public class Persona implements java.io.Serializable{
	private static final long serialVersionUID = 47463051136476284L;
	private String nombre;
	private boolean myEd;
	private double sld;
	//
	public Persona() {
		this("PREDETERMINADO",true,0);
	}
	public Persona(String nm, boolean myEd, double sld) {
		this.nombre=nm;
		this.myEd=myEd;
		this.sld=sld;
	}
	//
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isMyEd() {
		return myEd;
	}
	public void setMyEd(boolean myEd) {
		this.myEd = myEd;
	}
	public double getSld() {
		return sld;
	}
	public void setSld(double sld) {
		this.sld = sld;
	}
}
