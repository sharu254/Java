package Exception;

public class ChildLicenseException {

	public static void check(int age) throws LicenceException
	{
		if (age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new LicenceException("Not Eligible");
			
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			ChildLicenseException.check(15);
		}
	
	
	catch (LicenceException e)
	{
		System.out.println(e);
	}
	}
}



