package estruturas.repeticao;

import java.util.Scanner;

public class MediaSala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int qtd,aprovado = 0,reprovado = 0,recuperacao = 0;
		double MediaTurma = 0;
		System.out.println("Quantos alunos há em sua sala? ");
		qtd = sc.nextInt();
		String nota1, nota2;
			String[] nome = new String[qtd];
		String[] sobrenome = new String[qtd];
		double[] media = new double[qtd];
		for(int i = 0; i < qtd; i ++) {
			
			System.out.println( (i+1) + "° Aluno ou " + (i + 1) + "ª aluna");
			System.out.println("Nome do aluno: ");
			nome[i] = sc.next();
			
			System.out.println("Sobrenome do aluno: ");
			sobrenome[i] = sc.next();
			
			System.out.println ("1ª Nota: ");
			nota1 = sc.next().replace(",", ".").trim();
			
			
			System.out.println("2ª Nota: ");
			nota2 = sc.next().replace(",", ".").trim();
			
		 double nota1m = Double.parseDouble(nota1);
		 double nota2m = Double.parseDouble(nota2);
			
			media[i] = ((nota1m + nota2m) / 2);
			MediaTurma = media[i] + MediaTurma;
			if(media[i] >= 7.0) {
				System.out.println(" Nome: "+ nome[i] + " " + sobrenome[i] );
				System.out.println(" Situação: aprovado, com uma média de: " + media[i]);
				aprovado++;
			}
			else if(media[i] < 7.0 &&  media[i] > 4.0) {
				System.out.println(" Nome: "+ nome[i] + " " + sobrenome[i] );
				System.out.println(" Situação: Recuperação, com uma média de: " + media[i]);
				recuperacao++;
			}
			else {
				System.out.println(" Nome: "+ nome[i] + " " + sobrenome[i] );
				System.out.println(" Situação: Reprovado, com uma média de: " + media[i]);
				reprovado++;
			}
			
		}
		

	MediaTurma = MediaTurma/qtd;
		System.out.println("\n");
		System.out.println("Situação geral dos alunos: ");
		System.out.println("Total de alunos: " + qtd);
		System.out.println("Total de alunos aprovados: " + aprovado);
		System.out.println("Total de alunos reprovados: " + reprovado);
		System.out.println("Total de alunos em recuperação: " + recuperacao);
		System.out.println("Média da turma: " + MediaTurma);
		
	
	}

}
