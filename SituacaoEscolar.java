package IntrodJavaFicEmCasa;

import java.util.Scanner;

public class SituacaoEscolar {

	static int contador = 0;

	public static void main(String[] args) {

		String alunos[] = new String[30];

		double notas[][] = new double[30][3];

		int faltas[] = new int[30];
		
		int aulas = 120;
		
		boolean flag = true;

		while (flag) {

			Scanner leitor = new Scanner(System.in);

			System.out.println("Selecione uma op��o:");
			System.out.println("1-cadastrar aluno");
			System.out.println("2-castrar nota");
			System.out.println("3-cadastrar faltas");
			System.out.println("4-visualizar cadastro");
			System.out.println("5-sair do sistema");

			int op = leitor.nextInt();

			switch (op) {
				case 1:cadastrarAluno(leitor, alunos, contador);break;
				case 2:cadastrarNota(leitor, alunos, notas);break;
				case 3:cadastrarFalta(leitor, alunos, faltas);break;
				case 4:visualizarCadastro(leitor,alunos,notas,aulas,faltas);break;
				case 5:flag = false; System.out.println("Saindo do sistema.");break;
				default: System.out.println("op��o inv�lida");
			}
		}

	}

	static void cadastrarAluno(Scanner leitor, String aluno[], int contador) {

		System.out.println("Digite o nome do aluno.");
		leitor.nextLine().toLowerCase();
		String nome = leitor.nextLine();
		aluno[contador] = nome;
		SituacaoEscolar.contador++;
	}

	static void cadastrarNota(Scanner leitor, String alunos[], double notas[][]) {
		System.out.println("Digite o nome do aluno");
		leitor.nextLine();
		String nome = leitor.nextLine().toLowerCase();

		int numeroChamada = 0;

		for (int i=0;i<contador;i++) {
			
			if (alunos[i].equals(nome)) {
				
				numeroChamada = i;

				System.out.println("Digite a primeira nota");
				double nota1 = leitor.nextDouble();

				notas[numeroChamada][0] = nota1;

				System.out.println("Digite a segunda nota");
				double nota2 = leitor.nextDouble();

				notas[numeroChamada][1] = nota2;

				System.out.println("Digite a terceira nota");
				double nota3 = leitor.nextDouble();

				notas[numeroChamada][2] = nota3;

			} 
		}
	}
	
	static void cadastrarFalta(Scanner leitor,String alunos[],int faltas[]) {
		
		System.out.println("Digite o nome do aluno");
		leitor.nextLine();
		String nome = leitor.nextLine().toLowerCase();

		int numeroChamada = 0;

		for (int i=0;i<contador;i++) {
			if (alunos[i].equals(nome)) {
				numeroChamada = i;

				System.out.println("O n�mero de faltas.");
				int falta  = leitor.nextInt();

				faltas[numeroChamada] = falta;

			} 
		}
	}
	
	static void visualizarCadastro(Scanner leitor,String alunos[],double notas[][],int aulas, int faltas[]) {
		System.out.println("Digite o nome do aluno.");
		leitor.nextLine();
		String nome = leitor.nextLine().toLowerCase();
		
		for(int i=0;i<contador;i++) {
			if(alunos[i].equals(nome)) {
				int num = i;
				
				double media = (notas[num][0]+notas[num][1]+notas[num][2])/3;
				
				double presenca = aulas - faltas[num];
				double presencaPorcent = (double) presenca *100 / aulas;
								
				System.out.println("nome: "+alunos[num]);
				System.out.println("1� nota: "+notas[num][0]);
				System.out.println("2� nota: "+notas[num][1]);
				System.out.println("3� nota: "+notas[num][2]);
				
				if(media>=7 && media <=10)
					System.out.printf("m�dia: %.2f aprovado. ",media);
				else if(media<7 && media>=3)
					System.out.printf("m�dia: %.2f recupera��o. ",media);
				else if(media<3 && media>=0)
					System.out.printf("m�dia: %.2f reprovado. ",media);
			
				if(presencaPorcent>25.0 && presencaPorcent<=100.0) {
					System.out.printf("\n%.2f",presencaPorcent);
					System.out.println("% - presen�a regular.");
				}
				else if(presencaPorcent>=0.0 && presencaPorcent<25.0) {
					System.out.printf("%.2f",presencaPorcent);
					System.out.println("% - reprovado por falta.");
				}
			}
		}
	}
	
}
