package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class SomatorioFaixaNumeros {

	public static void main(String[] args) {
    	int somaNum = 0;
    	int numInicial;
    	int numFinal;
    	Scanner leitor = new Scanner(System.in);
    	System.out.println("Este programa soma todos os algarismos dentro de uma faixa de n�meros.");
    	
    	System.out.print("Digite o primeiro n�mero da faixa: ");
    	numInicial = leitor.nextInt();
    	
    	System.out.print("Digite o �ltimo n�mero da faixa: ");
    	numFinal = leitor.nextInt();
    	
    	for(int num = numInicial; num<=numFinal;num++){
    	    
    	    somaNum = somaNum + num;
    	    System.out.println("Soma "+num+": "+somaNum);
    	    
    	}
    	
    	System.out.println("O somat�rio de " + numInicial + " a " + numFinal + " � igual a "+somaNum+".");
	}
	
}
