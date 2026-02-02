package potencia;

import java.util.Scanner;

public class CuboEQuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		double N, Q, C;

		System.out.println("[------------Programa da potência------------]\n");
		System.out.println("Informe o número: ");
		N = sc.nextDouble();
		Q = Math.pow(N, 2);
		C = Math.pow(N, 3);
		System.out.println("Valor ao quadrado: " + Q);
		System.out.println("Valor ao cubo: " + C);
	}

}
