package exercicio_fixacao_sintaxe_1;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println("\n\nFatoriais de 1 a 10");
		int fat;
		for(int i = 1; i <= 10; i++) {
			fat = 1;
			for(int j = i; j >= 1; j--) {
				fat *= j;
			}
			System.out.println("Fatorial de ["+i+"!] = "+fat);
		}
		
		System.out.println("\n\nFatoriais de 1 a 40");
		long fatorial;
		for(int i = 1; i <= 40; i++) {
			fatorial = 1;
			for(int j = i; j >= 1; j--) {
				fatorial *= j;
			}
			System.out.println("Fatorial de ["+i+"!] = "+fatorial);
		}
	}
}
