package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class UsandoWhile {

	public static void main(String[] args) {
	    
	    int cont = 0;
	    int soma = 0;
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("Digite um n�mero: ");
	    int num = leitor.nextInt();
	    System.out.print("\n");
	    
	    while(num > 0){
	        soma+=num;
	        cont++;
	        System.out.print("Digite o pr�ximo n�mero: ");
	        num = leitor.nextInt();
	        System.out.print("\n");
	    
	    }
	    
	     System.out.println("Quantidade de n�meros: "+cont);
	     System.out.println("A soma dos numeros: "+soma);
	     float media = soma / cont;
	     System.out.println("A m�dia dos numeros: "+media);
	}
	
}
