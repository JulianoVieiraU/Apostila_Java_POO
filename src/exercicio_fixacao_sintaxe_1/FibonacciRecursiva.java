package exercicio_fixacao_sintaxe_1;

public class FibonacciRecursiva {
	public static int calculaFibonacci(int n) {
		return (n <= 2) ? 1 : calculaFibonacci(n-1) + calculaFibonacci(n-2);
	}
}
