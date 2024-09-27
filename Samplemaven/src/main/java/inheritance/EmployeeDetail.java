package inheritance;
import java.util.Scanner;

public class EmployeeDetail 
{
	static double basicpay;
	static double deduction;
	static double bonus;
	static double salary;

	public static void Details()
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the basic pay");
		basicpay = s.nextDouble();

        System.out.print("Enter deduction: ");
        deduction = s.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = s.nextDouble();

        System.out.printf("Basic Pay: $%.2f%n", basicpay);
        System.out.printf("Deduction: $%.2f%n", deduction);
        System.out.printf("Bonus: $%.2f%n", bonus);
        System.out.printf("Salary: $%.2f%n", salary);


		
	}

}
