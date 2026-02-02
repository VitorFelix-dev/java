package area.calculo;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double base, altura, calculo, area, cm;
		
		System.out.println("[------------Cálculo da área do triângulo------------]\n");
		System.out.println("Informe a base do triângulo: ");
		base = sc.nextDouble();
		System.out.println("informe a altura do triângulo: ");
		altura = sc.nextDouble();
		
		calculo = (base * altura) / 2;
		area = calculo;
		cm = area * 10000;
		System.out.println("A área total desse triângulo é de: " + area + " metros quadrados");
		System.out.println("Ou: " + cm + " centímetros quadrados");
	}

}
