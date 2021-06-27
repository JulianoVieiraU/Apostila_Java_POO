package Arrays;

public class TestaSplit {
	
	public void split(String frase) {
		String[] palavras = frase.split(" ");
		String newFrase = "";
		
		for(int i = palavras.length-1; i >= 0; i--) {
			newFrase += palavras[i]+" ";
		}
		
		System.out.println(newFrase);
	}

}
