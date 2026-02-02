	package list;
	
	import java.util.ArrayList;
	import java.util.Scanner;
	
	public class Tarefa {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			ArrayList<String> lista = new ArrayList<>();
			String tarefas;
			while(true) {
				System.out.println("Digite uma tarefa (Ou digite 'sair' para encerrar o programa): ");
				tarefas = sc.nextLine();
			
				
				if(tarefas.equalsIgnoreCase("sair")) {
					break;
				}
				lista.add(tarefas);
			}
			System.out.println("Quantidade de tarefas: " + lista.size());
			System.out.println("Todas as tarefas: ");
			for(String l : lista) {
				System.out.println(l);
			}
		}
	
	}
