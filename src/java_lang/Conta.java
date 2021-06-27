package java_lang;

public class Conta {
	protected String titular;
	protected String agencia;
	protected double saldo;
	
	public Conta(String titular, String agencia, double saldo) {
		this.titular = titular;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "[titular="+titular.toUpperCase()+
				", agencia= "+agencia+", saldo= "+saldo+"]";
	}
}
