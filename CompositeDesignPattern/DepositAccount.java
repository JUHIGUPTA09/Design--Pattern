package CompositeDesignPattern;

public class DepositAccount extends Account {
	private String number;
	private double balance;
	
	

	public DepositAccount(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}



	@Override
	public double getBalance() {
		
       return balance;
	}

}
