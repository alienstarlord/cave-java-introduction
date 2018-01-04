import java.util.Scanner;

public class UserInputClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("please enter some line: ");
		String myString = "first string";
		System.out.println("current value of myString is: " + myString);

		myString = input.nextLine();
		System.out.println("the input you entered is: " + myString);
			
 if (input.hasNextInt()) {
System.out.println("The value you entered is an integer and it is " +input.nextInt());	 
 } else {
	 System.out.println(" user input is not an integer and that is " + input.nextLine());
 }
		
		

		/**
		 * what is the difference between writing System.out.println ("please enter some
		 * line"); before Scanner input = new Scanner(System.in); or after? I tried both
		 * ways and i don't see a difference, why? what is resource leak, and why
		 * eclipse is complaining about input is never closed.
		 */

	}

}
