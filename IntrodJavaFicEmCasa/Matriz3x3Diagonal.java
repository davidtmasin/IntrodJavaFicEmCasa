package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Matriz3x3Diagonal {

	
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    int matriz[][] = new int[3][3]; //[linhas][colunas]
    
	    
	    for(int linha = 0; linha <= 2; linha++){
	        for(int coluna = 0; coluna <= 2; coluna++){
	            
	            System.out.print("Digite um n�mero: ");
	            matriz[linha][coluna] = leitor.nextInt();
	        }
	    }
	    
	    System.out.println("\nMATRIZ - Representa��o 1");
	    for(int linha = 0; linha <= 2; linha++){
	        for(int coluna = 0; coluna <= 2; coluna++){
	            
	            System.out.println("Posi��o "+linha+coluna+": "+matriz[linha][coluna]);
	        }
	    }
	    
	    System.out.println("\nMATRIZ - Representa��o 2");
	    for(int linha = 0; linha <= 2; linha++){
	        for(int coluna = 0; coluna <= 2; coluna++){
	            
	            System.out.print(matriz[linha][coluna]+ "   ");
	        }
	        System.out.println();
	    }
	    
	     System.out.println("\nA diagonal principal desta matriz 3x3 �: ");
	     System.out.println(matriz[0][0]);
	     System.out.println("   "+matriz[1][1]);
	     System.out.println("      "+matriz[2][2]);
	    
	    
	}
	
}
