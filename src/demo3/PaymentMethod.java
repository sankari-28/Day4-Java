package demo3;

interface Payment
{
	void makePayment(double amount);
}
class UPIPayment implements Payment
{
	@Override
	public void makePayment(double amount)
	{
		System.out.println("Payment done..." + amount);
	}
}
class CardPayment implements Payment
{
	@Override
	public void makePayment(double amount)
	{
		System.out.println("Payment done..." + amount);
	}
}
public class PaymentMethod {
	public static void main(String[] args) {
		UPIPayment up = new UPIPayment();
		up.makePayment(22.28);
		CardPayment cp = new CardPayment();
		cp.makePayment(28.22);
	}

}
