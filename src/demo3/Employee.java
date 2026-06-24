package demo3;
abstract class EmployeeDemo
{
	public abstract void calculateSalary();
	public void displayCompanyName()
	{
		System.out.println("Company Name is ZOHO!");
	}
}

class PermanentEmployee extends EmployeeDemo
{
	@Override
	public void calculateSalary()
	{
		double hra = 234300.08;
		double ra = 456709.898;
		double total = hra+ra;
		System.out.println("Permanent Employee:" + total);
	}
}

class ContractEmployee extends EmployeeDemo
{
	@Override
	public void calculateSalary()
	{
		int salary = 550000;
		System.out.println("Contract Employee:" + salary);
	}
}
public class Employee {
	public static void main(String[] args) {
		EmployeeDemo pe = new PermanentEmployee();
		EmployeeDemo ce = new ContractEmployee();
		pe.displayCompanyName();
		pe.calculateSalary();
		System.out.println();
		ce.displayCompanyName();
		ce.calculateSalary();
	}

}
