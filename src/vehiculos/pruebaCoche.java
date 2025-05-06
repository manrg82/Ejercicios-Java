package vehiculos;

public class pruebaCoche {
	public static void arrancarYDesplazar(Coche array[], int km) {
		for(int i=0;i<array.length;i++) {
			if(array[i] instanceof Grua) {
				if(!array[i].getArrancado()) {
					System.out.printf("La grua se ha arrancado %n");
					array[i].arrancar();
				}
				System.out.printf("La grua se ha desplazado %d KM %n", array[i].getKm());
				System.out.printf("El brazo de la grua sube y baja 5 veces%n");
				Grua g=(Grua)array[i];
				for(int j=0;j<5;j++) {
					System.out.printf("El brazo de la grua sube %n");
					g.subirBrazo(5);
					System.out.printf("El brazo de la grua baja %n");
					g.bajarBrazo(5);
				}
				array[i].apagar();
				System.out.printf("La grua se ha apagado %n");
				System.out.println(i);
			}else if(array[i] instanceof Coche) {
				if(!array[i].getArrancado()) {
					System.out.printf("El coche se ha arrancado %n");
					array[i].arrancar();
				}
				array[i].desplazarse(5);
				System.out.printf("El coche se ha desplazado %d KM %n", array[i].getKm());
				array[i].apagar();
				System.out.printf("El coche se ha apagado %n");
				System.out.println(i);
			}
			System.out.println(array[i].toString());
		}
	}
	public static void arrancarYDesplazar2(Coche array[], int km) {
		for(int i=0;i<array.length;i++) {
			System.out.println("pos"+i);	
			if(!array[i].getArrancado()) {
				System.out.printf("El coche se ha arrancado %n");
				array[i].arrancar();
			}
			array[i].desplazarse(5);
			System.out.printf("El coche se ha desplazado %d KM %n", array[i].getKm());
			if(array[i] instanceof Grua) {
				Grua g= (Grua)array[i];
				for(int j=0;j<5;j++) {
					System.out.printf("El brazo de la grua sube %n");
					g.subirBrazo(5);
					System.out.printf("El brazo de la grua baja %n");
					g.bajarBrazo(5);
				}
			}
			array[i].apagar();
			System.out.printf("El coche se ha apagado %n");
			System.out.println(array[i].toString());
		}
	}
	public static void main(String[] Args) {
		Coche c1=new Coche();
		Grua g1=new Grua();
		Coche c2=new Coche("23456BCD",110);
		Grua g2=new Grua(110,"12345ABC");
		Coche c3=new Coche("23456BCD",110);
		Grua g3=new Grua(110,"12345ABC");
		Coche[] Coches=new Coche[5];
		Coches[0]=c1;
		Coches[1]=c2;
		Coches[2]=g2;
		Coches[3]=c3;
		Coches[4]=g3;
		/*for(Coche c:Coches) {
			if(c instanceof Grua) {
			System.out.println(c.getMatricula()+" es una grua");
			Grua g=(Grua)c;
			System.out.println(g.getLongBrazo());
			}else if(c instanceof Coche) {
				System.out.println(c.getMatricula()+" es un coche");		
			}
		}*/
		arrancarYDesplazar2(Coches, 5);
		//System.out.println(Coches.length);
		 
	}
}
