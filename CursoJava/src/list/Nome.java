package list;

import java.util.Scanner;
import java.util.ArrayList;
public class Nome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>();
		String guardar;
		for(int i = 0; i < 10; i ++) {
			System.out.println("Digite o " + (i + 1) + "° nome: ");
			guardar = sc.nextLine();
			nomes.add(guardar);

		}
		System.out.println("Todos os nomes digitados: ");
		for(String n: nomes) {
			System.out.println(n);
		}
		System.out.println("Quantidades de nomes digitados: " + (nomes.size()));
		System.out.println("Primeiro nome: " + nomes.get(0));
		System.out.println("Último nome: " + nomes.get(nomes.size() - 1));
	}

}
