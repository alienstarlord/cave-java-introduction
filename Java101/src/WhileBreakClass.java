public class WhileBreakClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myInt = 1;
		while (true) {
			System.out.println("myInt value is " + myInt);
			myInt = myInt + 1;
			if (myInt == 3) {
				break;
			} else {
				System.out.println("The loop didn't break cause myInt value is " + myInt);
			}
		}
		
		System.out.println ("Final value of myInt is " + myInt);

	}
	/**
	 * how many loops a break condition breaks, does it break a loop in loop?
	 */

}
