package OOP_Interface_Inheritance;

public class Vehicle {
	
	int max_speed = 200;
	String type = "4W";
	Vehicle(String type, int max_speed)
	{
		this.max_speed = max_speed;
		this.type = type;
	}
	
	Vehicle()
	{
		
	}
	public static void Engine()
	{
		System.out.println("vehicle---engine");
		
	}
	
	public void fourWheel()
	{
		System.out.println("Vehicle-----fourwheel");
	}
	
	public void electricVehicle()
	{
		System.out.println("Vehicle-----electricVehicle");
	}

}
