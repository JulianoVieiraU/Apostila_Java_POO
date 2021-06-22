package exercicio_fixacao_sintaxe_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imprimir numeros de 150 a 300
		System.out.println("Imprimir numeros de 150 a 300");
		for(int i = 150; i <= 300; i++) {
			System.out.print(i+" ");
		}
		
		//imprimir a soma de 1 ate 1000
		System.out.println("\n\nImprimir a soma de 1 ate 1000");
		int sum = 0;
		for(int i = 1; i <= 1000; i ++) {
			sum += i;
		}
		System.out.println("A soma de 1 ate 1000 = "+sum);
		
		//multiplos de 3 entre 1 e 100
		System.out.println("\nMultiplos de 3 entre 1 e 100");
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				System.out.print(i+" ");
			}
		}
		
		//fatoriais de 1 a 10
		System.out.println("\n\nFatoriais de 1 a 10");
		long fat;
		for(int i = 1; i <= 10; i++) {
			fat = 1;
			for(int j = i; j >= 1; j--) {
				fat *= j;
			}
			System.out.println("Fatorial de ["+i+"!] = "+fat);
		}
		
		//x par ou impar
		System.out.println("\nX par ou impar");
		int x = 13;
		while(true) {
			if(x%2 == 0) {
				x /= 2;
			}else if(x % 2 > 0) {
				x = (3*x)+1;
			}
			
			if(x <= 1) {
				System.out.print(x);
				break;
			}else {
				System.out.print(x+"->");
			}
		}
		
		//imprimindo tabela
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
