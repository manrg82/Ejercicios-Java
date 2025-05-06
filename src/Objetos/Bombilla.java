package Objetos;

public class Bombilla {
	private boolean encendida;

	public boolean isEncendida() {
		return encendida;
	}
	//constructor que hace que por defecto la bombilla este apagada
	public Bombilla(boolean estadoInicial) {
		if(!estadoInicial) {
			this.encendida=false;
		}else {
			this.encendida=true;
		}
		System.out.printf("Bombilla creada (%b)(%d)%n",encendida,estadoInicial);//traza
	}
	public Bombilla() {
		this.encendida=false;
		System.out.printf("Bombilla creada (%b)%n",encendida);
	}
	//metodos
	public void encender() {
		if(!encendida) {
			encendida = true;		
		}
	}
	public void apagar() {
		if(encendida) {
			encendida = false;
		}
	}
}
