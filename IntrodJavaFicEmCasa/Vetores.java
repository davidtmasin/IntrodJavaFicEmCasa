package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
	    int numeros[] = new int[10];
	    
	  
		
		for(int i = 0; i<=9; i++){
		    
		    System.out.print("Digite um n�mero: ");
		    numeros[i] = leitor.nextInt();
		    
		}
		System.out.println("\n");
		System.out.println("VETOR: ");
		for(int i = 0; i<=9; i++){
		    
		    System.out.println("�ndice "+i+": "+numeros[i]);
		    
		}
		
		
	
	}
	
}
