package list;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> listas = new ArrayList<>();
		String produtos,escolha;
		
		System.out.println("---------------Cadastro de produtos---------------");
		while(true) {
			System.out.println("Digite um produto, Se quiser parar digite 'sair' : ");
			produtos = sc.nextLine();
			
			if(listas.contains(produtos)) {
				System.out.println("Produto já cadastrado anteriormente.");
			}
			if(produtos.equalsIgnoreCase("Sair")) {
				System.out.println("Listar em ordem do indice ou sem ordem?, (ordem / sem ordem) ");
				escolha = sc.nextLine();


				if(escolha.equalsIgnoreCase("ordem")) {
					for(int i = 0; i < listas.size(); i ++ ) {
						System.out.println((i + 1) + "° Produto: " + listas.get(i));
					}
				}
				else {
					System.out.println("Todos os produtos digitados: ");
					for(String l : listas) {
						System.out.println(l);
					}
				}
			
				break;
			}
		    if (produtos.isBlank()) {
		        System.out.println("Produto inválido.");
		        continue;
		    }
			listas.add(produtos);	
		}
	}

}
