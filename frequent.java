//W.A.J.P to find the second most frequent character in a given string. The given string 
//is: successes The second most frequent char in the string is: c


package assignment;

public class frequent {
	public static void main(String[] args) {
        String inputString = "successes";
        char secondMostFrequentChar = findSecondMostFrequentChar(inputString);
        
        if (secondMostFrequentChar != '0') {
            System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
        } else {
            System.out.println("No second most frequent character found in the string.");
        }
    }

	private static char findSecondMostFrequentChar(String inputString) {
		
		
		return 0;
	}

}
