package testGit;
import java.io.File;
public class FUtil {
	public static boolean existe(String filename) throws IllegalArgumentException {
		if(filename.isBlank()||filename.isEmpty()) {//asdfg
			IllegalArgumentException exc=new IllegalArgumentException("ARGUMENTO INCORRECTO, NO INTRODUZCA ESPACIOS O LINEAS VACIAS");
		}
		File file = new File(filename);
		if (file.exists()) {
			return true;
		}
		return false;
	}
}
