package conta_exercicio_poo_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account conta_1 = new Account("Juliano", "Caixa", 200);
		
		conta_1.getDataForPrinting();
		
		System.out.println(Account.getTotalAccounts());

	}

}
