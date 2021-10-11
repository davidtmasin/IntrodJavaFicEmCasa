package IntrodJavaFicEmCasa;

public class Grupo50ValoresInteiros {
	public static void main(String[] args) {
	    int somaNumPositivo = 0;
	    int qtdeNumNegativo = 0;
	    
	    for(int i = 0; i <= 50; i++){
	        if((i%2)==0){
	            System.out.println(i);
	            
	            somaNumPositivo+=i;
	            
	        } else{
	            qtdeNumNegativo++;
	        }
	    }
	    
	    System.out.println("A soma dos números positivos de um grupo de 50 valores inteiros é de: "+somaNumPositivo);
	    System.out.println("A quantidade de números negativos de um grupo de 50 valores inteiros é de: "+qtdeNumNegativo);
	}
	
}
