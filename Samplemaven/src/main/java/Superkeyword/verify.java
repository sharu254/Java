package Superkeyword;

public class verify extends add
{
	
public void check()
{
	
	int c=super.addition(8,6);
	if (c%10==0)
	{
		System.out.println("Divisible by 10");
	}
	else
	{
		System.out.println("Not divisible by 10");
	}
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       verify  ob =new verify();
       ob.check();
       


	}

}
