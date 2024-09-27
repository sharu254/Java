package Polymorphism;

public class football extends sports {
	public void play()
	{
				System.out.println("playing football");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sports ob3 = new sports();
		ob3.play();
				football ob= new football();
		ob.play();
		cricket ob1= new cricket();
		ob1.play();
		hockey ob2= new hockey();
		ob2.play();
		

	}

}
