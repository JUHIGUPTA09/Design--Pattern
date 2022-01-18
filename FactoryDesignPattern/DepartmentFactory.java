package FactoryDesignPattern;

public class DepartmentFactory {

	public static Department getDepartmentFactory(String name)
	{
		if(name=="electronics")
		{
			return new Electronics();
		}
		else if(name=="HR")
		{
			return new HR();
		}
		else if(name=="Account")
		{
			return new Account();
		}
		return null;
	}
	
	
	
}
