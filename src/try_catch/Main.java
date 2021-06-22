package try_catch;

public class Main {
	
	public static void main(String[] args) throws DivisãoPorZeroException {
		int i = 5571;
		try {
	        i = i / 0;
	        System.out.println("O resultado  " + i);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("Teste de erros");
		}
		
		int x = 0;
		if(x == 0) {
			throw new DivisãoPorZeroException("Divisão por zero, tente outro valor!");
		}else {
			i = i / x;
		}
	}

}
