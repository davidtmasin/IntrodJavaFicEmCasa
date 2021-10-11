package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class DecisionStructure {
	
	public static void main(String[] args) {
	//	String txt = 10==7?"V: Dez é igual a sete":"F: Dez é diferente de sete";
	//	System.out.println(txt);
	
		int idade = 29;
		
	    if(idade >= 18){
	      // System.out.println("Já pode ser preso.");
	    }
	    //if-else
	    if(idade >= 18){
	       // System.out.println("Já pode ser preso.");
	    } else{
	       // System.out.println("Menor de idade, vai estudar!");
	    }
	    
	    //if-elsif-else
	    
	    String semaforo = "verde";
	    Scanner sinal = new Scanner(System.in);
	    
	    System.out.println("Qual a cor do semáforo?");
	    semaforo = sinal.next();
	     
	    if(semaforo.equals("verde")){
	        System.out.println("Siga em frente!");
	    } else if(semaforo.equals("amarelo")){
	        System.out.println("Tenha atenção!!");
	    } else if(semaforo.equals("vermelho")){
	        System.out.print("PARE!!!");
	    } else{
	        System.out.println("Acione a AMC!");
	    }
	    
	    char option;
	    Scanner op = new Scanner(System.in);
	    System.out.println("Escolha uma opção: a - Cadastrar produto, b - Visualizar detalhes, c - Editar produto, d - Deletar produto");
	    option = op.next().charAt(0); //Para poder ler char com o Scanner tem que usar charAt junto com o next
	    
	    switch(option){
	        case 'a':
	            System.out.println("Cadastrar produto");
	            break;
	            
	        case 'b':
	            System.out.println("Visualizar detalhes");
	            break;
	            
	        case 'c':
	            System.out.println("Editar produto");
	            break;
	            
	        case 'd':
	            System.out.println("Deletar produto");
	            break;
	            
	        default:
	            System.out.println("Opção inválida!");
	    }
	    
	}

}
