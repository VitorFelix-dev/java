package list;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProgramaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		
		for(int i = 0; i < 5; i ++) {
			System.out.println((i + 1) + "° Nome: ");
			nomes.add(sc.next());
		}
		
		System.out.println("Primeiro nome: " + nomes.get(0));
		System.out.println("Quinto e último nome: " + nomes.get(nomes.size() - 1));
	}

}
