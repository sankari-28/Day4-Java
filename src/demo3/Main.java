package demo3;

interface StudentAccess
{
	public abstract void fetchStudent(int id);
	public abstract void editStudent(int id);
	public abstract void saveStudent(Student student);
	
}

class Student implements StudentAccess
{
	@Override
	public void fetchStudent(int id)
	{
		System.out.println("Fetch Student : " + id);
	}
	@Override
	public void editStudent(int id)
	{
		System.out.println("Edit Student : " + id);
	}
	@Override
	public void saveStudent(Student student)
	{
		System.out.println("Student saved Successfully!");
	}
	public void deleteStudent(int id)
	{
		System.out.println("Delete Student :" + id);
	}
}
public class Main {
	public static void main(String[] args) {
		StudentAccess sa = new Student();
		sa.fetchStudent(101);
		sa.editStudent(102);
		sa.saveStudent(new Student());
	}

}
