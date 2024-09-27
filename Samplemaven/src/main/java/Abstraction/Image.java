package Abstraction;

public class Image  extends Google{
	
	public void search() {
		System.out.println("Search for Image");
	}
public static void main(String[] args)

{
	Image ob= new Image();
	ob.search();
	ob.dis();

	
}
}
