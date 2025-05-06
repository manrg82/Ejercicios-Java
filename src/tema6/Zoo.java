package tema6;

public class Zoo {

	public static void main(String[] args) {
		Animal Animal1=new Animal("A03");
		Mamifero Mamifero1=new Mamifero("MAM01", true);
		Macaco MacacoGordo=new Macaco("MACACO_GORDO-01",true,false);
		MacacoGordo.respirar();
		MacacoGordo.crecer();
		Macaco.comerPlatano();
		Pez nemo=new Pez();
		nemo.respirar();
		nemo.nadar();
	}

}
