package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
	    double lado, diagonal, perimetro, area;
	    Scanner leitor = new Scanner(System.in);
	    System.out.print("Informe o valor do lado em cm: ");
	    lado = leitor.nextFloat();
	    
	    diagonal = lado * Math.sqrt(2);
	    perimetro = 4 * lado ;
	    area = Math.pow(lado, 2);
	    System.out.printf("A diagonal do quadrado vale %.2fcm\n", diagonal);
	    System.out.printf("O per�metro do quadrado vale %.2fcm\n", perimetro);
	    System.out.printf("A �rea do quadrado vale %.2fcm�", area);
	}
	
	
}
