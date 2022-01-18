package ProxyDesignPattern;

public class DbExecutorProxy implements DbExecute {
	
	//private String name;
	//private String password;
	DBExceuteIMpl dbExceute=new DBExceuteIMpl();;
	boolean ifAdmin;
	
	
	

	public DbExecutorProxy(String name, String password) {
      if(name.equals("Admin")&& password.equals("Admin123"))
      {
    	  ifAdmin=true;
      }		
	}




	@Override
	public void executeDB(String query) throws Exception{
	if(ifAdmin)
	{
		dbExceute.executeDB(query);
	}
	else
	{
		if(query.equals("DELETE"))
		{
			throw new Exception("Only admin can fire delete query");
		}
			
		else
			 dbExceute.executeDB(query);
	}    
	}

}
