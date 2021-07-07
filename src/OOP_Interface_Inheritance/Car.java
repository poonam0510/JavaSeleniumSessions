package OOP_Interface_Inheritance;

public class Car extends Vehicle {

	//int max_speed = 180;
	String trans;
	
	Car(String trans)
	
	{
		this.trans = trans;
	}
	
	Car(String trans,int max_speed,String type)
	{
		super(type,max_speed);
		//this.max_speed = max_speed;
		this.trans = trans;
		//this.type = type;
	}
	
	//method hiding
	public static void Engine()
	{
		System.out.println("Car-----engine");
	}
	
	//individual method
	public void color()
	{
		System.out.println("car----color");
	}
	
	
	//overridden method
	@Override
	public void fourWheel()
	{
		System.out.println("Car----fourWheel");
	}
	
}
