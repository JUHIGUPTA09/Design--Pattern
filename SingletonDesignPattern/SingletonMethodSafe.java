package SingletonDesignPattern;

public class SingletonMethodSafe {
	private static SingletonMethodSafe  singletonMethodSafe;
	
	private SingletonMethodSafe()
	{
		
	}
	
	public static synchronized SingletonMethodSafe getInstance()
	{
		if(singletonMethodSafe==null)
		{
			singletonMethodSafe=new SingletonMethodSafe();
		}
		
		return singletonMethodSafe;
	}


}
