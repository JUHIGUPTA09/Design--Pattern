package PrototypeDesignPattern;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
	Student s=new Student("Juhi");
	s.insertdata();
	System.out.println(s);
	System.out.println(s.getSubjectList());
	
	
	Student s1=(Student)s.clone();
	System.out.println(s1);
	System.out.println(s1.getSubjectList());

	}

}
