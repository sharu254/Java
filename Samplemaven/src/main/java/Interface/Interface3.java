package Interface;

public class Interface3 implements Interface1, Interface2 {

	
	public void display()
	{
		System.out.println("Interface1"+A);
	}
	public void show()
	{
		System.out.println("Interface2"+B);
		
	}
	
	public void add()
	{
		System.out.println(A+B);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Interface3 obj= new Interface3();
obj.display();
obj.show();
obj.add();
	}

}
