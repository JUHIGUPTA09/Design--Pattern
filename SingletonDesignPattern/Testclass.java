package SingletonDesignPattern;

public class Testclass {

	public static void main(String[] args)
	{
		//Eager Intialization
		SingletonEagerIntialization singletonEagerIntialization1=SingletonEagerIntialization.getInstance();
		System.out.println(singletonEagerIntialization1);
		SingletonEagerIntialization singletonEagerIntialization2=SingletonEagerIntialization.getInstance();
		System.out.println(singletonEagerIntialization2);
		
		
		//Lazy Intialization
		SingletonLazyIntialization singletonLazyIntialization1=SingletonLazyIntialization.getInstance();
		System.out.println(singletonLazyIntialization1);
		SingletonLazyIntialization singletonLazyIntialization2=SingletonLazyIntialization.getInstance();
		System.out.println(singletonLazyIntialization2);
		
		//ThreadSafe Via Method Approcach 
		SingletonMethodSafe SingletonMethodSafe1=SingletonMethodSafe.getInstance();
		System.out.println(SingletonMethodSafe1);
		SingletonMethodSafe SingletonMethodSafe2=SingletonMethodSafe.getInstance();
		System.out.println(SingletonMethodSafe2);
		
		
		//ThreadSafe Via Block Approcach 
		SingletonBlockSafe singletonBlockSafe1=SingletonBlockSafe.getInstance();
		System.out.println(singletonBlockSafe1);
		SingletonBlockSafe singletonBlockSafe2=SingletonBlockSafe.getInstance();
		System.out.println(singletonBlockSafe2);
		
		
		
	}
}
