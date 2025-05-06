package poligonosRegulares;
public class Apptest {
	public void dibujarTodos(Dibujable[] coleccion) {
		for (Dibujable c: coleccion) {
			c.dibujarTodo();
		}
	}
	
	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		TrianguloEquilatero t1=new TrianguloEquilatero();
		Cuadrado col=new Cuadrado();
		
	}

}
