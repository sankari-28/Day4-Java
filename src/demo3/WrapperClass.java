package demo3;

public class WrapperClass {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String age = "21"; 
		String mark = "89.5"; 
		int salary = 35000; 
		double percentage = 87.75; 
		char section = 'A'; 
		
		int a = Integer.parseInt(age);
		System.out.println("age from String to int :" + a);
		
		double m = Double.parseDouble(mark);
		System.out.println(" mark from String to double :" + m);
		
		String s = Integer.toString(salary);
		System.out.println(" salary from int to String :" + s);
		
		String d = Double.toString(percentage);
		System.out.println(" percentage from double to String :" + d);
		
		Integer num1 = 50;
		Integer num2 = 75;
		System.out.println(" Compare two Integer values :" + Integer.compare(num1, num2));
		
		System.out.println(" maximum of two integer values :" + Integer.max(num1, num2));
		
		System.out.println("minimum of two integer values :" + Integer.min(num1, num2));
		
		Integer obj = 100;
		int value = obj.intValue();
		System.out.println(" Integer object into int :" + value);
		
		Double obj2 = 20.9;
		double value2 = obj2.doubleValue();
		System.out.println(" Double object into double :" + value2);
		
		boolean b = Character.isLetter(section);
		System.out.println(" section is a letter or not :" + b);
	}

}
