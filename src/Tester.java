
public class Tester {

	public static void main(String[] args) {
		ATM chase = new ATM();
		
		chase.openAccount(00001);
		//chase.depositMoney(00001, -433.45);
		//chase.closeAccount(00001);
		//System.out.println(chase.checkBalance(00001));
		chase.openAccount(00002, 2500.0);
		
		chase.depositMoney(00001, 433.45);
		chase.depositMoney(00001, 434.77);
		chase.depositMoney(00001, 424.91);
		chase.depositMoney(00001, 474.10);
		chase.depositMoney(00002, 154.30);
		System.out.println(chase.checkBalance(00001)); // Should be 1767.23
		System.out.println(chase.checkBalance(00002)); // Should be 2654.30
		chase.withdrawMoney(00001, 100.00);
		chase.withdrawMoney(00001, 1000.00);
		System.out.println(chase.checkBalance(00001)); // Should be 667.23
		//chase.openAccount(102, 250.0);
		//System.out.println(bank.withdrawMoney(102, 100));
		//System.out.println(chase.depositMoney(102, 300));
		//System.out.println(chase.checkBalance(102));
		
		chase.depositMoney(00003, -433.45);
		chase.depositMoney(00004, 32434.77);
		chase.depositMoney(01337, 128537424.91);
		chase.depositMoney(21504, 2343474.10);
		System.out.println(chase.checkBalance(00003)); // Should be 0.0
		System.out.println(chase.checkBalance(00004)); // Should be 0.0
		System.out.println(chase.checkBalance(01337)); // Should be 0.0
		System.out.println(chase.checkBalance(21504)); // Should be 0.0
		
		//System.out.println(chase.checkBalance(00001));
		chase.withdrawMoney(00001, -433.45);
		//System.out.println(chase.checkBalance(00001));
		chase.withdrawMoney(00001, 32434.77);
		//System.out.println(chase.checkBalance(00001));
		chase.withdrawMoney(01337, 128537424.91);
		chase.withdrawMoney(21504, -2343474.10);
		System.out.println(chase.checkBalance(00001)); // Should be 667.23
		System.out.println(chase.checkBalance(00001)); // Should be 667.23
		System.out.println(chase.checkBalance(01337)); // Should be 0.0
		System.out.println(chase.checkBalance(21504)); // Should be 0.0
		
		chase.withdrawMoney(00002, 2020.2);
		System.out.println(chase.checkBalance(00002));
		
	}

}
