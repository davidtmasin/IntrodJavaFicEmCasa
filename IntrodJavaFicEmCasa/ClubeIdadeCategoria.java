package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class ClubeIdadeCategoria {

	public static void main(String[] args) {
	    
		   Scanner leitor = new Scanner(System.in);    
		   int idadeAtleta;
		   String nomeAtleta;
		   
		   System.out.print("Qual o nome do(a) atleta? ");
		   nomeAtleta = leitor.nextLine();
		   
		   System.out.print("Informe a idade do atleta: ");
		   idadeAtleta = leitor.nextInt();
		   
		   if(idadeAtleta >= 5 && idadeAtleta <= 10){
		       System.out.println("O(A) atleta "+nomeAtleta+" tem "+idadeAtleta+" anos e estar� na categoria INFANTIL.");
		   } else if(idadeAtleta >= 11 && idadeAtleta <= 15){
		       System.out.println("O(A) atleta "+nomeAtleta+" tem "+idadeAtleta+" anos e estar� na categoria JUVENIL.");
		   } else if(idadeAtleta >= 16 && idadeAtleta <= 20){
		       System.out.println("O(A) atleta "+nomeAtleta+" tem "+idadeAtleta+" anos e estar� na categoria JUNIOR.");
		   } else if(idadeAtleta  >= 21 && idadeAtleta <= 25){
		       System.out.println("O(A) atleta "+nomeAtleta+" tem "+idadeAtleta+" anos e estar� na categoria PROFISSIONAL.");
		   } else{
		       System.out.println("Infelizmente, a idade do(a) atleta est� fora de todas as faixas de categoria do clube.");
		   }
		    
		}
	
}
