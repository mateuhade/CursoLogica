package Atividades.soma_vetor;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos números você vai digitar? ");
		int qnt = sc.nextInt();
		
		double[] vetor = new double[qnt];
		for (int i = 0; i < qnt; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.print("\nVALORES = ");
		for (int i = 0; i < qnt; i++) {
			System.out.print(String.format("%.1f", vetor[i]) + " ");
		}
		
		double soma = 0;
		for (int i = 0; i < qnt; i++) {
			soma = soma + vetor[i];
		}
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		
		double media = soma / qnt;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		
		sc.close();
	}

}
