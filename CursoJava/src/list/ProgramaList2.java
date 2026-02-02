package list;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ProgramaList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Double> medias = new ArrayList<Double>();
		int qtd;
		String n1,n2,n3,n4;
		
		System.out.println("Quantos alunos há na sala? ");
		qtd = sc.nextInt();
		for(int i = 0; i < qtd; i ++) {
			System.out.println("Nome do aluno " + (i+1) + ":");
			nomes.add(sc.next());
			
			System.out.println("Primeira nota: ");
			n1 = sc.next().replace(",", ".");
			System.out.println("Segunda nota: ");
			n2 = sc.next().replace(",", ".");
			System.out.println("Terceira nota: ");
			n3 = sc.next().replace(",", "."); 
			System.out.println("Quarta nota: ");
			n4 = sc.next().replace(",", "."); 
			
			Double nota1 = Double.parseDouble(n1);
			Double nota2 = Double.parseDouble(n2);
			Double nota3 = Double.parseDouble(n3);
			Double nota4 = Double.parseDouble(n4);
			
			double m = ((nota1 + nota2 + nota3 + nota4) / 4);
			medias.add(m);
		
		}
	for(int i = 0; i < nomes.size(); i ++) {
		System.out.println(nomes.get(i) + "- Média: " + medias.get(i) );
	}
	
		
	}

}
