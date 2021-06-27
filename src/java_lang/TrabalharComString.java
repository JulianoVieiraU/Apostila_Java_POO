package java_lang;

public class TrabalharComString {
	
	public boolean contain(String texto, String palavra) {
		return texto.contains(palavra);
	}
	
	public String trim(String texto) {
		return texto.trim();
	}
	
	public void imprimeLetraPorLetra(String texto) {
		for(int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}
	
	public void inverteComStringBuilder(String texto) {
		System.out.println("\t");
		StringBuilder invertido = new StringBuilder(texto).reverse();
		System.out.println(invertido);
	}
	
	public int converteParaNumero(String numero) {
		int resultado = 0;
		while(numero.length() > 0) {
			char algarismo = numero.charAt(0);
			resultado = resultado * 10 + (algarismo - '0');
			numero = numero.substring(1);
		}
		
		return resultado;
	}
}
