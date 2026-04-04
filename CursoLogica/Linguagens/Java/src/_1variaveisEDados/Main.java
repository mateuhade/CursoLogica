package _1variaveisEDados; // package basicamente identifica a localização do arquivo, impedindo que, por exemplo, o computador execute o Main.java da pasta _2saidaECasting ao invés do

import java.util.Locale;   // biblioteca do comando locale

// Main.java da pasta _1variaveisEDados.
public class Main {        		// Com essa linha nós identificamos o corpo do nosso programa. Usando public nós falamos que esse código pode ser utilizado por qualquer outro arquivo do programa,
                           		// por exemplo, caso seja desejado, o _2saidaECasting pode chamar uma função criada no _1variaveis e dados. E utilizando class identificamos que o que será escrito
						   		// dentro das próximas chaves será o nosso código real. Main sendo o nome dessa classe.
	public static void main(String[] args) { // Aqui nós criamos um método chamado main, com o comando "static" nós dizemos que o comando a seguir pertence diretamente a classe Main, e não à
											 // um objeto, função ou varíavel específica. Com void, dizemos que o programa não precisa retornar nenhum valor, semelhante ao return 0; em C. E o
		                                     // string[] args permite que o sistema colete dados enviados por outros programas caso existam.
		
		Locale.setDefault(Locale.US);        // garante de floats terão suas casas decimais separadas por .'s, não ,'s
		
		System.out.println("Hello World!\n\n"); // AVISO: ESSAS EXPLICAÇÕES ESTÃO LEVANDO EM CONTA QUE VOCÊ JÁ ENTENDE C OU C++
		
		int idade;
		double salario;           // aqui a declaração e tipologia de variávies é exatamente igual a de C++
		char genero;              // além disso todos os operadores comparativos, aritméticos e lógicos são exatamente iguais à linguagem C
		String nome;
		boolean adulto;
		
		idade = 30;               // Placeholder int:          %d
		salario = 5800.5;         // Placeholder double/float: %f
		genero = 'F';             // Placeholder char:         %c
		nome = "Maria Silva";     // Placeholder string:       %s
		adulto = true;            // Placeholder boolean:      %b
		
		System.out.println("A funcionária " + adulto + nome + " tem " + idade + " anos de idade" +     // É desta forma que imprimimos e concatenamos variáveis em java
		                   ", é do gênero " + genero + " e ganha R$" + String.format("%.2f", salario));// é desta forma que realizamos a formatação de doubles
	}

}
