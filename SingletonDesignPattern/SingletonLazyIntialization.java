package SingletonDesignPattern;

public class SingletonLazyIntialization {
	private static SingletonLazyIntialization  singletonLazyIntialization;
	
	private SingletonLazyIntialization()
	{
		
	}
	
	public static SingletonLazyIntialization getInstance()
	{
		if(singletonLazyIntialization==null)
		{
			singletonLazyIntialization=new 	SingletonLazyIntialization();
		}
		
		return singletonLazyIntialization;
	}

}
