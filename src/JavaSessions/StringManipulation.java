package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "poonam agrawal";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf('n'));
		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		System.out.println(str.indexOf("naveen"));
		String message = "Product macbook ahs been added to the cart";
		if(message.indexOf("macbook")!= -1)
		{
			System.out.println(true);
		}
		
		else
		{
			System.out.println(false);
		}
		
		
		//trim
		
		String s1 = "    hello world    ";
		System.out.println(s1.trim().replace(" ",""));
		
		//replace
		String dob = "05-10-1979";
		System.out.println(dob.replace("-","/"));
		
		
		//split
		
		String s2 = "java_python_ruby_javascript";
		String s2Array[] = s2.split("_");
		for(String e : s2Array)
		{
			System.out.println(e);
		}
		
		String s3 = "XxjavaXXxXxRubyxXxPython";
		//String s3Array[] = s2.split("xX");
		for(String e: s3.split("xX"))
		{
			System.out.println(e);
		}
		
		System.out.println("poonam \"Vihaan\"agrawal");
			
		
	}
	

}
