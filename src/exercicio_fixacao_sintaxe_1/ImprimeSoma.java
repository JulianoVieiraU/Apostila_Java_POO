package exercicio_fixacao_sintaxe_1;

public class ImprimeSoma {
	public static void main(String[] args) {
		System.out.println("\n\nImprimir a soma de 1 ate 1000");
		int sum = 0;
		for(int i = 1; i <= 1000; i ++) {
			sum += i;
		}
		System.out.println("A soma de 1 ate 1000 = "+sum);
	}
}
