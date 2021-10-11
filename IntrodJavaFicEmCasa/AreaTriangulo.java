package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args){

        double base, altura, area;
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a base do triângulo: ");
        base = leitor.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        altura = leitor.nextDouble();

        area = (base * altura) / 2;
        System.out.println("A área do triângulo vale "+area);
    }
}
