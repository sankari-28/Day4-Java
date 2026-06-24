package demo3;

abstract class VehicleDemo
{
	public abstract void start();
	void displayVehicleType(String model)
	{
		System.out.println("Vehicle type :" + model);
	}
}

class Bike extends VehicleDemo
{
	@Override
	public void start()
	{
		System.out.println("Bike Model : KTM");
	}
}
class Car extends VehicleDemo
{
	@Override
	public void start()
	{
		System.out.println("Car Model : Mercedes Benz");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		VehicleDemo bike = new Bike();
		VehicleDemo car = new Car();
		
		bike.displayVehicleType("Bike");
		bike.start();
		System.out.println();
		car.displayVehicleType("Car");
		car.start();
	}

}
