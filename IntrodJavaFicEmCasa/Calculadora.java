package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
	    int opAritmetica, somar, subtrair, multiplicar, dividir, num1, num2;
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.print("Digite agora o primeiro número: ");
        num1 = teclado.nextInt();
            
        System.out.print("Digite agora o segundo número: ");
        num2 = teclado.nextInt();
	    
	    do{
	        
    	    System.out.println("***********************************");
            System.out.println("*CALCULADORA HARDCORE DO TIO DAVID*");
    	    System.out.println("***********************************");
    	    System.out.println("*  DIGITE UMA DAS OPÇÕES ABAIXO:  *");
    	    System.out.println("*   OPÇÃO 1: SOMAR                *");
    	    System.out.println("*   OPÇÃO 2: SUBTRAIR             *");
    	    System.out.println("*   OPÇÃO 3: MULTIPLICAR          *");  
            System.out.println("*   OPÇÃO 4: DIVIDIR              *");
            System.out.println("*   OPÇÃO 0: SAIR DO PROGRAMA     *");
            System.out.println("***********************************");
            
            System.out.print("Agora, informe a opção desejada: ");
            opAritmetica = teclado.nextInt();
            
            switch(opAritmetica){
                
                case 1: 
                    System.out.println("\n");
                    System.out.println("Opção 1 selecionada: Somar");
                    somar = num1 + num2;
                    System.out.println("Resultado da soma: "+somar);
                    System.out.println("\n");
                    break;
                
                case 2: 
                    System.out.println("\n");
                    System.out.println("Opção 2 selecionada: Subtrair");
                    subtrair = num1 - num2;
                    System.out.println("Resultado da sbtração: "+subtrair);
                    System.out.println("\n");
                    break;
                
                case 3: 
                    System.out.println("\n");
                    System.out.println("Opção 3 selecionada: Multiplicar");
                    multiplicar = num1 * num2;
                    System.out.println("Resultado da multiplicação: "+multiplicar);
                    System.out.println("\n");
                    break;
                
                case 4: 
                    System.out.println("\n");
                    System.out.println("Opção 4 selecionada: Dividir");
                    dividir = num1 / num2;
                    System.out.println("Resultado da divisão: "+dividir);
                    System.out.println("\n");
                    break;
                
                case 0: 
                     System.out.println("\n");
                     System.out.println("A calcudora será encerrada. Obrigado por fazer uso deste programa.");
                     System.out.println("\n");
                    break;
                    
                default:
                    System.out.println("\n");
                    System.out.println("Infelizmente não foi localizado em meu software, alguma operação referente a esta opção. Tente uma próxima vez. ");
                    System.out.println("\n");
                
            }
            
	    } while(opAritmetica > 0 && opAritmetica <= 4);
	    
	        System.out.println("Adeus, usuário...");
	}
	
	
}
