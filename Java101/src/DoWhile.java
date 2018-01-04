import java.util.Scanner;

public class DoWhile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/* this is another way of implementing do while without invoking do.
		Scanner input = new Scanner(System.in);
		System.out.println ("Please enter a line: ");
		String myString = input.nextLine();
		System.out.println("Line you are entered is: " + myString);
		System.out.println("please enter an integer: ");
		int myInt = input.nextInt();

		while (myInt != 5) {
			System.out.println("you entered integer value: " + myInt);
			System.out.println("Please enter an integer value: ");
			myInt = input.nextInt();
			System.out.println("The value you entered is: " + myInt);

		}
		System.out.println( "finally you entered: "+ myInt);
		*/
		
		//Scanner input = new Scanner(); Why can't write this way and call some method to get System.in? 
		//why i have to do this Scanner input = new Scanner(System.in); ? by doing this input object only can take System input right?
		// variable scope explains where a variable is defined and where you can use the variable. 
		Scanner input = new Scanner(System.in);
		int myInt;
					
		do {
			System.out.println("Please enter an integer: ");
			myInt = input.nextInt();
			System.out.println("your integer value is: " + myInt);
			
		}while (myInt !=5);
		
		System.out.println("you entered correct value");		
		
	}
}
