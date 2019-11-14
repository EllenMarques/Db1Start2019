import java.util.*;

//Exerc�cios de Texto (String)
//1 - M�todo que receba um texto e devolva ele em LETRAS MAIUSCULAS
//2 - M�todo que receba um texto e devolva ele em LETRAS MINUSCULAS
//3 - M�todo que receba DB1START e retorne a quantidade de letras que existe nesta palavra
//4 - M�todo que receba DB1START (tendo um espa�o no inicio e no fim da palavra) e retorne a quantidade de letras que existe
//5 - M�todo que retorne o item 4 com a mesma quantidade de letras do item 3. DB1START com espa�o no come�o e no final deve retornar somente DB1START ------------FAZER
//6 - M�todo que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
//7 - M�todo que receba o seu nome completo e exiba a partir da terceira letra do seu nome
//8 - M�todo que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
//9 - M�todo que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
//10 - M�todo que receba o seguinte texto "banana, ma��, melancia" e exiba o texto separadamente.
//11 - M�todo que receba um texto e exiba quantas vogais tem no texto
//12 - M�todo que receba um texto e devolva ele invertido

public class Texto {
	Scanner scanner = new Scanner (System.in);

	public void minuscula() {
		System.out.println("texto minusculo: ");
		String txt = scanner .next();
		System.out.println(txt.toLowerCase());
		
	}
	
	
	public void maiusculo() {
		System.out.println("texto maiusculo: ");
		String txt = scanner .next();
		System.out.println(txt.toUpperCase());
	
	}
	
	public void quantidadeLetra() {
		System.out.println("texto quantidade de letras: ");
		String txt = scanner .next();
		System.out.println(txt.length());
	}
	
	public void quantidadeEspaco() {
		System.out.println("texto quantidade de letras com espa�o: ");
		String txt = scanner.next();
		txt = txt.replaceAll(" ", "");
		System.out.println(txt.length());
	}
	
	public void quatroLetras() {
		System.out.println("Exibir as 4 primeiras letras: ");
		String txt = scanner .next();
		System.out.println(txt.substring(0, 4));
	}
	
	public void tresFrente() {
		System.out.println("Exibir da terceira letra pra frente: ");
		String txt = scanner .next();
		System.out.println(txt.substring(2, txt.length()));
	}
	
	public void quatroUltimas() {
		System.out.println("Exibir as 4 ultimas letras: ");
		String txt = scanner .next();
		System.out.println(txt.substring(txt.length()-4, txt.length()));
	}
	
	public void vogais() {
		System.out.println("Exibir sem vogais: ");
		String txt = scanner .next();
		txt = txt.replaceAll("[^aeiou]", "");
		txt = txt.trim();
		System.out.println(txt.length());
	}
	
	public void separado() {
		System.out.println("Exibir separado: ");
		String txt = "banana, ma��, melancia";
		txt = txt.replaceAll(" ", "");
		txt = txt.replaceAll(",", "\n");
		
		System.out.println(txt);
	}
	
	public void nomeCompleto() {
		System.out.println("Substituir primeiro nome: ");
		String txt = scanner.nextLine();
		String[] primeiroNome = txt.split(" ", 2);
		System.out.println(txt.replaceFirst(primeiroNome[0], "ALUNO"));
	}
	
	public void textoInvertido() {
		System.out.println("Inverter texto: ");
		String txt = scanner.nextLine();
		StringBuilder txtInvertido = new StringBuilder(txt);
		System.out.println(txtInvertido.reverse());
	}
}
