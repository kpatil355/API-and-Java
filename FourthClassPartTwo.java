/**
 * 
 */
package Day04;

/**
 * 
 */
public class FourthClassPartTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Increment(++)
		int a = 50;
		System.out.println(a);		
		a++;
		System.out.println(a);		
//		int b = 30;
//		int t = b++;   			//Post increment operator- first is assignment than addition will be performed
//		System.out.println(t);
//		System.out.println(b);
				
		int b = 60;
		int t = ++b;			//Pre increment operator - First it will add and then it will assignment
		System.out.println(t);
		System.out.println(b);
		
		int s = 80;
		int r = --s;
		System.out.println(r);
						
	}
}
