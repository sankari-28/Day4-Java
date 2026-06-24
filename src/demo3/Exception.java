package demo3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter an index:");
			int index = sc.nextInt();
			System.out.println("Value at index" +" "+ index +" " + "is :" + arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index! Array index is out of bounds.");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input! Please enter an integer.");
		}
	}

}
