package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Integer> Numero = new HashSet<>();
		int n;
		
	  while(true) {
		System.out.println("Digite números inteiros, Se quiser parar digite -1: ");
		n = sc.nextInt();
		
		if(n == -1) {
			  Numero.add(n);
			  System.out.println("Quantidade de números únicos digitados: " + Numero.size());
			  
			  
			for(Integer N : Numero) {
				  System.out.println(N);
			  }
			break;
		}
		  Numero.add(n);
		  System.out.println("Quantidade de números únicos digitados: " + Numero.size());
		  
		  
		for(Integer N : Numero) {
			  System.out.println("Todos os números únicos digitados: " + N);
		  }
	  }
	}

}
