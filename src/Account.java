
public class Account {

	private Integer idNumber;
	private Integer accountNumber;
	private double amount = 0;
	
	public Account(Integer toOpen) {
		
		idNumber = toOpen;
		
	}
	

	public Account(Integer toOpen, double initial) {
		idNumber = toOpen;
		amount = amount + initial;
		
	}
	
	public void takeAwayAmount(double taking) {
		if(taking > amount) {
			return;
		}
		
	amount = amount - taking;
	
	}
	
	public double getAmount() {
		return amount;
		
	}
	
	public void addAmount(double add) {
		
		amount = amount + add;
	}
	
	}

