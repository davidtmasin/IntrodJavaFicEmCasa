package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class ConverterMSKMH {
	
	public static void main(String[] args) {
	    double distance_ms, distance_kmh;
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("Informe a dist�ncia: ");
	    distance_ms = leitor.nextFloat();
	    
	    distance_kmh = distance_ms * 3.6f;
	    
	    System.out.printf("%.2fm/s equivale a %.2fkm/h", distance_ms, distance_kmh);
	    
	    
	}

}
