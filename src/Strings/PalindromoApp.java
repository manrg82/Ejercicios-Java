package Strings;

import java.util.Scanner;

public class PalindromoApp {
	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		String recor1=new String(tec.nextLine());
		String recor=recor1.toLowerCase();
		StringBuffer buf=new StringBuffer(recor.replace(" ","").toLowerCase());
		recor=buf.reverse().toString();
		System.out.println(recor);
		String recor2=recor.substring(0,recor.length()/2);
		if(recor.length()%2==0) {
			if (recor2==recor.substring(recor.length()/2, recor.length())) {
				System.out.println("SI es palindromo");
			}else {
				System.out.println("NO es palindromo");
			}
		}else {
			if (recor.substring(0,recor.length()/2)==recor.substring((recor.length()/2),recor.length())) {
				System.out.println("SI es palindromo");
			}else {
				System.out.println("NO es palindromo");
			}
		}
		
		System.out.println(recor.substring(0,(recor.length()/2)));
		System.out.println(recor.substring((recor.length()/2)+1,recor.length()));
		System.out.println(recor);
	}

}
