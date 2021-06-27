package exercicio_fixacao_sintaxe_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ex.: 3.3
		int gastosJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastosMarço = 17000;
		
		int gastosTrimestre = gastosJaneiro+gastoFevereiro+gastosMarço;
		System.out.println("Gasto do trimestre: R$ "+gastosTrimestre);
		double mediaPorMes = gastosTrimestre/3;
		System.out.println("Media mensal: R$ "+mediaPorMes);
		
		FibonacciRecursiva fib = new FibonacciRecursiva();
		for(int i = 1; i <= 6; i++) {
			int resultado = fib.calculaFibonacci(i);
			System.out.println(resultado);
		}
		
	}

}
