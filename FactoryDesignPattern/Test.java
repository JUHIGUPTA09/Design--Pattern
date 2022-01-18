package FactoryDesignPattern;

public class Test {

	public static void main(String[] args) {

		Department d=DepartmentFactory.getDepartmentFactory("HR");
		d.departmentName();

		Department d1=DepartmentFactory.getDepartmentFactory("electronics");
		d1.departmentName();
		
		Department d2=DepartmentFactory.getDepartmentFactory("Testr");
		d2.departmentName();
	}

}
