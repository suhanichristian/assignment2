//Write a Java program to print numbers between 1 to 100 which are divisible by 3,5 
//and by both. 

package assignment;

public class divisibleby {
		public static void main(String[] args) {
			System.out.println("Numbers divisible bt 3: ");
			for (int i =1; i<= 100; i++) {
				if(i % 3 == 0) {
					System.out.println(i +"");
				}
			}
			
			System.out.println("Numbers divisible by 5: ");
			for(int i =1; i<= 100; i++) {
				if(i % 5 == 0) {
					System.out.println(i +"");
				}
			}
			
			System.out.println("Numbers divisible by both 3 & 5");
			for(int i = 1; i<= 100; i++) {
				if(i % 3 ==0 && i % 5 == 0) {
					System.out.println(i +"");
				}
			}
		}
}
