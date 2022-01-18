package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {
private String name;
private ArrayList<String> subjectList=new ArrayList<>();


	
	public ArrayList<String> getSubjectList() {
	return subjectList;
}

public void setSubjectList(ArrayList<String> subjectList) {
	this.subjectList = subjectList;
}

	public Student()
	{
		
	}
	
	public Student(String name)
	{
	  	this.name=name;
	}
	
	public Student(ArrayList<String> list)
	{
	 	this.subjectList=list;	
	
	}
	public Student(String name,ArrayList<String> list)
	{
	  	this.name=name;
	  	this.subjectList=list;
	}
	
	public void insertdata()
	{
		subjectList.add("English");
		subjectList.add("Math");
		subjectList.add("Physics");
		subjectList.add("Chemistry");
		subjectList.add("Biology");
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", subjectList=" + subjectList + "]";
	}

public Object clone() throws CloneNotSupportedException
	{
//		super.clone();
		ArrayList<String> list=new ArrayList<>();
		for(String s:this.getSubjectList())
		{
			list.add(s);
		}
		
		return new Student(this.name,list);
	}
}
