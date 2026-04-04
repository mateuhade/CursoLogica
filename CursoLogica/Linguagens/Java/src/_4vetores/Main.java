package _4vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qnt;
		System.out.print("Quantos números você vai digitar? "); // não sei se você já percebeu isso, mas o java aceita caracteres especiais como á é ü etc.
		qnt = sc.nextInt();
		
		double[] vetor = new double[qnt]; // com essa linha nós criamos um vetor de doubles com qnt linhas, de forma brusca, o new identifica um espaço vazio na memória do computador
		for (int i = 0; i < qnt; i++) {       // para armazenar o vetor e cria um vetor nesse espaço vazio.
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("NÚMEROS DIGITADOS:"); 
		for (int i = 0; i < qnt; i++) {      // nós podemos criar a variável i dentro do for, mas se fizermos isso, ela só existirá dentro desse for e será descartada depois que ele acabar,
			System.out.println(vetor[i]);    // o que surpreendentemente é bom, já que reduz a quantidade de variáveis inúteis
		}
		
		sc.close();
	}

}
