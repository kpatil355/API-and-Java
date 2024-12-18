package Day03;

public class ThirdClass {
	
	

	public static void main(String[] args)
	{
		
		//Number data type demo
		
		int a = 50;//declaration and assignment
		int b = 90;
		int c =60;
		System.out.println(a + b);		 //considering as int
		System.out.println("The sum is " +a+b+c); 	//considering as a string
		System.out.println("The sum is " +(a+b));	// seperated 
		
		//Byte data type
		
		byte by = 125;
		System.out.println(by);
		
		
		short sh = 30000;
		System.out.println(sh);
		
		
		long lo = 1234567890l; 		//l or L is literal which is optional 
		System.out.println(lo);
		
		//Decimal data types
		
//		float fl = 12345.5050;		
		float fl = 12345.5050f;	 	//f or F is mandatory for float data type
		System.out.println(fl);
		
		
		double db = 647638.987d;	//d or D is literal which is optional
		System.out.println(db);
		
		
		char ch = 'A';
		System.out.println(ch);
		
		String str = "komal";		// Non - primitive data type always start with capital letter
		System.out.println(str);
		
		//char ch = 'xyz'; 	//Invalid 
		//String str = 'pqr'; 	//Invalid
		
		//String pqr = "a"; 	//Valid
		
		
		boolean bl = true;			//
		System.out.println(bl);
		
//		String mno = "false";		valid
		
		
	}
}
