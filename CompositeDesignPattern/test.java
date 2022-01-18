package CompositeDesignPattern;

public class test {

	public static void main(String[] args) {
		AccountComposite accComp=new AccountComposite();
		accComp.addAccount(new DepositAccount("d12",150.00));
		accComp.addAccount(new DepositAccount("d13",250.00));
		accComp.addAccount(new DepositAccount("s12",150.00));
		accComp.addAccount(new DepositAccount("s13",250.00));
		
		accComp.shwBalance(accComp.getActList());

	}

}
