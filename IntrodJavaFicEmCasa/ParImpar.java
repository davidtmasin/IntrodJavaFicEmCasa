package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int number;
		Scanner num = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		number = num.nextInt();
		
		System.out.println(((number % 2 == 0)?"PAR":"�MPAR"));
	}
	
	
}
