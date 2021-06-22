package conta_exercicio_poo_1;

public class Manager extends Employee implements Authenticate{
	private int password;
	private int numberOfEmployees;
	
	public boolean authenticate(int password) {
		if(this.password == password) {
			System.out.println("Access Allowed");
			return true;
		}else {
			System.out.println("Access Denied");
			return false;
		}
	}
	
	@Override
	public double getBonus() {
		return this.salary*0.15;
	}

}
