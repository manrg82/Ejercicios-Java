package testGit;

public class TestFUtilApp {

	public static void main(String[] args) {
		if(FUtil.existe("texto1.txt")){
			System.out.println("Existe");
		}else {
			System.out.println("No Existe");
		}
		if(FUtil.existe("patata.ppt")){
			System.out.println("Existe");
		}else {
			System.out.println("No Existe");
		}
		if(FUtil.existe("")){
			System.out.println("Existe");
		}else {
			System.out.println("No Existe");
		}
	}

}
