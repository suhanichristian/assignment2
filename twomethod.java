//Create a class to print an integer and a character with two methods having the same 
//name but different sequence of the integer and the character parameters.


package assignment;

public class twomethod {
	public void same(int s, char r) {
		System.out.println("Integer : " +s);
		System.out.println("Character : " +r);
	}
	
	public void same(char o, int p) {
		System.out.println("Integer : " +p);
		System.out.println("Character : "+o);
	}
	
	public static void main(String[] args) {
		twomethod different = new twomethod();
		
		different.same(21, 'R');
		different.same('S', 2);	
		
	}
}

