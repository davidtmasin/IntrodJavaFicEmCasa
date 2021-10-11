package IntrodJavaFicEmCasa;

/******************************************************************************

Faça um programa em JAVA que simulará um caixa eletrônico. 
Para isso, o programa deverá exibir um menu com as seguintes opções:
1 - Depósito; 2 - Saque; 3 - Exibir Saldo; 0 - Sair. 
Em seguida deve ser lida a opção do usuário e executar sua respectiva ação, por exemplo, 
se for escolhida a opção 1, deverá ser realizado um depósito no saldo do usuário. 
Para realizar um depósito ou saque é necessário ler o valor que será utilizado na operação. 
Caso seja um deposito, o valor deverá ser acrescido ao saldo. 
Caso seja um saque, o valor deverá ser subtraído do saldo. 
O saldo inicialmente terá valor zero.
O programa só deverá parar quando o usuário digitar a opção de sair (zero).
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
		    System.out.println("Seja bem-vindo(a) ao serviço de Caixa Eletrônico 24h do Banco Jubileu");
		    System.out.println("Digite 1 - para realizar um DEPÓSITO BANCÁRIO.");
		    System.out.println("Digite 2 - para realizar um SAQUE ELETRÔNICO.");
		    System.out.println("Digite 3 - para exibir seu SALDO BANCÁRIO.");
		    System.out.println("Digite 0 - para ENCERRAR o seu atendimento.");
		    System.out.println("*********************************************************************");
		    System.out.print("\nInforme uma opção: "); 
		    opcao = leitor.nextInt();
            System.out.println("\n"); 
            
            switch(opcao){
                case 1:
                        System.out.print("Informe o valor do seu depósito: R$ ");
                        deposito = leitor.nextFloat();
                        saldo+=deposito;
                        System.out.println("Depósito efetuado com sucesso! Verfique seu saldo na opção 3.\n");
                    break;
                    
                case 2: 
                    System.out.print("Informe o valor do seu saque: R$ ");
                    saque = leitor.nextFloat();
                    if((saldo == 0)||(saque > saldo)){
                         System.out.println("OPERAÇÃO NÃO PERMITIDA - SALDO INSUFICIENTE!");
                         System.out.println("Seu valor em conta é de R$"+saldo);
                         System.out.println("\n");
                    } else{
                         saldo-=saque;
                         System.out.println("Saque efetuado com sucesso! Verfique seu saldo na opção 3.\n");
                    }
                    
                    break;
                    
                case 3: 
                     System.out.print("Seu saldo é de R$ "+saldo);
                     System.out.println("\n");
                    break;
                    
                case 0: 
                     System.out.println("Agradecemos por utilizar nossos serviços.");
                     flag = false;  
                    break;
                    
                default:
                     System.out.println("Desculpe, não entendi sua solicitação, por favor, digite  uma opção da listagem abaixo.\n");
            }
		}
	}
}
