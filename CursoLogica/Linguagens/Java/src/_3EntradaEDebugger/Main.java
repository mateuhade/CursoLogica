package _3EntradaEDebugger;
                          // DICA PARA BIBLIOTECAS: CTRL+SHIFT+O ADICIONA TODAS AS BIBLIOTECAS NECESSÁRIAS PARA RODAR O PROGRAMA 
import java.util.Scanner; // biblioteca usada para leitura de dados no terminal do java

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // aqui nós criamos um objeto chamado "sc" do tipo "Scanner", importado da biblioteca java.util.Scanner, que ao utilizado irá ler o terminal
		
		int a;
		double b;
		char c;
		String d;
		
		System.out.print("Digite o valor de a: ");
		a = sc.nextInt(); // pega um valor int
		
		System.out.print("Digite o valor de b: ");
		b = sc.nextDouble(); // pega um valor double
		
		System.out.print("Digite o valor de c: ");
		c = sc.next().charAt(0); // pega o caractere 0 lido de uma string enviada no cmd
		
		sc.nextLine(); // assim como em C, ao tentar ler uma string após o envio de algum outro dado, o java irá ler a última quebra de linha ao invés disso, e para evitar isso usamos o
		               // sc.nextline fora de variáveis e sem parâmetros, chamamos isso de limpeza de buffer
		System.out.print("Digite o valor de d: ");
		d = sc.nextLine(); // pega um valor string até a quebra de linha
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		sc.close(); // em java, sempre que você usa um recurso como sc.nextLine() você estabelece uma conexão com o teclado do computador, caso existam muitas instâncias de aberturas de
		// conexões, isso poderá causar um peso grande na memória do computador. Para evitar isso, fechamos todas as conexões criadas por um objeto usando <objeto>.close()
	}

}

// caso você queira rodar o debug utilizando a IDE do eclipse, é só estabelecer um breakpoint clicando duas vezes na esquerda do número da linha que terá um breakpoint, e rodar o debug
// no canto superior esquerdo logo em baixo da aba de refactor. para avançar a etapa do debug, é só apertar F6.