package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Porcentagem {

	public static void main(String[] args) {
        double percent_x, value_y, result;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe o valor: ");
        value_y = leitor.nextDouble();
        
        System.out.print("Informe a porcentagem: ");
        percent_x = leitor.nextDouble();
        
        result = value_y * (percent_x/100);
        
        System.out.println(result);
	}
	
}
