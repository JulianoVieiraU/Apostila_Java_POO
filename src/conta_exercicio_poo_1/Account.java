package conta_exercicio_poo_1;

import java.util.Date;

public class Account {
	private int accountId;
	private String owner;
	private int accountNo;
	private String agency;
	private double balance;
	private String data;
	private static int totalAccounts;
	
	public Account(String owner, String agency, double value) {
		this.owner = owner;
		this.accountNo = 123456;
		this.agency = agency;
		this.balance = value;
		this.data = new Date().toString();
		Account.totalAccounts ++;
		this.accountId = Account.totalAccounts;
	}
	
	public static int getTotalAccounts() {
		return Account.totalAccounts;
	}
	
	public int getAcountId() {
		return this.accountId;
	}
	
	public boolean withdraw(double value) {
		if(balance >= value && value > 0) {
			this.balance -= value;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deposit(double value) {
		this.balance += value;
		return true;
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
		data[4] = "Date: "+this.data;
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
