package Encapsulation;

public class Customermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Customer obj= new Customer();

	obj.setAcc(123456);
	obj.setBal(10000);
	System.out.println("Acount num is "+obj.getAcc());
	System.out.println("Balance is "+obj.getBal());
	

	}

}
