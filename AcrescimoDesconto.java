package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class AcrescimoDesconto {

	public static void main(String[] args) {
		
		double valor_produto, acrescimo, desconto, porcentagem;
		int op;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		valor_produto = leitor.nextDouble();
		
		System.out.print("Digite uma porcentagem: ");
		porcentagem = leitor.nextDouble();
		
		System.out.println("Escolha uma op��o: 1 - Acr�scimo | 2 - Desconto");
		op = leitor.nextInt();
		
		switch(op){
		    case 1:
		        acrescimo = (valor_produto * (porcentagem/100)) + valor_produto;
		        System.out.println(acrescimo);
		        break;
		        
		    case 2:
		         desconto = valor_produto - (valor_produto * (porcentagem/100));
		         System.out.println(desconto);
		        break;
		        
		    default:
		        System.out.println("Op��o inv�lida!");
		        
		}
		
	}
	
}
