package conta_exercicio_poo_1;

import java.util.Date;

public class OppenDate {
	private int day;
	private int mounth;
	private int year;
	
	public OppenDate(int day, int mounth, int year) {
		this.day = day;
		this.mounth = mounth;
		this.year = year;
	}
	
	public String getDate() {
		return this.year+"/"+this.mounth+"/"+this.day;
	}
}
