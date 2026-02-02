package calculo.imc;

import java.util.Scanner;

public class Imc {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double calculoImc;
		String altura, peso;
		
		System.out.println("[------------Cálculo de IMC (Indice de massa corporal)------------] \n");
		
		System.out.println("Informe o seu peso: ");
		peso = sc.next().toLowerCase().replace("kg" , "").trim();
				
				
		System.out.println("Informe a sua altura: ");
		altura = sc.next().replace(",", ".").trim();

		double alturaImc = Double.parseDouble(altura);
		double pesoImc = Double.parseDouble(peso);
		calculoImc = pesoImc / (alturaImc * alturaImc);

		if(calculoImc < 18.5) {
			System.out.println("Abaixo do peso!");
		}
		else if(calculoImc >= 18.5 && calculoImc <= 24.9 ) {
			System.out.println("Peso normal!");
		}
		else if(calculoImc >= 25.0 && calculoImc <= 29.9) {
			System.out.println("Sobre peso!");
		}
		else if(calculoImc >= 30.0 && calculoImc <= 39.9){
			System.out.println("Obesidade!");
		}
		else {
			System.out.println("Obesidade Grave!");
		}
		System.out.println("Seu IMC: " + calculoImc);
	}
}
