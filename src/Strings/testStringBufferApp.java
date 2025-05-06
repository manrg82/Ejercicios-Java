package Strings;

public class testStringBufferApp {

	public static void main(String[] args) {
		String saludoES="HOLA";
		String saludo= saludoES+" / HELLO";
		saludo=saludo.concat(".");
		System.out.println(saludo);
// cuantos objetos string tengo en memoria? 3
//=========================================
		int cont = 0;
		String str = "Serie ";
		while (cont < 5){
		str = str + cont;
		cont++;
		}
		System.out.println(str);
// cuantos objetos string tengo en memoria? 6
//=========================================
		StringBuffer strBuffer=new StringBuffer(6000);
		strBuffer.append("Serie: ");
		cont=0;
		while (cont < 5){
			strBuffer.append(cont);
			cont++;
			}
		strBuffer.reverse();
		String strFinal=strBuffer.toString();
		System.out.println(strFinal);
		
		
		
	}

}
