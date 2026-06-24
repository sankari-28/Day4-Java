package demo3;
import java.util.Scanner;
import java.lang.Exception;
class InvalidAge extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidAge(String message) {
        super(message);
    }
}

public class UserDefinedException {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAge("Age should be 18 and above");
            }
            System.out.println("Eligible for registration");
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }

	}

}
