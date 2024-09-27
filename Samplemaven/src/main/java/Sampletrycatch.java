
public class Sampletrycatch {
	
	public static void main(String[] args)
	{
		int a=40;
		int b=10;
		int sum=a+b;
		try
		{
			int result=5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divisible by 0");

		}
		System.out.println("Rest of the code"+sum);
}
	

}
