package ProxyDesignPattern;

public class test {
	public static void main(String[] args) throws Exception
	{
		DbExecutorProxy d1=new DbExecutorProxy("Admin","Admin123");
//		d1.executeDB("DELETE");
		
		DbExecutorProxy d2=new DbExecutorProxy("User","Pass123");
	//	d2.executeDB("DELETE");
		
		DbExecutorProxy d3=new DbExecutorProxy("User14","Pass123");
		d2.executeDB("UPDATE");

	}
	
}
