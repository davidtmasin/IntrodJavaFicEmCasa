package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class somaGauss {

	public static void main(String[] args) {
    	int totalPares = 0;
     	int somaGauss = 0;
    	int op;
    	boolean flag = true;
    	Scanner leitor = new Scanner(System.in);

    	while(flag){
    	    
    	        System.out.println("Digite 1 para somar de 1 a 100");
            	System.out.println("Digite 2 para somar de 1 a 200");
    	        System.out.println("Digite 3  para somar de 1 a 300");
                op = leitor.nextInt();
    	        
            	switch(op){
            	    case 1:
            	            for(int num = 1; num <= 100; num++){
                        	    totalPares = num;
                        	}
                        	
                        	totalPares = totalPares / 2;
                        	somaGauss = totalPares * 101;
                        	System.out.println("A soma de 1 a 100 vale "+somaGauss);
                        	flag = false;
            	    break;
            	        
        	        case 2:
        	                for(int num = 1; num <= 200; num++){
                        	    totalPares = num;
                        	}
                        	
                        	totalPares = totalPares / 2;
                        	somaGauss = totalPares * 201;
                        	System.out.println("A soma de 1 a 200 vale "+somaGauss);
                        	flag = false;
        	        break;
        	       
        	       case 3:
        	                for(int num = 1; num <= 300; num++){
                        	    totalPares = num;
                        	}
                        	
                        	totalPares = totalPares / 2;
                        	somaGauss = totalPares * 301;
                        	System.out.println("A soma de 1 a 300 vale "+somaGauss);
                        	flag = false;
        	        break;
            	            
            	   default:
            	       System.out.println("Op��o inv�lida!");
            	}
    	}
    	
	}
	
}
