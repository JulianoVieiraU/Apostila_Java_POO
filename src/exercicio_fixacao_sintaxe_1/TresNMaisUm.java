package exercicio_fixacao_sintaxe_1;

public class TresNMaisUm {
	public static void main(String[] args) {
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
	}
}
