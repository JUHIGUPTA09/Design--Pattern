package BuilderDesignPackage;

public class Vehicle {
	private String engine;
	private String name;
	private int airBags;
	
	private Vehicle(VehicleBuilder v)
	
	{
		this.engine=v.engine;
		this.name=v.name;
		this.airBags=v.airBags;
		
		
	}
	
	
	

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", name=" + name + ", airBags=" + airBags + "]";
	}




	 static class VehicleBuilder
	{
		private String engine;
		private String name;
		private int airBags;
		
		public VehicleBuilder(String engine,String name)
		{
			this.engine=engine;
			this.name=name;
		}

		public VehicleBuilder setAirBags(int airBags) {
			this.airBags = airBags;
			return this;
		}
		
		public Vehicle build()
		{
			return new Vehicle (this);
		}
		
	}
	
}
