
public class Inteiros {
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public int subtracao(int num1, int num2) {
		return num1 - num2;
	}
	
	public int multiplicacao(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divisao(int num1, int num2) {
		return num1 / num2;
	}
	

	public boolean par(int num) {

		return (num % 2) == 0;
	}
	
	
	
	public int maior(int num1, int num2) {
		
		if (num1 > num2) {
			return num1;
		}
		 
		
		return num2;
	}
	
	public int quantidadeImpares(int num) {
		int qtde = 0; 
		for(int i = 0; i <= num; i++) {
			
			if (i % 2 == 1) {
				qtde++; 
			}
		}
		
		return qtde; 
		


	}
}
