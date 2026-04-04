package _2saidaECasting;

public class Main {

	public static void main(String[] args) {
		
		System.out.print(" Sem quebra de linha  /"); 
		System.out.println(" Com quebra de linha "); 
		
		int x, y;
		double a, b, divisao;
		
		x = 5;
		y = 2;
		System.out.println("\n" + x / y);
		
		a = 2.34560000;        // o java irá automaticamente apenas armazenar os valores necessários para expressar a variável declarada, por exemplo, aqui ele armazenará 2.3456, sem os 0's
		b = 3.4567;
		divisao = x / y;       // aqui, nós temos o problema que C tem, caso a variável seja float mas receba uma equação de valores inteiros, ela retornará um valor inteiro, mesmo que
		                       // armazenado em um double / float
		System.out.println(a);
		System.out.println(String.format("%.2f", b));
		System.out.println(divisao + "\n");
		System.out.println((double) x / y); // para evitarmos a perca de dados quando dividindo inteiros que resultam em um float, usamos o casting dessa expressão com (double) <expressão>
	}

}
