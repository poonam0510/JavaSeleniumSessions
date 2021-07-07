package JavaSessions;

public class DataTypesConcepts {

	static public void main(String[] args) {
		// TODO Auto-generated method stub

		
		//byte = 1 byte 
		// -128 to 127
		byte b = 127;
		byte b1 = 127;
		System.out.println(b);
		System.out.println(b1+b);
		
		//short = 2 bytes = 16 bits
		// -32768 to 32767 
   		short s = 1000;
   		short s1 = 40;
   		
   		
   		//int = 4 bytes = 32 bits
   		// -2147483648  to 2147483647 
   		int i = 34;
   		System.out.println(Integer.MAX_VALUE);
   		System.out.println(Integer.MIN_VALUE);
   		
   		//long = 8 bytes = 64 bits
   		// -9223372036854775808  to 9223372036854775807
   		long l = 3456;
   		System.out.println(Long.MAX_VALUE);
   		System.out.println(Long.MIN_VALUE);
   		
   		float f = 1.233f;
   		double d = 3.145;
   		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(4.0/2.0);
		
		int a=100;
		int c=200;
		String x ="hello";
		String y = "selenium";
		System.out.println(a+c+x+y);
		System.out.println(x+y+a+b);
		
		char e = 'c';
		char g = 'd';
		System.out.println(e);
		System.out.println(e+g); //ascii value will get added 
		
		int h = 1;
		int m = h++;
		System.out.println(h);
		System.out.println(m);
		
		int n = ++h;
		System.out.println(h);;
		System.out.println(n);
		
	}

}
