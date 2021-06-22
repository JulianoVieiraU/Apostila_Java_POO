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

	}

}
