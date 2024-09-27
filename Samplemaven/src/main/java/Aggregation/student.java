package Aggregation;

public class student {
	
	int id;
	String name;
	int mark;
	Address add;
	public student(int id,int mark,String name, Address add)
	{
		this.id= id;
		this.name= name;
		this.mark=mark;
		this.add= add;
	}

	public void dis()
	{
		System.out.println("Id is"+id);
		System.out.println("Name is "+ name);
		System.out.println("Mark is "+mark);
		System.out.println("Houseno "+add.houseno);
		System.out.println("Pincode "+add.pincode);
		System.out.println("Housename "+add.Housename);
	}
public static void main (String[] args)
{
	Address obj1=new Address(1234,"abc",45264,"Trivandrum");
	student obj2=new student(34,100,"def",obj1);
	obj2.dis();
}
}
