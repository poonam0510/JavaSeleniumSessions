package Assignments;

public class Factorial {
	
	public static int factorialNum(int num)
	{
	  if(num>0)
		{
			return num*factorialNum(num-1);
			//
		}
	  else
	  {
		return 1;
	  }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(factorialNum(10));
		

	}

}
