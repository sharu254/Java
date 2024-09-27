package Encapsulation;

public class Student {
	private int roll;
	private String name;
	private String dept;
	
	public void setter(int roll,String name,String dept)
	{
		this.roll=roll;
		this.name=name;
		this.dept=dept;
	}
public void getter()
{
	System.out.println(roll);
	System.out.println(name);
	System.out.println(dept);
	
}
}
