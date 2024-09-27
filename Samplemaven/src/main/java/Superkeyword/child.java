package Superkeyword;

public class child extends parent
{
	String colour="red";
	public child(int a)
	{
		super(456);
		System.out.println("Child constructor"+ a);

	}
	public void display()
	{
		System.out.println("Child name is " +name);
		System.out.println("Child name is " +super.name);
		super.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 child ob= new child(123);
 ob.display();

 
	}

}
