package BuilderDesignPackage;

public class test {

	public static void main(String[] args) {
       Vehicle v=new Vehicle.VehicleBuilder("MTX","Ford").build();
       System.out.println(v);
       Vehicle v1=new Vehicle.VehicleBuilder("Roar","BMW").setAirBags(5).build();
       System.out.println(v1);
	}

}
