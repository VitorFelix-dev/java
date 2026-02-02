package equacao;

import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a,b,c,delta, x1, x2;

		System.out.println("[------------Programa de bhaskara------------]\\n");
		System.out.println("Informe o valor de a: ");
		a = sc.nextDouble();

		System.out.println("Informe o valor de b: ");
		b = sc.nextDouble();

		System.out.println("Informe o valor de c: ");
		c = sc.nextDouble();

		delta = Math.pow(b, 2) - 4 * a * c;
		
		x1 = (-b +  Math.sqrt(delta)) / 2 * a;
		x2 = (-b - Math.sqrt(delta)) / 2 * a;
		System.out.println("O delta desta equação é: " + delta);
		System.out.println("O x1 desta equação é: " + x1);
		System.out.println("O x2 desta equação é: " + x2);
	}

}
