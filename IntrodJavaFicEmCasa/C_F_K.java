package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class C_F_K {

	public static void main (String[]args)
	  {
	    float valueCelsius, valueFahrenheit, valueKelvin;
	    Scanner leitor = new Scanner (System.in);

	      System.out.println ("Informe a leitura em Celsius");
	      valueCelsius = leitor.nextFloat ();

	      valueFahrenheit = 1.8f * valueCelsius + 32;
	      valueKelvin = valueCelsius + 273.15f;

	      System.out.println ("A temperatura lida em Celsius equivale a " +
				  valueFahrenheit + "�F"+ " e "+valueKelvin+"�K.");
	  }
	
}
