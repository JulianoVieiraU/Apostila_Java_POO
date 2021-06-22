package conta_exercicio_poo_1;

public class BonusControl {
	private double totalOfBonus = 0;
	
	public void register(Employee e) {
		System.out.println("Add Bonus Of Employee: "+e);
		this.totalOfBonus += e.getBonus();
	}
	
	public double getTotalOfBonus() {
		return this.totalOfBonus;
	}

}
