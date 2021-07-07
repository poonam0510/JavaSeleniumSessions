package JavaSessions;

public class ArraysConcept {
	
	public static void main(String[] args)
	{
		int[] intArray = new int[4];
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		intArray[3]=40;

		for(int e : intArray)
		{
			System.out.println(e);
		}
		
		
		double d[] = new double[2];
		d[0] = 11.23;
		d[1] = 22.33;
		System.out.println(d[0]+d[1]);
		
		Object[] obj = new Object[4];
		obj[0] = "Tom";
		obj[1] = 30;
		obj[2] = 34.55;
		obj[3] = "London";
		
		for(Object o : obj)
		{
			System.out.println(o);
		}
		
	}

}
