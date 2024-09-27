package inheritance;

public class Salaryslip extends calculate
{
	private double totalsalary;
	
	public void total()
	{
		totalsalary=basicpay+hra-pf-deduction+bonus;
	}
	public void display()
	{
	 System.out.printf("Basic Pay:  $%.2f%n", basicpay);
    System.out.printf("HRA:        $%.2f%n", hra);
    System.out.printf("PF:         $%.2f%n", pf);
    System.out.printf("Deduction:  $%.2f%n", deduction);
    System.out.printf("Bonus:      $%.2f%n", bonus);
    System.out.printf("Salary: $%.2f%n", totalsalary);

	}
    public class EmployeeSalary {
        public void main(String[] args)
        
        {
            Salaryslip salaryslip = new Salaryslip();
            EmployeeDetail e= new EmployeeDetail();
            e.Details();
            
            Salaryslip.cal();
            
            salaryslip.total();
            
            salaryslip.display();
        }
    
    }
}

