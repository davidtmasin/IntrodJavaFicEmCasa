package IntrodJavaFicEmCasa;

public class ParesSoma85907 {

	public static void main(String[] args) {
		   int somaPares = 0;
		   
		   for(int i = 85; i <= 907; i++){
		       if((i%2)==0){
		           System.out.println(i);
		           somaPares = somaPares + i;
		       }
		   }
		   System.out.println("A soma dos pares compreendidos entre 85 e 907 resulta em "+somaPares);
		   
		}
	
}
