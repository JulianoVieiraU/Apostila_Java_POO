package exercicio_fixacao_sintaxe_1;

public class Triangulo {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("\nImprimindo tabela");
		System.out.println("\nTabela");
		for(int i = 1; i < 10; i++) {
			sum = i;
			for(int j = 0; j < i; j++) {
				System.out.print(sum+" ");
				sum += i;
			}
			System.out.println();
		}
	}
}
