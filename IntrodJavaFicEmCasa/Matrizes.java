package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    int matriz[][] = new int[2][3]; //[linhas][colunas]
    	
    	/*   
            	      colunas
            	      | 0 | 1
            	   -----------
            linha  0 | 1 |  1    
            	   -----------
            linha  1 | 2 |  2
            	
    	
    	*/    
	    
	    
	    for(int linha = 0; linha <= 1; linha++){
	        for(int coluna = 0; coluna <= 2; coluna++){
	            
	            System.out.print("Digite um n�mero: ");
	            matriz[linha][coluna] = leitor.nextInt();
	        }
	    }
	    
	    System.out.println("\nMATRIZ: ");
	    for(int linha = 0; linha <= 1; linha++){
	        for(int coluna = 0; coluna <= 2; coluna++){
	            
	            System.out.println("Posi��o "+linha+coluna+": "+matriz[linha][coluna]);
	        }
	    }
	    
	    System.out.println("\nMATRIZ: ");
	    for(int linha = 0; linha <= 1; linha++){
	        for(int coluna = 0; coluna <= 2; coluna++){
	            
	            System.out.print(matriz[linha][coluna]+ "   ");
	        }
	        System.out.println();
	    }
	}
	
}
