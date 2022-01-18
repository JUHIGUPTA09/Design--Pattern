package FacadeDesignPattern;

public class ShapeFacade {

	public void execute(String name)
	{
		switch(name)
		{
		case "Circle" :new Circle().draw();
		               break;
		case "Rectangle" :new Rectangle().draw();
						break;
		case "Triangle" :new Triangle().draw();
						break;
		default:System.out.println("Invalid input");
		}
	}
	
}
