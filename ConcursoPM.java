package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class ConcursoPM {

	public static void main(String[] args){

        int idade;
        float altura;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a idade do candidato: ");
        idade = leitor.nextInt();
        
        System.out.print("Informe a altura do candidato: ");
        altura = leitor.nextFloat();
      
        System.out.print("O candidato est� ");
        System.out.print((idade > 18) && (altura > 1.60f)? "aprovado!":"reprovado!");

    }
	
}
