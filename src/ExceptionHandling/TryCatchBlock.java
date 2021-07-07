package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("A");
		System.out.println("A");
		try {
		int i = 9/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
			e.printStackTrace();
			
		}
		System.out.println("B");

	}

}
