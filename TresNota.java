package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class TresNota {

	public static void main(String[] args) {
		int notas[] = new int[3]; //Criando um vetor de notas e reservando 03 espa�os.
		int media;
		Scanner nota = new Scanner(System.in);
		
		System.out.print("Digite a 1� nota: ");
		notas[0] = nota.nextInt();
		
		System.out.print("Digite a 2� nota: ");
		notas[1] = nota.nextInt();
		
		System.out.print("Digite a 3� nota: ");
		notas[2] = nota.nextInt();
		
		//Verificando quem � o menor n�mero
		if(notas[0] < notas[1] && notas[0] < notas[2]){
		    
		    System.out.println("A menor nota � "+notas[0]+".");
		    
		} else if(notas[1] < notas[0] && notas[1] < notas[2]){
		    
		    System.out.println("A menor nota � "+notas[1]+".");
		    
		} else if(notas[2] < notas[0] && notas[2] < notas[1]){
		    
		    System.out.println("A menor nota � "+notas[2]+".");
		    
		} else {
		    System.out.println("Informa��es inv�lidas!");
		}
		
		//Verificando quem � o maior n�mero
		if(notas[0] > notas[1] && notas[0] > notas[2]){
		    
		    System.out.println("A maior nota � "+notas[0]+".");
		    
		} else if(notas[1] > notas[0] && notas[1] > notas[2]){
		    
		    System.out.println("A maior nota � "+notas[1]+".");
		    
		} else if(notas[2] > notas[0] && notas[2] > notas[1]){
		    
		    System.out.println("A maior nota � "+notas[2]+".");
		} else{
		    System.out.println("Informa��es inv�lidas!");
		}
		media = notas[0] + notas[1] + notas[2];
		System.out.println("A m�dia das notas vale: "+media);
		
	}
	
}
