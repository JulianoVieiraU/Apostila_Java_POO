package conta_exercicio_poo_1;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(double value) {
		super("Saldo insuficiente para sacar o valor de: "+value);
	}
}
