package exercicio_fixacao_sintaxe_1;

public class MultiplosDeTresAteCem {
	public static void main(String[] args) {
		System.out.println("\nMultiplos de 3 entre 1 e 100");
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
