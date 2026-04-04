package Atividades.soma_impares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números: ");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			int troca = valor1;
			valor1 = valor2;
			valor2 = troca;
		}
		
		int soma = 0;
		for (int i = valor1+1; i < valor2; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();
	}

}
