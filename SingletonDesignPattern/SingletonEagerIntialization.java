package SingletonDesignPattern;

//Eager Intialization
public class SingletonEagerIntialization {
	//create a private static Instance
	private static SingletonEagerIntialization singletonEagerIntialization;
	
	
	//create constructor as private
	private SingletonEagerIntialization()
	{
		
	}
	
	
	
	//create a static method to get the object
	public static SingletonEagerIntialization getInstance()
	{
		if(singletonEagerIntialization==null)
		{
			singletonEagerIntialization=new SingletonEagerIntialization();
		}
		
		return singletonEagerIntialization;
	}
	

}
