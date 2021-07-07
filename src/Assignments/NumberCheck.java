package Assignments;

public class NumberCheck {

	
	public String checkOddEven(int num)
	{
		if(num==0)
		{
			return null;
		}
		
		if(num %2 ==0) {
			return "even";
			
		}
		else
		{
			return "odd";
		}
	}
	
	public boolean checkPrimeNum(int num)
	{
		if(num <=1)
		return false;
						
		for(int i=2;i<=num/2;i++)
		{
			if(num %i==0)
			{
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=84 ;
		NumberCheck obj1 = new NumberCheck();
		boolean isPrime = obj1.checkPrimeNum(num);
        if(isPrime)
        {
        	System.out.println(num +"  is prime.");
        }
        else
        {
           System.out.println(num +"  is not prime.");
        }
        
        System.out.println(num + "  is: "+obj1.checkOddEven(num));
	}

}
