package IntrodJavaFicEmCasa;

public class ParesEntre85907ESoma {

	public static void main(String[] args) {
	    int soma = 0;
	    for(int i=85; i<=907; i++){
	        
	        if(i%2==0){
	            System.out.println(i);
	            
	            soma+=i;
	        }
	    }
	    
	    System.out.println("A soma do pares entre 85 e 907 vale: "+soma);
	}
	
}
