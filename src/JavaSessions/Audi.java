package JavaSessions;

public class Audi extends Car{
	
	@Override
	public void Start()
	{
		System.out.println("Audi---Start");
	}
	
	@Override
	public void engine()
	{
		System.out.println("Audi------Engine");
	}
	
	
	public void autoParking()
	{
		System.out.println("Audi----autoparking");
	}

}
