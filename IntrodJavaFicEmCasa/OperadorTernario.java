package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
        
        int num1, num2, op;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o primeiro n�mero: ");
        num1 = leitor.nextInt();
        
        System.out.print("Digite o segundo n�mero: ");
        num2 = leitor.nextInt();
        
        System.out.println("\n****************************************************");
        System.out.println("* Agora escolha uma das op��es a seguir:           *");
        System.out.println("* 1 - Verificar o maior entre dois n�meros         *");
        System.out.println("* 2 - Verificar se o n�mero � para ou �mpar        *");
        System.out.println("* 3 - Verificar se o n�mero � negativo ou positivo *");
        System.out.println("* 4 - Verificar se o n�mero � m�ltiplo de 6        *");
        System.out.println("* 5 - Fazer todas as a��es anteriores              *");
        System.out.println("****************************************************");
        op = leitor.nextInt();
        
        System.out.println("\n");
        
        switch(op){
            
            case 1:
                System.out.println((num1 > num2)? num1+" � maior que "+num2 :num1 == num2?"Os dois n�meros s�o iguais":num2+" � maior que "+num1);
                break;
                
            case 2:
                System.out.println((num1 % 2) == 0 ?num1+ " � PAR":num1+" � �MPAR");
                System.out.println((num2 % 2) == 0 ?num2+ " � PAR":num2+" � �MPAR");
                break;
            
            case 3:
                System.out.println(num1>=0?num1+" � um n�mero positivo":num1+" � um n�mero negativo");
                System.out.println(num2>=0?num2+" � um n�mero positivo":num2+" � um n�mero negativo");
                break;
                
            case 4:
                System.out.println((num1 % 6) == 0?num1+" � M�LTIPLO DE 6":num1+" n�o � M�LTIPLO DE 6");
                System.out.println((num2 % 6) == 0?num2+" � M�LTIPLO DE 6":num2+" n�o � M�LTIPLO DE 6");
                break;
                
            case 5:
                System.out.println("**************************************************");
                System.out.println((num1 > num2)? num1+" � maior que "+num2 :num1 == num2?"Os dois n�meros s�o iguais":num2+" � maior que "+num1);
                System.out.println("**************************************************");
                System.out.println((num1 % 2) == 0 ?num1+ " � PAR":num1+" � �MPAR");
                System.out.println((num2 % 2) == 0 ?num2+ " � PAR":num2+" � �MPAR");
                System.out.println("**************************************************");
                System.out.println(num1>=0?num1+" � um n�mero positivo":num1+" � um n�mero negativo");
                System.out.println(num2>=0?num2+" � um n�mero positivo":num2+" � um n�mero negativo");
                System.out.println("**************************************************");
                System.out.println((num1 % 6) == 0?num1+" � M�LTIPLO DE 6":num1+" n�o � M�LTIPLO DE 6");
                System.out.println((num2 % 6) == 0?num2+" � M�LTIPLO DE 6":num2+" n�o � M�LTIPLO DE 6");
                System.out.println("**************************************************");
                break;
                
            default:
                System.out.println("Op��o Inv�lida!");          
            
        }
	}
	
}
