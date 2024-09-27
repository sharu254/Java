package Exception;

public class Add {
	
	public void Sum(int a, int b)
	{
		
		int sum=a+b;
		System.out.println(sum);
		
		if (sum>50)		
		{
			throw new ArrayIndexOutOfBoundsException("Greater than 50");
			
		}
				else
				{
					System.out.println("Less than 50");
				}
		
	}

	public static void main(String[] args)
	{
      Add obj= new Add();
		try
		{
		obj.Sum(70,30);
		}
		catch (ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println(e);
		}
	}
}
