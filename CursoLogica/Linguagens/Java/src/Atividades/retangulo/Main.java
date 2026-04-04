package Atividades.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = (base + altura) * 2.0;
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.println("AREA DO RETANGULO = " + String.format("%.4f", area));
		System.out.println("PERÍMETRO DO RETANGULO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL DO RETANGULO = " + String.format("%.4f", diagonal));
		
		sc.close();
	}

}
