package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class SomaGauss02 {

	public static void main(String[] args) {
    	int totalPares = 0;
     	int somaGauss = 0;
        int numInicial;
    	int numFinal;
    	boolean flag = true;
    	Scanner leitor = new Scanner(System.in);
    	System.out.println("Este programa soma todos os algarismos dentro de uma faixa de n�meros.");
    	
    	while(flag){
        	System.out.print("Digite o primeiro n�mero da faixa: ");
        	numInicial = leitor.nextInt();
        	
        	System.out.print("Digite o �ltimo n�mero da faixa: ");
        	numFinal = leitor.nextInt();
        	if(numInicial < numFinal){
            	for(int num = numInicial; num <= numFinal;num++){
                    totalPares = num;
                }
                somaGauss = (totalPares * (numInicial + numFinal))/2;
                System.out.println("A soma de " + numInicial + " a " + numFinal + " vale "+somaGauss);
                flag = false;
        	} else{
        	    System.out.println("N�mero inicial n�o pode ser maior ou igual ao N�mero final.");
        	}
    	}  
	}
	
}
