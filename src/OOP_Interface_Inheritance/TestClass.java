package OOP_Interface_Inheritance;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Car c = new Car(); System.out.println(c.max_speed);
		 * 
		 * c.electricVehicle(); c.color(); c.fourWheel(); Car.Engine();
		 * 
		 * 
		 * Vehicle v = new Car(); //when we try to access the variable from the parent's
		 * reference by holding the child's object, // it will be accessed from the
		 * parent class. Overriding is applicable only to methods
		 * System.out.println(v.max_speed); System.out.println(v instanceof Car);
		 * System.out.println(v instanceof Vehicle); v.electricVehicle(); v.fourWheel();
		 * Vehicle.Engine();
		 * 
		 * Vehicle v1 =new Vehicle(); System.out.println(v1.max_speed);
		 * v1.electricVehicle(); Vehicle.Engine(); v1.fourWheel();
		 */
		Car c1 = new Car("Auto");
		Car c2 = new Car("4w",150,"manual");
		System.out.println(c1.trans + c1.max_speed + c1.type);
		System.out.println(c2.trans + c2.max_speed + c2.type);
		
	
		
		
	}

	

}
