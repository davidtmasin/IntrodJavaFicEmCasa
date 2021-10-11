package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class PlayingToStrings{

	public static void main(String[] args) {
	    String a = "Xablau";
	    String b;
	    
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.println("Digite um nome");
	    b = leitor.next();
	    
	    System.out.println(a.equals(b));
	    System.out.println(a.length());
	    System.out.println(a.charAt(2));
	    System.out.println(a.toLowerCase());
	    System.out.println(a.toUpperCase());
	}
}
