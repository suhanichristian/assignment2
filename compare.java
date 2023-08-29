//W.A.J.P to compare a given string to the specified character sequence. Comparing 
//topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false 

package assignment;

public class compare {
	public static void main(String[] args) {
		String specified = "topsint.com";
		
		String first = "topsint.com";
		boolean result = first.equals(specified);
		
		String second = "Topsint.com";
		boolean result2 = second.equals(specified);
		
		System.out.println("result of comparision of " + first +" and " + specified+ "is:- " + result);
		System.out.println("result of comparision of " + second +" and " + specified+ "is:- " + result2);
	
	
	}

}
