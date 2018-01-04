import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int conditionalvalue = 0;

		do {
			System.out.println(" Please enter a command ");
			String myString = input.nextLine();
			String upperString = myString.toUpperCase();
			System.out.println("you have entered " + myString);

			switch (upperString) {
			case ("START"):
				System.out.println("The program is :" + myString + "ED");
				conditionalvalue = 1;
				break;
			case ("STOP"):
				System.out.println(" The program is: " + myString + "ED");
				conditionalvalue = 1;
				break;
			default:
				System.out.println(
						"Your input does not match any predefined keyword: The avilable commands are start and stop ");

			}

		} while (conditionalvalue == 0);

	}

}