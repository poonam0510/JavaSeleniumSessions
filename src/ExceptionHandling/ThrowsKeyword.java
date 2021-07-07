package ExceptionHandling;

public class ThrowsKeyword {

	public void m1()
	{
		m2();
	}
	
	public void m2()
	{
		try {
		m3();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println("hi");
		finally {
			System.out.println("hi");
			}
	}
	public void m3() throws ArithmeticException
	{
		int i=9/3;
	}
	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println(7632*7281);
				
	}

}
