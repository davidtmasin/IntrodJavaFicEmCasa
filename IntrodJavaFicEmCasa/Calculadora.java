package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
	    int opAritmetica, somar, subtrair, multiplicar, dividir, num1, num2;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Digite agora o primeiro n�mero: ");
        num1 = teclado.nextInt();
            
        System.out.print("Digite agora o segundo n�mero: ");
        num2 = teclado.nextInt();
	    
	    do{
	        
    	    System.out.println("***********************************");
            System.out.println("*CALCULADORA HARDCORE DO TIO DAVID*");
    	    System.out.println("***********************************");
    	    System.out.println("*  DIGITE UMA DAS OP��ES ABAIXO:  *");
    	    System.out.println("*   OP��O 1: SOMAR                *");
    	    System.out.println("*   OP��O 2: SUBTRAIR             *");
    	    System.out.println("*   OP��O 3: MULTIPLICAR          *");  
            System.out.println("*   OP��O 4: DIVIDIR              *");
            System.out.println("*   OP��O 0: SAIR DO PROGRAMA     *");
            System.out.println("***********************************");
            
            System.out.print("Agora, informe a op��o desejada: ");
            opAritmetica = teclado.nextInt();
            
            switch(opAritmetica){
                
                case 1: 
                    System.out.println("\n");
                    System.out.println("Op��o 1 selecionada: Somar");
                    somar = num1 + num2;
                    System.out.println("Resultado da soma: "+somar);
                    System.out.println("\n");
                    break;
                
                case 2: 
                    System.out.println("\n");
                    System.out.println("Op��o 2 selecionada: Subtrair");
                    subtrair = num1 - num2;
                    System.out.println("Resultado da sbtra��o: "+subtrair);
                    System.out.println("\n");
                    break;
                
                case 3: 
                    System.out.println("\n");
                    System.out.println("Op��o 3 selecionada: Multiplicar");
                    multiplicar = num1 * num2;
                    System.out.println("Resultado da multiplica��o: "+multiplicar);
                    System.out.println("\n");
                    break;
                
                case 4: 
                    System.out.println("\n");
                    System.out.println("Op��o 4 selecionada: Dividir");
                    dividir = num1 / num2;
                    System.out.println("Resultado da divis�o: "+dividir);
                    System.out.println("\n");
                    break;
                
                case 0: 
                     System.out.println("\n");
                     System.out.println("A calcudora ser� encerrada. Obrigado por fazer uso deste programa.");
                     System.out.println("\n");
                    break;
                    
                default:
                    System.out.println("\n");
                    System.out.println("Infelizmente n�o foi localizado em meu software, alguma opera��o referente a esta op��o. Tente uma pr�xima vez. ");
                    System.out.println("\n");
                
            }
            
	    } while(opAritmetica > 0 && opAritmetica <= 4);
	    
	        System.out.println("Adeus, usu�rio...");
	}
	
	
}
