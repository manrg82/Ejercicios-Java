package biblioteca;

public class Publicacion {
	//att
	protected static int codigo;
	protected static String titulo;
	protected static int annoPub;
	protected static String editorial;
	protected static int numPag;
	
	//const
	public Publicacion(Publicacion pb) {
		this.codigo=pb.codigo;
		this.titulo=pb.titulo;
		this.annoPub=pb.annoPub;
		this.editorial=pb.editorial;
		this.numPag=pb.numPag;
	}
	
	public Publicacion(int cod,String tit) throws IllegalArgumentException{
		this(cod,tit,2025,"porDefectoEditorial",123);
		if(cod<=0||tit.isBlank()) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc;
		}
	}
	
	
	public Publicacion(int cod, String tit, int anno, String edit, int numpg) throws IllegalArgumentException{
		if(cod<=0||tit.isBlank()) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc; 
		}
		this.codigo=cod;
		this.titulo=tit;
		this.annoPub=anno;
		this.editorial=edit.toLowerCase();
		this.numPag=numpg;		
	}
	
	//met
	//public static String toString() {
		
	//}
	
	
}
