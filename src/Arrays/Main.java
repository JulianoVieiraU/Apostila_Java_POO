package Arrays;

public class Main {

	public static void main(String[] args) {
		double[] saldo = new double[10];
		
		for(int i = 0; i < saldo.length; i++) {
			saldo[i] = i*100;
		}
		
		double media = 0;
		for(int i = 0; i < saldo.length; i++) {
			media += saldo[i];
		}
		
		media = media/saldo.length;
		System.out.println("A media dos saldos é: "+media);
		
		TestaSplit split = new TestaSplit();
		split.split("Nova frase");
	}

}
