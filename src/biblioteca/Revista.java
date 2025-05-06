package biblioteca;

public class Revista extends Publicacion{
	//att
	protected static int numTemporada;
	protected static int numRevista;
	//const
	public Revista(Revista rv) {
		super(rv.codigo,rv.titulo);
		this.annoPub=rv.annoPub;
		this.editorial=rv.editorial;
		this.numPag=rv.numPag;
		this.numTemporada=rv.numTemporada;
		this.numRevista=rv.numRevista;
	}
	
	public Revista(int cod, String tit, int numpg,int numtemp, int numrev)throws IllegalArgumentException {
		this(cod,tit,2025,"porDefectoEditorial",numpg,numtemp,numrev);
		if(cod<=0||tit.isBlank()||numtemp<=0||numrev<=0) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc;
		}
		this.numTemporada=numtemp;
		this.numRevista=numrev;
	}
	public Revista(int cod, String tit, int anno, String edit, int numpg, int numtemp, int numrev) throws IllegalArgumentException{
		super(cod, tit, anno, edit, numpg);
		if(cod<=0||tit.isBlank()||numtemp<=0||numrev<=0) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc;
		}
		this.numTemporada=numtemp;
		this.numRevista=numrev;
	}
	//met

}
