package Atividades.diagonal_negativos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int ordem = sc.nextInt();
		
		int[][] matriz = new int[ordem][ordem];
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL NEGATIVOS:");
		for (int i = 0; i < ordem; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		int qntNegativos = 0;
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				if (matriz[i][j] < 0) {
					qntNegativos = qntNegativos + 1;
				}
			}
		}
		
		System.out.print("\nQUANTIDADE DE NEGATIVOS = " + qntNegativos);
		
		sc.close();
	}

}
