package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class TipoTriangulo {

	public static void main(String[] args) {
	    int lado1, lado2, lado3;
	    Scanner valorLado = new Scanner(System.in);
	    
	    System.out.println("Digite o valor de cada lado do tri�ngulo.");
	    lado1 = valorLado.nextInt();
	    lado2 = valorLado.nextInt();
	    lado3 = valorLado.nextInt();
	    
	    if((lado1!=lado2)&&(lado1!=lado3)&&(lado2!=lado3)){
	        System.out.println("Seu tri�ngulo � ESCALENO!");
	    } 
	    else if((lado1==lado2)&&(lado1==lado3)&&(lado2==lado3)){
	        System.out.println("Seu tri�ngulo � EQUIL�TERO!");
	    } else{
	        System.out.println("Seu tri�ngulo � IS�SCELES!");
	    }
	}
	
}
