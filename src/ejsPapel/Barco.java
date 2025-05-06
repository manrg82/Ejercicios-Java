package ejsPapel;

public class Barco {
	private String[]tipos;
	private int[]longTipos;
	private int longitud;
	private String tipo;
	private int[]coord;
	private int estado;//0=intacto, 1=tocado, 2=hundido
	//constructores
	
	
	public Barco(int tipoInp,int coordX, int coordY) {
		
		this.tipos=new String[]{"Lancha","Submarino","Buque","Portaaviones"};
		this.longTipos= new int[]{1,2,3,4};
		switch(tipoInp) {
		case 1:
				this.tipo=tipos[0];
				this.longitud=longTipos[0];
			break;
		case 2:
				this.tipo=tipos[1];
				this.longitud=longTipos[1];
			break;
		case 3:
				this.tipo=tipos[2];
				this.longitud=longTipos[2];
			break;
		case 4:
				this.tipo=tipos[3];
				this.longitud=longTipos[3];
			break;
		default:
				this.tipo=tipos[0];
				this.longitud=longTipos[0];
			break;
		}
		this.coord=new int[] {coordX,coordY};
		this.estado=0;
	}
	
	
	//metodos
	public static void disparar(int x,int y) {
		
	}


	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int[] getCoord() {
		return coord;
	}


	public void setCoord(int[] coord) {
		this.coord = coord;
	}


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}

}
