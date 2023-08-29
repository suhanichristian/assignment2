//W.A.J.P to find all interleaving of given strings.


package assignment;

public class interleaving {
	public static void main(String[] args) {
		
//An interleaving of two strings s and t is a configuration where s and t are divided into n and m. substrings. 
	 String str1 = "AB";
     String str2 = "CD";

     System.out.println("Interleavings of " + str1 + " and " + str2 + ":");
     findInterleavings("",str1, str2);
 }

 public static void findInterleavings(String prefix, String str1, String str2) {
     if (str1.isEmpty() && str2.isEmpty()) {
         System.out.println(prefix);
         return;
     }
     if (!str1.isEmpty()) {
         findInterleavings(prefix + str1.charAt(0), str1.substring(1), str2);
     }
     if (!str2.isEmpty()) {
         findInterleavings(prefix + str2.charAt(0), str1, str2.substring(1));
     }
  }
}
