package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double raio, comp_circulo, area_circulo;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o valor do RAIO do c�rculo em cm: ");
		raio = leitor.nextFloat();
		
		comp_circulo = 2 * Math.PI * raio;
		area_circulo = raio * Math.PI;
		
		System.out.printf("O comprimento do c�rculo vale %.2fcm\n", comp_circulo);
		System.out.printf("A �rea do c�rculo vale %.2fcm�\n", area_circulo);
	}
	
	
}
