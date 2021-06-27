package conta_exercicio_poo_1;

import java.util.Date;

public class Account {
	private int accountId;
	private String owner;
	private int accountNo;
	private String agency;
	private double balance;
	private String oppenDate;
	private static int totalAccounts;
	
	public Account(String owner, int number, String agency, double value) {
		this.owner = owner;
		this.accountNo = number;
		this.agency = agency;
		this.balance = value;
		Account.totalAccounts ++;
		this.accountId = Account.totalAccounts;
		this.oppenDate = new Date().toString();
	}
	
	public int getAcountId() {
		return this.accountId;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public int getAccountNo() {
		return this.accountNo;
	}
	
	public String getAgency() {
		return this.agency;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public static int getTotalAccounts() {
		return Account.totalAccounts;
	}
	
	public void withdraw(double value) throws SaldoInsuficienteException {
		if(value < 0) {
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo!");
		}
		
		if(balance < value) {
			throw new SaldoInsuficienteException(value);
		}else {
			this.balance -= value;
		}
	}
	
	public void deposit(double value) {
		if(value < 0) {
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo!");
		}else {
			this.balance += value;
		}
	}
	
	public double income() {
		return this.balance*0.1;
	}
	
	public void getDataForPrinting() {
		String[] data = new String[5];
		
		data[0] = "Owner: "+this.owner;
		data[1] = "Id: "+this.accountNo;
		data[2] = "Agency: "+this.agency;
		data[3] = "Balance: "+this.balance;
		data[4] = "Date: "+this.oppenDate;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
