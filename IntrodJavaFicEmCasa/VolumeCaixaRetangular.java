package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class VolumeCaixaRetangular {

	public static void main(String[] args) {
	    double comprimento, largura, altura, volume;
	    Scanner leitor = new Scanner(System.in);
	    
	    System.out.print("Digite o comprimento da caixa retangular: ");
	    comprimento = leitor.nextDouble();
	    
	    System.out.print("Digite a largura da caixa retangular: ");
	    largura = leitor.nextDouble();
	    
	    System.out.print("Digite a altura da caixa retangular: ");
	    altura = leitor.nextDouble();
	    
	    volume = comprimento * largura * altura;
	    
	    System.out.println("O volume da caixa retangular � de "+volume+"m�.");
	}
	
}
