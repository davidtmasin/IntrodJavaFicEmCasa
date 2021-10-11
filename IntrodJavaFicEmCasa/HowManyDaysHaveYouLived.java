package IntrodJavaFicEmCasa;

import java.util.Scanner;
import java.util.Calendar;

public class HowManyDaysHaveYouLived{
	
	public static void main(String[] args) {
	    
	    Scanner leitor = new Scanner(System.in);
	    int suaIdade;
	    int anoNascimento;
	    int mesNascimento;
	    int diaNascimento;
	    int diasVividos;
	    
	    System.out.print("Informe o dia do seu nascimento: ");
	    diaNascimento = leitor.nextInt();
	    
	    System.out.print("Informe o n�mero do m�s do seu nascimento: ");
	    mesNascimento = leitor.nextInt();
	    
	    System.out.print("Informe o ano do seu nascimento: ");
	    anoNascimento = leitor.nextInt();
	    
	    System.out.println("\nSua data de nascimento �: "+ diaNascimento+"/"+mesNascimento+"/"+anoNascimento);
	    
	    int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
	    int mesAtual = Calendar.getInstance().get(Calendar.MONTH)+1;
	    int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	    
	    System.out.println("\nA data de hoje �: "+ diaAtual+"/"+mesAtual+"/"+anoAtual);
	    
	    suaIdade = anoAtual - anoNascimento;
	    System.out.println("\nVoc� tem " + suaIdade + " anos.\n");
	    
	    diasVividos =  (suaIdade * 365); // considerando que 1 ano tem 365 dias
	        //n�o irei considerar que cada m�s tem 30 dias
	    System.out.println("Voc� j� viveu "+ diasVividos +" dias.");
	    
	}
}

