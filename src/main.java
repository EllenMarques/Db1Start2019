import java.util.Scanner;

// Exerc�cios de Inteiro (Integer)
// 1 - M�todo que some dois n�meros *
// 2 - M�todo que subtraia dois n�meros *
// 3 - M�todo que multiplique dois n�meros *
// 4 - M�todo que divida dois n�meros *
// 5 - M�todo que diga se o n�mero � par *
// 6 - M�todo que receba dois n�meros e diga qual � o maior *
// 7 - M�todo que a partir de um valor inicial, mostre a quantidade de n �mpares at� ele. *


public class main {
	// declara��o dos m�todos
	/*
	 * static quer dizer q nunca vai mudar (basicamente mas tem mais detalhes)
	 * a proxima palavra � o tipo de retorno no caso do primeiro � INTEGER, o m�todo deve retornar um numero inteiro
	 * depois � o nome do m�todo, no caso do primerio � soma
	 * dentro dos parenteses s�o os argumentos da fun��o, ou seja, o que ela vai receber, uma fun��o n�o necessariamente precisa de um retorno ou parametros
	 * 
	 * o return � o q fun��o vai retorna, se eu coloquei um text(string) e falo que o m�todo espera um retorno inteiro vai dar erro
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
	 *  o sinal de % significa que vai pega o resto da divisao, ex: 3/2 � 1,33
	 * */
	static boolean par(int num) {
		// vai dividir o numero por 2 e ver se a sobra da divis�o � maior q 0
		
		//tipo o programa sempre executa de cima pra baixo e da esquerda pra direita
		// ele vai executar o q ta em parenteses primeiro e depois o que vem depois na direita
		// num % 2 sempre vai retorna 0 ou 1

		return (num % 2) == 0;
	}
	
	
	
	static int maior(int num1, int num2) {
		// a fun��o vai parar de ler no primerio retorno
		if (num1 > num2) {
			// se entrar aqui ele nao vai ler o return num2
			return num1;
		}
		 
		
		return num2;
	}
	
	static int quantidadeImpares(int num) {
		int qtde = 0; //inicializando com 0 a quantidade impares
		
		// vai rodar de 0 at� a quantidade passada no num
		// pra cada ocorreria impar incrementa =1 na quantidade (qtde)
		for(int i = 0; i <= num; i++) {
			// verifica se � impar
			if (i % 2 == 1) {
				qtde++; // adiciona +1, mesma coisa que fazer: qtde = qtde + 1 ou qtde += 1
			}
		}
		
		return qtde; 

	}
	
	
	public static void main(String[] args) {
		// variavel q pega os valores
		Scanner scanner = new Scanner(System.in);
		
		// buscando o pr�ximo inteiro
		System.out.println("Digite o primerio numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int num2 = scanner.nextInt();
		
		// executando os metodos e pegando o resultado e atribuindo para as variaveis
		/*
		 * a primeira palavra � o tipo da variavel
		 * a segunda � o nome da variavel
		 * o =  � o que ela est� recebendo
		 * nos casos abaixo est� recebendo os retornos da fun��es
		 * ex: resultSoma � int e a fun��o soma retorna um int
		 * */
		int resultadoSoma = soma(num1, num2);
		int resultadoSubtracao = subtracao(num1, num2);
		int resultadoMultiplicacao = multiplicacao(num1, num2);
		int resultadoDivisao = divisao(num1, num2);
		int resultadoMaior = maior(num1, num2);
		
		// apresenta��o dos valores
		// \n pula a linha � tipo enter do teclado
		System.out.println("Soma � " + resultadoSoma);
		System.out.println("\nSubtracao � " + resultadoSubtracao);
		System.out.println("\nMultiplica��o � " + resultadoMultiplicacao);
		System.out.println("\nDivis�o � " + resultadoDivisao);
		System.out.println("\nDivis�o � " + resultadoDivisao);
		System.out.println("\nmaior � " + resultadoMaior);
		
		// verifica o se o numero � par
		System.out.println("\n\nDigite um numero: ");
		int numeroPar= scanner.nextInt();
		boolean resultadoPar = par(numeroPar);
		// u� heuheuehuehe
		System.out.println("� par? " + (resultadoPar ? "Sim" : "N�o"));
		
		// mostra a quantidade impares
		System.out.println("\n\nDigite outro numero: ");
		int numero= scanner.nextInt();
		int qtdeImapres = quantidadeImpares(numero);
		System.out.println("\nQuantidade impares:" + qtdeImapres);
	}
}
