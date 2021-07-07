package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//Virtual capacity of ArrayList is 10
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(al.size());
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		al.add(900);
		al.add(1000);
		al.add(1100);
		al.add(1200);
		al.add(1300);
		al.add(1400);
		al.add(1500);
		al.add(1600);
		
		
		
		
		System.out.println("---------ArrayList before reversing-----");
		for(int i : al)
		{
			System.out.println(i);
			
		}

		System.out.println("-----After reversing ------");
		
		reverseArrayList(al);

	}
	
	public static void reverseArrayList(ArrayList<Integer> ar)
	{
		
		if(ar.size()==0)
		{
			return;
		}
		System.out.println(ar.size());
		
		int temp;
		int end = ar.size()-1;
		int start = 0;
		while(start<end) {
			temp = ar.get(start);
			ar.set(start, ar.get(end));
			ar.set(end, temp);
			start++;
			end--;
		}
		for(int a : ar)
		{
			System.out.println(a);
		}
		
	}

}
