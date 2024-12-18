package Day05;

public class FifthClassPartTwo {

	
	public static void main(String[] args) {
		
		//Widening Type casting
		
		int a =5000;
		long b = a;
		float c =b;
		System.out.println("A is "+a+" b is "+b+", c is "+c);
		System.out.println();
	
		//Narrowing type casting
		float x = 500f;
		long y = (long)x;
		byte z = (byte)x;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
	}
	
}
