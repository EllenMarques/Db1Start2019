import java.util.Scanner;




public class main {
	
	
	public static void main(String[] args) {
		Texto texto = new Texto();
		ValorDouble valorDouble = new ValorDouble();
		Inteiros inteiros = new Inteiros();
		
		int valor1;
		int valor2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Soma: ");
		System.out.println("Valor 1: ");
		valor1 = scanner.nextInt();
		System.out.println("Valor 2: ");
		valor2 = scanner.nextInt();
		System.out.println("A soma �: " + inteiros.soma(valor1, valor2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Divis�o: ");
		System.out.println("Valor 1: ");
		valor1 = scanner.nextInt();
		System.out.println("Valor 2: ");
		valor2 = scanner.nextInt();
		System.out.println("A divis�o �: " + inteiros.divisao(valor1, valor2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Subtra��o: ");
		System.out.println("Valor 1: ");
		valor1 = scanner.nextInt();
		System.out.println("Valor 2: ");
		valor2 = scanner.nextInt();
		System.out.println("A subtra��o �: " + inteiros.subtracao(valor1, valor2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Multiplica��o: ");
		System.out.println("Valor 1: ");
		valor1 = scanner.nextInt();
		System.out.println("Valor 2: ");
		valor2 = scanner.nextInt();
		System.out.println("A multiplica��o �: " + inteiros.multiplicacao(valor1, valor2));
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Verificar se � par: ");
		System.out.println("Valor: ");
		if (inteiros.par(scanner.nextInt())) {
			System.out.println("� par.");
		} else {
			System.out.println("� impar");
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		System.out.println("Verificar quantidade de impares: ");
		System.out.println("Valor: ");
		System.out.println("Quantidade de impares: " + inteiros.quantidadeImpares(scanner.nextInt()));
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.minuscula();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.maiusculo();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.quantidadeLetra();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.quantidadeEspaco();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.quatroLetras();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.tresFrente();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.quatroUltimas();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.vogais();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.separado();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.nomeCompleto();
		
		System.out.println("-------------------------------------------------------------------");
		
		texto.textoInvertido();
		
		System.out.println("-------------------------------------------------------------------");
		
		valorDouble.menorValorEntreDois();
		
		System.out.println("-------------------------------------------------------------------");
		
		valorDouble.menorValorEntreTres();
		
		System.out.println("-------------------------------------------------------------------");
		
		valorDouble.mediaEntreTresNumeros();
		
		System.out.println("-------------------------------------------------------------------");
		
		valorDouble.areaTriangulo();
		
		System.out.println("-------------------------------------------------------------------");
		

	}
}
