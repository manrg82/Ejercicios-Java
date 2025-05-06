package ejercicios2;

public class Letras {
	public static char obtenerCar(int num) {
		if (num>=33&&num<=126) {
			char car=(char)num;
			return car;	
		}else {
			return '?';
		}
	}
	public static int obtenerCodigo(char car) {
		int num=(int)car;
		return num;
	}
	public static char generaLetra() {
		int num=0;
		char letra='@';
		while(letra=='@') {
			num=Util.generaNumAleatorio('A','z');
			if ((num>='A'&&num<='Z')||(num>='a'&&num<='z')) {
				letra=(char)num;
			}
		}
		return (char)num;
	}
}
