package biblioteca;

public class Libro extends Publicacion{
	//att
	protected static int numEjemplares;
	protected static int numEjemplaresPrestados;
	protected static int vecesPrestado;
	protected static boolean esPrestado;
	//const
	public Libro(Libro lb) {
		super(lb.codigo,lb.titulo);
		this.annoPub=lb.annoPub;
		this.editorial=lb.editorial;
		this.numPag=lb.numPag;
		this.numEjemplares=lb.numEjemplares;
		this.numEjemplaresPrestados=lb.numEjemplaresPrestados;
		this.vecesPrestado=lb.vecesPrestado;
		this.esPrestado=lb.esPrestado;
	}
	
	public Libro(int cod, String tit)throws IllegalArgumentException {
		this(cod,tit,2025,"porDefectoEditorial",100,1);
		if(cod<=0||tit.isBlank()) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc;
		}
		this.numEjemplares=1;
		this.numEjemplaresPrestados=0;
		this.esPrestado=false;
	}
	
	public static int getNumEjemplares() {
		return numEjemplares;
	}

	public static void setNumEjemplares(int numEjemplares) {
		Libro.numEjemplares = numEjemplares;
	}

	public static int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public static void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		Libro.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public static int getVecesPrestado() {
		return vecesPrestado;
	}


	public static boolean isEsPrestado() {
		return esPrestado;
	}

	public static void tomarPrestado() {
		Libro.esPrestado = true;
		vecesPrestado+=1;
	}
	
	public static void devolverPrestado() {
		Libro.esPrestado = false;
		vecesPrestado-=1;
	}

	public Libro(int cod, String tit, int numpg,int numejemp)throws IllegalArgumentException {
		this(cod,tit,2025,"porDefectoEditorial",numpg,1);
		if(cod<=0||tit.isBlank()) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc;
		}
		this.numEjemplares=numejemp;
		this.numEjemplaresPrestados=0;
		this.esPrestado=false;
	}
	public Libro(int cod, String tit, int anno, String edit, int numpg,int numejemp)throws IllegalArgumentException {
		super(cod, tit, anno, edit, numpg);
		if(cod<=0||tit.isBlank()) {
			IllegalArgumentException exc=new IllegalArgumentException("Datos Erroneos");
			throw exc;
		}
		this.numEjemplares=numejemp;
		this.numEjemplaresPrestados=0;
		this.esPrestado=false;
	}
	//met
	
}
