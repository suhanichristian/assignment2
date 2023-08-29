//Create a class named 'Print Number' to print various numbers of different data types 
//by creating different methods with the same name 'printn' having a parameter for 
//each data type. 


package assignment;

public class parameter {
	
	public void printn (int num) {
		System.out.println("Printing integer : " +num);
	}
	
	public void printn(float num) {
		System.out.println("Printing float : " +num);
	}
	
	public void printn(double num) {
		System.out.println("Printing double : " +num);
	}
	
	public void printn(long num) {
		System.out.println("Printing long : " +num);
	}
	
	public void printn(String str) {
		System.out.println("Printing string : " +str);
		
	}
	
	public static void main(String[] args) {
		
		parameter printer = new parameter();
		
		printer.printn(98);
		printer.printn(5.8f);
		printer.printn(85.8);
		printer.printn(789456123L);
		printer.printn("src");
	}
}
