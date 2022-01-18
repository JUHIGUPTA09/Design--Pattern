package SingletonDesignPattern;

public class SingletonBlockSafe {
	private static SingletonBlockSafe  singletonMethodSafe;
	
	private SingletonBlockSafe()
	{
		
	}
	
	public static synchronized SingletonBlockSafe getInstance()
	{
		if(singletonMethodSafe==null)
		{
			synchronized (SingletonBlockSafe.class) {
				if(singletonMethodSafe==null)
				{
				singletonMethodSafe=new SingletonBlockSafe();
				}
			}
			
		}
		
		return singletonMethodSafe;
	}


}
