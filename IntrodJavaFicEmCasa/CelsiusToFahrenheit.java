package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){

        float valueCelsius, valueFahrenheit;
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe a leitura em Celsius");
        valueCelsius = leitor.nextFloat ();

        valueFahrenheit = 1.8f * valueCelsius + 32;

        System.out.print("A temperatura lida em Celsius equiva a " );
           System.out.printf("%.2f �F",valueFahrenheit);
    }
}
