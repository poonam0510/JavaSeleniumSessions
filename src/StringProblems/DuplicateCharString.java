package StringProblems;

import java.util.*;

public class DuplicateCharString {
	
	public static void displayDuplicateChar(String s) {
		
		char[] characters = s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++) {
				if(characters[i]==characters[j])
			    {
					System.out.println(characters[i]);
					
				}
			}
		}
	}
	
	public static void displayDuplicateChar1(String s)
	{
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		s = s.replaceAll("\\s+", "");
		char[] characters = s.toCharArray();
		for(char c : characters)
		{
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		
		
		Set<Map.Entry<Character,Integer>> entrySet = hm.entrySet();
		System.out.println("List of duplicate characters in string :  ");
		for(Map.Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + ":"+entry.getValue());
			}
		}
	}

}
