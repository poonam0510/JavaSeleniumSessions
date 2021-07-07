package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		pattarnNumbers(3,9);
		
	System.out.println("------for loop dsiplay 10-1 ------");	
       for(int i=10;i>=1;i--)
       {
    	   System.out.println(i);
       }
       
       
       System.out.println("------while loop dsiplay 10-1 ------");	
   	int j=10;
       while(j>=1)
       {
    	   System.out.println(j);
    	   j--;
       }
       
       System.out.println("------do while loop dsiplay 10-1 ------");	
      	int k=10;
          do {
        	  
        	  System.out.println(k);
        	  k--;
        	  
          }while(k>=1);
   	
  System.out.println("-----------display I am Batman 9 times");
          displayStringLoops("I am Batman",9);
          
              
	}
	
	
	
	public static void displayStringLoops(String s, int counter)
	{
		int temp =1;
		while (temp<=counter)
		{
			System.out.println(s +" "+ temp);
			temp++;
			
		}
		
		
	}
	
	public static void pattarnNumbers(int m , int n)
	{
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(i+""+j+" ");
			}
			
			System.out.println();
			
		}
	}

	
	
}
