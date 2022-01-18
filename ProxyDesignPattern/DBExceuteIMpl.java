package ProxyDesignPattern;

public class DBExceuteIMpl implements DbExecute {

	@Override
	public void executeDB(String name) throws Exception {
		System.out.println("the Dbexecuteimpl is called and the query is :"+name);

	}

}
