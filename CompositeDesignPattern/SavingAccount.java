package CompositeDesignPattern;

public class SavingAccount extends Account {
	private String number;
	private double balance;
	
	

	public SavingAccount(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}



	@Override
	public double getBalance() {
		
       return balance;
	}

}
