package IntrodJavaFicEmCasa;

public class RepeatStructure02 {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++){
		    
		    System.out.println(i);
		}
		
		String frutas[] = {"maçã", "banana", "laranja", "abacate", "uva", "abacaxi"};
		
		for(int x = 0; x < 6; x++){
		    System.out.println(frutas[x]);
		}
		
		//For melhorado
		
		for(String fruta: frutas){
		    System.out.println(fruta);
		}
	}
	

}
