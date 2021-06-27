package conta_exercicio_poo_1;

import java.util.ArrayList;
import java.util.List;

public class ManipuladorDeContas {
	private List<Account> accounts;
	
	public ManipuladorDeContas() {
		accounts = new ArrayList<Account>();
	}
	
	public void addAccounts(Account account) {
		this.accounts.add(account);
	}
	
	public void salvaDados() {
		RepositorioDeContas repository = new RepositorioDeContas();
		repository.salva(accounts);
	}

}
