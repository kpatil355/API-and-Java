package Day06;

import java.util.Scanner;

public class SixthClassparttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example of Ladder if //
		
		//NOTE -LADDER if is different from the Nested if.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
int num = sc.nextInt();

if(num>0)
{
	System.out.println(num+ " is positive");
}
 else if(num ==0)
{
	System.out.println(num+ " num is zero");
}
else
{
	System.out.println(num+ " is negative");
}

}
}
