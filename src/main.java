import java.util.Scanner;

// Exercícios de Inteiro (Integer)
// 1 - Método que some dois números *
// 2 - Método que subtraia dois números *
// 3 - Método que multiplique dois números *
// 4 - Método que divida dois números *
// 5 - Método que diga se o número é par *
// 6 - Método que receba dois números e diga qual é o maior *
// 7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele. *


public class main {
	// declaração dos métodos
	/*
	 * static quer dizer q nunca vai mudar (basicamente mas tem mais detalhes)
	 * a proxima palavra é o tipo de retorno no caso do primeiro é INTEGER, o método deve retornar um numero inteiro
	 * depois é o nome do método, no caso do primerio é soma
	 * dentro dos parenteses são os argumentos da função, ou seja, o que ela vai receber, uma função não necessariamente precisa de um retorno ou parametros
	 * 
	 * o return é o q função vai retorna, se eu coloquei um text(string) e falo que o método espera um retorno inteiro vai dar erro
	 * */
	static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	static int subtracao(int num1, int num2) {
		return num1 - num2;
	}
	
	static int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	
	static int divisao(int num1, int num2) {
		return num1 / num2;
	}
	
	/*
	 *  par retorna um boolean
	 *  o sinal de % significa que vai pega o resto da divisao, ex: 3/2 é 1,33
	 * */
	static boolean par(int num) {
		// vai dividir o numero por 2 e ver se a sobra da divisão é maior q 0
		
		//tipo o programa sempre executa de cima pra baixo e da esquerda pra direita
		// ele vai executar o q ta em parenteses primeiro e depois o que vem depois na direita
		// num % 2 sempre vai retorna 0 ou 1

		return (num % 2) == 0;
	}
	
	
	
	static int maior(int num1, int num2) {
		// a função vai parar de ler no primerio retorno
		if (num1 > num2) {
			// se entrar aqui ele nao vai ler o return num2
			return num1;
		}
		 
		
		return num2;
	}
	
	static int quantidadeImpares(int num) {
		int qtde = 0; //inicializando com 0 a quantidade impares
		
		// vai rodar de 0 até a quantidade passada no num
		// pra cada ocorreria impar incrementa =1 na quantidade (qtde)
		for(int i = 0; i <= num; i++) {
			// verifica se é impar
			if (i % 2 == 1) {
				qtde++; // adiciona +1, mesma coisa que fazer: qtde = qtde + 1 ou qtde += 1
			}
		}
		
		return qtde; 

	}
	
	
	public static void main(String[] args) {
		// variavel q pega os valores
		Scanner scanner = new Scanner(System.in);
		
		// buscando o próximo inteiro
		System.out.println("Digite o primerio numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		
		// executando os metodos e pegando o resultado e atribuindo para as variaveis
		/*
		 * a primeira palavra é o tipo da variavel
		 * a segunda é o nome da variavel
		 * o =  é o que ela está recebendo
		 * nos casos abaixo está recebendo os retornos da funções
		 * ex: resultSoma é int e a função soma retorna um int
		 * */
		int resultadoSoma = soma(num1, num2);
		int resultadoSubtracao = subtracao(num1, num2);
		int resultadoMultiplicacao = multiplicacao(num1, num2);
		int resultadoDivisao = divisao(num1, num2);
		int resultadoMaior = maior(num1, num2);
		
		// apresentação dos valores
		// \n pula a linha é tipo enter do teclado
		System.out.println("Soma é " + resultadoSoma);
		System.out.println("\nSubtracao é " + resultadoSubtracao);
		System.out.println("\nMultiplicação é " + resultadoMultiplicacao);
		System.out.println("\nDivisão é " + resultadoDivisao);
		System.out.println("\nDivisão é " + resultadoDivisao);
		System.out.println("\nmaior é " + resultadoMaior);
		
		// verifica o se o numero é par
		System.out.println("\n\nDigite um numero: ");
		int numeroPar= scanner.nextInt();
		boolean resultadoPar = par(numeroPar);
		// ué heuheuehuehe
		System.out.println("é par? " + (resultadoPar ? "Sim" : "Não"));
		
		// mostra a quantidade impares
		System.out.println("\n\nDigite outro numero: ");
		int numero= scanner.nextInt();
		int qtdeImapres = quantidadeImpares(numero);
		System.out.println("\nQuantidade impares:" + qtdeImapres);
	}
}
