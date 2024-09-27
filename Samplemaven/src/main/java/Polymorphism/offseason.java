package Polymorphism;


public class offseason extends onseason
{
	
	
	public void discount(float a, float b)
	{
		System.out.println("OFFSEASON SALE");

		float d=a+b;
		System.out.println("Total amount of clothes for offseason is" +d);
		float s=(d*0.15f);
		System.out.println("The discounted amount of off season is" + s);
		super.discount(2000,100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		offseason ob= new offseason();
		ob.discount(2000,100);
		
		
	}

}
