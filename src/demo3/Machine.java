package demo3;

interface Printable
{
	void print();
}

interface Scannable
{
	void scan();
}

class PrinterMachine implements Printable, Scannable
{
	@Override
	public void print()
	{
		System.out.println("Printing Document.......");
	}
	@Override
	public void scan()
	{
		System.out.println("Scanning Document.......");
	}
}
public class Machine {
	public static void main(String[] args) {
		PrinterMachine m = new PrinterMachine();
		m.scan();
		m.print();
	}

}
