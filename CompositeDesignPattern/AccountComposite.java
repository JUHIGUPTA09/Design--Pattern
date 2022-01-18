package CompositeDesignPattern;

import java.util.ArrayList;

public class AccountComposite {
	private double totalBal=0;
	ArrayList<Account> actList=new ArrayList<>();

	public void shwBalance(ArrayList<Account> actList)
	{
		for(Account a:actList)
		{
			totalBal=totalBal+a.getBalance();
		}
		
		System.out.println(totalBal);
	}

	public void addAccount(Account a)
	{
		actList.add(a);
	}

	public ArrayList<Account> getActList() {
		return actList;
	}

	public void setActList(ArrayList<Account> actList) {
		this.actList = actList;
	}
	
	
	
}
