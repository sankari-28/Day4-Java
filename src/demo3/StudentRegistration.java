package demo3;

public class StudentRegistration {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String rollNo = "101"; 
		String age = "19"; 
		String mobile = "9876543210"; 
		String cgpa = "8.7"; 
		char section = 'A';
		try {
			int r = Integer.parseInt(rollNo);
			System.out.println(" rollNo into integer value :" + r);
			
			int a = Integer.parseInt(age);
			System.out.println(" age into integer value :" + a);
			
			double d = Double.parseDouble(cgpa);
			System.out.println(" cgpa into double value :" + d);
			
			boolean b = Character.isLetter(section);
			System.out.println(" section is a letter or not :" + b);
			
			int count = 0;
			for(int i = 0 ; i < mobile.length() ; i++)
			{
				char ch = mobile.charAt(i);
				if(Character.isDigit(ch))
				{
					count++;
				}
			}
			if(mobile.length() == count)
			{
				System.out.println(" character in mobile number is a digit" );
			}
			else
			{
				System.out.println("character in mobile number is not a digit");
			}
			
			char c = Character.toLowerCase(section);
			System.out.println("section into lowercase :" + c);
			
			char h = Character.toUpperCase(section);
			System.out.println(" section into uppercase :" + h);
			
			String str = Integer.toString(a);
			System.out.println("age integer value into String :" + str);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid number format: "+ e.getMessage());
		}
		System.out.println("Student Details are valid ..!");
		
		
		
	}

}
