package IntrodJavaFicEmCasa;

/******************************************************************************

Fa�a um programa em JAVA que simular� um caixa eletr�nico. 
Para isso, o programa dever� exibir um menu com as seguintes op��es:
1 - Dep�sito; 2 - Saque; 3 - Exibir Saldo; 0 - Sair. 
Em seguida deve ser lida a op��o do usu�rio e executar sua respectiva a��o, por exemplo, 
se for escolhida a op��o 1, dever� ser realizado um dep�sito no saldo do usu�rio. 
Para realizar um dep�sito ou saque � necess�rio ler o valor que ser� utilizado na opera��o. 
Caso seja um deposito, o valor dever� ser acrescido ao saldo. 
Caso seja um saque, o valor dever� ser subtra�do do saldo. 
O saldo inicialmente ter� valor zero.
O programa s� dever� parar quando o usu�rio digitar a op��o de sair (zero).
*******************************************************************************/
import java.util.Scanner;

public class CaixaEletronico{
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		boolean flag = true;
		float saldo = 0;
		float deposito = 0;
		float saque = 0;
		
		while(flag){
		    System.out.println("*********************************************************************");
		    System.out.println("Seja bem-vindo(a) ao servi�o de Caixa Eletr�nico 24h do Banco Jubileu");
		    System.out.println("Digite 1 - para realizar um DEP�SITO BANC�RIO.");
		    System.out.println("Digite 2 - para realizar um SAQUE ELETR�NICO.");
		    System.out.println("Digite 3 - para exibir seu SALDO BANC�RIO.");
		    System.out.println("Digite 0 - para ENCERRAR o seu atendimento.");
		    System.out.println("*********************************************************************");
		    System.out.print("\nInforme uma op��o: "); 
		    opcao = leitor.nextInt();
            System.out.println("\n"); 
            
            switch(opcao){
                case 1:
                        System.out.print("Informe o valor do seu dep�sito: R$ ");
                        deposito = leitor.nextFloat();
                        saldo+=deposito;
                        System.out.println("Dep�sito efetuado com sucesso! Verfique seu saldo na op��o 3.\n");
                    break;
                    
                case 2: 
                    System.out.print("Informe o valor do seu saque: R$ ");
                    saque = leitor.nextFloat();
                    if((saldo == 0)||(saque > saldo)){
                         System.out.println("OPERA��O N�O PERMITIDA - SALDO INSUFICIENTE!");
                         System.out.println("Seu valor em conta � de R$"+saldo);
                         System.out.println("\n");
                    } else{
                         saldo-=saque;
                         System.out.println("Saque efetuado com sucesso! Verfique seu saldo na op��o 3.\n");
                    }
                    
                    break;
                    
                case 3: 
                     System.out.print("Seu saldo � de R$ "+saldo);
                     System.out.println("\n");
                    break;
                    
                case 0: 
                     System.out.println("Agradecemos por utilizar nossos servi�os.");
                     flag = false;  
                    break;
                    
                default:
                     System.out.println("Desculpe, n�o entendi sua solicita��o, por favor, digite  uma op��o da listagem abaixo.\n");
            }
		}
	}
}
