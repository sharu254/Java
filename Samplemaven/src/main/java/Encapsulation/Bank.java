package Encapsulation;
public class Bank {
	private  int pin;
	private  int pin1;

	private  int pin2;

	public int getPin() {
		
		return pin;
		
	}

	public void setPin(int pin,int pin1, int pin2)
	{
		this.pin = pin;
		this.pin1=pin1;
		this.pin2=pin2;
		System.out.println("pin is "+pin);
	}
	
public void validate()
{
	if(pin==1001||pin==1234||pin==1212)
	{
		System.out.println("The pin is valid");
	}
	else
	{
		System.out.println("Invalid pin");
}}
	
	public void  withdraw()
	{
int c= 2000;
System.out.println("The amount to be withdraw is"+c);
	}
}
