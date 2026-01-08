package fundamentos.conversao;

import java.util.Scanner;
public class ConversorTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int escolha;
		double F,C;
		System.out.println("--------------------Cálculo de temperatura-------------------");
		System.out.println("Qual o tipo de conversão de temperatura você deseja fazer?");
		System.out.println("1 - calcular fahrenheit para graus celsius");
		System.out.println("2- calcular graus celsius para farenheit");
		System.out.println("1 ou 2?");
		escolha = sc.nextInt();

		if(escolha == 1) {
			System.out.println("Informe a temperatura em farenheit");
			F = sc.nextDouble();
			C = (F - 32) * 5/9;
			System.out.println("Temperatura em Fahrenheit: " + F + "°");
			System.out.println("Temperatura em Graus Celsius: " + C + "°");
		}
		else if (escolha == 2){
			System.out.println("Informe a temperatura em graus celsius: ");
			C = sc.nextDouble();
			F = (C * 9/5) + 32;
			System.out.println("Temperatura em Graus Celsius: " + C + "°");
			System.out.println("Temperatura em Fahrenheit: " + F + "°");
		}
		else {
			System.out.println("Opção inválida, tente novamente!");
		}
	}

}
