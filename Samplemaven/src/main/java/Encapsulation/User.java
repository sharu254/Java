package Encapsulation;


public class User  extends Bank
{
	public static void main(String[] args)
	
	{
	
	Bank b= new Bank();
    b.setPin(1212,1001,1234);
	b.validate();
     b.getPin();
	b.withdraw();
	

	}

}
