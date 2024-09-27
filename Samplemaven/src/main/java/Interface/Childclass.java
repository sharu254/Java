package Interface;

public class Childclass implements SampleInterface
{
	
	public void display()
	{
		System.out.println("Display method");
		
	}
public void show()
{
	System.out.println("Show method");
	

}

public void print()

{
	System.out.println("Print method");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//SampleInterface obj= new Childclass();
	//obj.display();
	//obj.show();
	//obj.print();
	
	Childclass obj1= new Childclass();
	obj1.display();
	obj1.show();
	obj1.print();
	
	
	}
}

