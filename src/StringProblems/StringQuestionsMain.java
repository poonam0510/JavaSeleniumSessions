package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class StringQuestionsMain {

	static int num=10;
	int num1= 20;
	public static void main(String[] args) {
		String dupString = "VIHAAN NEERAJ AGRAWAL";
		
		//DuplicateCharString.displayDuplicateChar(dupString);
		
		maxOccuringCharacter1(dupString);
	}
	public void display()
	{
		
	}
	
	public static void maxOccuringCharacter(String s)
	{
		char[] charArray = s.toCharArray();
		int len=0;
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(!hm.containsKey(charArray[i]))
			{
				hm.put(charArray[i], 1);
			}
			else
			{
				int value = hm.get(charArray[i])+1;
				hm.put(charArray[i],value);
			   if(len<value)
			   {
				   len = value;
			   }
				
			}
		}
		System.out.println(len);
		for(Map.Entry<Character,Integer> entry : hm.entrySet())
		{
			if(entry.getValue() == len)
			{
				System.out.println(entry.getKey() +" "+entry.getValue());
			}
		}
		//hm.forEach((key,value)-> System.out.println("[key] "+key + " [value] "+value));
	}
	
	public static void maxOccuringCharacter1(String s)
	{
		
		int[] asciiArray = new int[123];
		int maxLen =1;
		char c='\0';
		int value = 0;
		for(int i=0;i<s.length();i++)
		{
			value = asciiArray[s.charAt(i)];
			value = value+1;
			asciiArray[s.charAt(i)]=value;
			if(maxLen<value)
			{
				maxLen=value;
				c = s.charAt(i);
			}
		}
			System.out.println(c +" "+maxLen);
	}

}
