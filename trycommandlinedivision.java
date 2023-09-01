//W.A.J. P to demonstrate try catch block, take two numbers from the user by 
//Command line argument and perform the division operation and handle Arithmetic


package assignment;

public class trycommandlinedivision {
	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java DivisionDemo <numerator> <denominator>");
            return;
        }
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Division by zero is not allowed.");
            }
        catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Please enter valid integers as arguments.");
            }
		}
	}
