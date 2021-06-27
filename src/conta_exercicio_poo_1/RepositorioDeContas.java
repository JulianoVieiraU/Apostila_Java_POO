package conta_exercicio_poo_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioDeContas {
	
	public void salva(List<Account> contas) {
		PrintStream stream;
		try {
			stream = new PrintStream("./file/contas.txt");
			for(Account conta : contas) {
				stream.println(conta.getAcountId()+","+conta.getAccountNo()+","
						+conta.getAgency()+","+conta.getOwner()+","
						+conta.getBalance());
			}
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<Account> carregaDados(){
		RepositorioDeContas repositprio = new RepositorioDeContas();
		try {
			return repositprio.carrega();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<Account> carrega() throws FileNotFoundException{
		List<Account> accounts = new ArrayList<>();
		try(Scanner scanner = new Scanner(new File("./file/contas.txt"))){
			while(scanner.hasNextLine()) {
				Account account;
				String linha = scanner.nextLine();
				String[] valores = linha.split(",");
				int accountId = Integer.parseInt(valores[0]);
				int accountNo = Integer.parseInt(valores[1]);
				String agency = valores[2];
				String owner = valores[3];
				double balance = Double.parseDouble(valores[4]);
				
				account = new Account(owner, accountNo, agency, balance);
				
				accounts.add(account);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Não tem arquivo ainda");
		}
		
		return accounts;
		
	}
}
