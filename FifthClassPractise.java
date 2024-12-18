package Day05;

public class FifthClassPractise {	
	/**
	* Why char is directly not covert into string because char is premitive data type and string is belongs to other data type so we cannt convert char to string directly.
	*//**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 
			char str = 'K'; 				 //char should be in single quote
			String stb = "Patil";
			System.out.println(stb);
			System.out.println(str);
			int abcd =600;
			stb = Character.toString(str);     		//Type casting using character.tostring method
			System.out.println ("Type casting By using character.tostring function " + stb);

			//stb = String(str);
			stb = "Kanishka";
			System.out.println(stb);
			stb = String.valueOf(str);		//
			System.out.println ("Type casting By using String.valueof function " +stb);
			stb = "Komal";
			System.out.println(stb);


		}
		
}
