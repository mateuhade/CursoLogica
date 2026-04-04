package Atividades.crescente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números :");
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		while (valor1 != valor2) {
			if (valor1 > valor2) {
				System.out.println("DECRESCENTE!");
			}
			else {
				System.out.println("CRESCENTE!");
			}
			
			System.out.println("Digite outros dois números :");
			valor1 = sc.nextInt();
			valor2 = sc.nextInt();	
		}
		
		sc.close();
	}
}
