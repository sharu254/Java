package Abstraction;

public class Demo extends Abstract
{
	
	public void display()
	{
		System.out.println("Abstract method");
		
	}
	public void print()
	{
		System.out.println("Demo class");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj= new Demo();
		obj.display();
		obj.show();
		obj.print();
	}

}
