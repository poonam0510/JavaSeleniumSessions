package JavaSessions;

public class FunctionsExamples {
	
	public double getBrowserVersion(String browser)
	{
		System.out.println("Browser name is "+browser);
		
		switch(browser)
		{
		case "Chrome":
			System.out.println("Launch Chrome Browser");
			return 8.9;
		case "IE":
			System.out.println("Launch IE Browser");
			return 8.9;
		case "Safari":
			System.out.println("Launch Safari Browser");
			return 8.9;
		case "firefox":
			System.out.println("launch ff");
			return 1.9;
			
			default :
				System.out.println("Pass the correct browser name:");
				return 0;
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brwName = "Chrome";
		FunctionsExamples obj = new FunctionsExamples();
		double version = obj.getBrowserVersion(brwName);
		System.out.println(brwName+" Version is:  "+version);
	}

}
