package demo3;
import java.util.Scanner;

public class TryCatchDivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter 1st number:");
			int num1= sc.nextInt();
			System.out.println("Enter 2nd number:");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Cannot divide by zero");
		}
		sc.close();
	}
}
