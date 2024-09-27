package Polymorphism;

public class child extends Parent {
	public void sum(int f, int h)
	{
		super.sum(10,20);
		System.out.println("Child class method");
		System.out.println(f+h);
	}
	
	
	public static void main(String[] args)
	{
		child obj = new child();
		obj.sum(10,40);
		
}
}