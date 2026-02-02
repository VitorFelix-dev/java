package list;
import java.util.ArrayList;
import java.util.Scanner;
public class ProgramaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> turma = new ArrayList<>();
		String aluno;
		 while(true) {
			 System.out.println("Digite o nome do aluno: ");
			 aluno = sc.nextLine();
			 if(turma.contains(aluno)) {
				 System.out.println("Aluno já registrado anteriormente!");
			 }
			 else {
				 turma.add(aluno);
				 System.out.println("Aluno registrado com sucesso! ");
			 }
		 }
	}

}
