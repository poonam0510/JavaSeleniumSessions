package JavaSessions;

public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car c = new Car();
		c.engine();
		c.Start();
		c.stop();
		
		Audi a = new Audi();
		a.autoParking();
		a.engine();
		a.Start();
		a.stop();
		
		Car c1 = new Audi();
		c1.Start();
		c1.stop();
		c1.engine();
		((Audi) c1).autoParking();
		
		Vehicla v = new Audi();
		v.engine();
		
		
		

	}
	
	
	

}



