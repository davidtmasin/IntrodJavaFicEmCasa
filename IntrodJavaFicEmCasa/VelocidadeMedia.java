package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class VelocidadeMedia {

	public static void main(String[] args) {
    	double distancia_percorrida;
    	double tempo;
    	double velocidade_media;
    	
    	Scanner leitor = new Scanner(System.in);
    	
    	System.out.print("Informe a dist�ncia percorrida em metros: ");
    	distancia_percorrida = leitor.nextFloat();
    	
    	System.out.print("Informe o tempo em horas: ");
    	tempo = leitor.nextFloat();
    	
    	distancia_percorrida = distancia_percorrida / 1000;
    	//tempo = tempo / 3600;
    	
    	velocidade_media = distancia_percorrida / tempo;
    	
    	System.out.printf("A velocidade m�dia � de %.2fkm/h", velocidade_media);
    	
	}
	
}
