/**
 * 
 */
package Day05;

/**
 * 
 */
public class FifthClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int s = 80;
		int r = --s; 			//Pre decrement 
		System.out.println(r);
		
		
		int y =90;
		int o = y--;			//Post decrement
		System.out.println(o);
		System.out.println(y);
	
	
	int x =50;
	x +=10;				//x = x +10;
	System.out.println(x);	//60
	
	
	x -=5;				//x = x -5;
	System.out.println(x);		//55
	
	x *=4;					//x=x*4
	System.out.println(x);	//220
	
	
	x/=2; 					//x =x /2	
	System.out.println(x);		//110
	
	
	x %= 6 ;					//x =x%6;			
	System.out.println(x);  	  //2
	
	//Conditional Or Ternary Operator(?:)
	
	//var = expression ? result 1: result 2
	
	int p =90;
	int q =120;
	int k = p>q?p:q;
	System.out.println(k);		
	
	String l = 10>20?  "true"  : "false";
	System.out.println(l);
	
	}
}
