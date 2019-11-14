import java.util.Scanner;

//Exercícios de Matemática (Double)
//1 - Método que exiba qual é o menor valor entre dois doubles
//2 - Método que exiba qual é o menor valor entre três doubles 
//3 - Método que exiba a média de três números
//4 - Método que calcule a área de um triangulo

public class ValorDouble {
	Scanner scanner = new Scanner (System.in);
	
	public void menorValorEntreDois() {
		System.out.println("Menor valor entre dois doubles: ");
		System.out.println("Valor 1: ");
		double valor1 = scanner.nextDouble();
		System.out.println("Valor 2: ");
		double valor2 = scanner.nextDouble();
		System.out.println("O menor valor é: " + Math.min(valor1, valor2));
	}
	
	public void menorValorEntreTres() {
		System.out.println("Menor valor entre tres doubles: ");
		System.out.println("Valor 1: ");
		double valor1 = scanner.nextDouble();
		System.out.println("Valor 2: ");
		double valor2 = scanner.nextDouble();
		System.out.println("Valor 3: ");
		double valor3 = scanner.nextDouble();
		System.out.println("O menor valor é: " + Math.min(valor3, Math.min(valor1, valor2)));
	}
	
	public void mediaEntreTresNumeros() {
		System.out.println("Media entre tres doubles: ");
		System.out.println("Valor 1: ");
		double valor1 = scanner.nextDouble();
		System.out.println("Valor 2: ");
		double valor2 = scanner.nextDouble();
		System.out.println("Valor 3: ");
		double valor3 = scanner.nextDouble();
		System.out.println("A media é: " + (valor1 + valor2 + valor3) / 3);
	}
	
	public void areaTriangulo() {
		System.out.println("Area do triangulo: ");
		System.out.println("Altura: ");
		double altura = scanner.nextDouble();
		System.out.println("Base: ");
		double base = scanner.nextDouble();
		System.out.println("A area é: " + (altura * base) / 2);
	}
	
}
