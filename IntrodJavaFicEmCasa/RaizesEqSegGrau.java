/*
*
* 3. Faça um programa que leia os
coeficientes de uma equação de
segundo grau e calcule suas raízes.
*
* x² - 5x + 6 = 0
*
* */
package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class RaizesEqSegGrau {
    public static void main(String[] args){

        double a, b, c, delta, x1, x2;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe os valores dos coeficientes 'a', 'b' e 'c'");
        System.out.print("a: ");
        a = leitor.nextDouble();

        System.out.print("b: ");
        b = leitor.nextDouble();

        System.out.print("c: ");
        c = leitor.nextDouble();

        delta = (b*b) - 4*a*c;
        System.out.println("O delta vale "+delta+".");

        if(delta >=0){

            x1 = (- b + Math.sqrt(delta))/2*a;
            x2 = (- b - Math.sqrt(delta))/2*a;
            System.out.println("As ra�zes da equa��o s�o: x' = "+x1+" e x'' = "+x2);

        } else{

            System.out.println("Esta equa��o n�o ter� ra�zes pois, o valor de delta � negativo.");
            System.out.println("Logo, x' e x'' não existem.");
        }


    }
}
