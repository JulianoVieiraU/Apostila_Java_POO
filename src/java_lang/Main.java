package java_lang;

public class Main {

	public static void main(String[] args) {
		String xx = "762";
		char[] x = xx.toCharArray();
		int newX;
		
		for(int i = 0; i < x.length; i++) {
			newX = x[i] - '0';
			System.out.println(newX);
		}
		
		//Memoria da maquina virtual
		//String[] ss = new String[Integer.MAX_VALUE];
		
		TrabalharComString string = new TrabalharComString();
		string.imprimeLetraPorLetra("Ronaldo");
		
		System.out.println(string.trim("Ronaldo é muito bom"));
		
		string.inverteComStringBuilder("Ronaldo joga muito");
		
		//String para um numero inteiro sem biblioteca
		char c = '3';
		int i = c - '0';
		System.out.println(i);
		
		String numero = "860";
		System.out.println(string.converteParaNumero(numero));

	}

}
