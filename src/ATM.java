import java.util.HashMap;
public class ATM {
private Integer toOpen;
HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();
	public ATM() {
		
		
	}

	public void openAccount(Integer toOpen) {
		
		Account newAcc = new Account(toOpen);
		accounts.putIfAbsent(toOpen,newAcc);
		
	}

	public void openAccount(Integer toOpen, double initial) {
		Account newAcc = new Account(toOpen,initial);
		accounts.putIfAbsent(toOpen,newAcc);
	}
	
	public void closeAccount(Integer accountNumber) {
		if(accounts.get(accountNumber).getAmount() == 0) {
			accounts.remove(accountNumber);
			System.out.println("closed");
			return;
		}
		System.out.println("Still has balance");
		
	}
	
	public double checkBalance(Integer accountNumber) {
		if(accounts.get(accountNumber) == null) {
			return 0.0;
		}
		if(accounts.get(accountNumber).getAmount() == 0.0) {
			return 0.0;
			
		}
		double balance = accounts.get(accountNumber).getAmount();
		return Math.round(balance*100)/100.0;
		
		
	}
	
	public boolean depositMoney(Integer accountNumber, double deposit) {
		if(deposit < 0) {
			return false;
		}
		else if(accounts.get(accountNumber) == null) {
			return false;
		}
		
		accounts.get(accountNumber).addAmount(deposit);
		
		return true;
		
}
	public boolean withdrawMoney(Integer accountNumber, double withdrawAmount) {
		 if(accounts.get(accountNumber) == null) {
				return false;
			}
		
		if(withdrawAmount > accounts.get(accountNumber).getAmount()) {
			return false;
		}
		if(withdrawAmount < 0) {
			return false;
		}
		
		accounts.get(accountNumber).takeAwayAmount(withdrawAmount);
		return true;
		
	}
	

}
