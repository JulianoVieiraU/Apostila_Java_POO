package conta_exercicio_poo_1;

public class Main {

	public static void main(String[] args) {
		ManipuladorDeContas accountMani = new ManipuladorDeContas();
		
		Account conta_1 = new Account("Juliano", 1234, "Caixa", 200);
		Account conta_2 = new Account("Ronaldo", 1233, "Caixa", 200);
		Account conta_3 = new Account("Juliano", 1244, "Caixa", 200);
		Account conta_4 = new Account("Juliano", 1255, "Caixa", 200);
		
		conta_1.getDataForPrinting();
		
		accountMani.addAccounts(conta_1);
		accountMani.addAccounts(conta_2);
		accountMani.addAccounts(conta_3);
		accountMani.addAccounts(conta_4);
		
		accountMani.salvaDados();
		
		

	}

}
