package JavaSessions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("naveen");
		studentList.add("poonam");
		studentList.add("tom");
		studentList.add("Lisa");
		studentList.add("naveen");
		
		studentList.stream().forEach(e -> System.out.println(e));
		System.out.println("--------------------------------");
		studentList.stream().filter(e -> e.equals("naveen")).forEach(e -> System.out.println(e));
		System.out.println("--------------------------------");
		studentList.stream().sorted().forEach(e -> System.out.println(e));
		System.out.println("--------------------------------");
		studentList.parallelStream().forEach(e->System.out.println(e));
		System.out.println("---------------------------------");
		studentList.stream().distinct().forEach(e->System.out.println(e));
		
		//System.out.println(s);
		
        IntStream.range(1, 5).forEach(e -> System.out.println(e));
		
		IntStream.iterate(0, i -> i+2).limit(10).forEach(e -> System.out.println(e));
		
	}

}
