package exercicio_fixacao_sintaxe_1;

public class Fibonacci {
	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;
		
		while(atual < 100) {
			System.out.println(atual);
			int prox = anterior+atual;
			anterior = atual;
			atual = prox;
		}
		
		System.out.println(atual);
	}
}
