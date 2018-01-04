public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myIntArray;
		//now myIntArray is just a name for collection of values, but its not a value
		myIntArray = new int[5];
		// now myIntArray has allocated memory and can hold 5 integer
		System.out.println("The initial value of myIntArray 5th location is " + myIntArray[4]);
		// java assigns the initial value of an integer array as 0

		for (int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i * 10;
			System.out.println("The " + i + "th position of myIntArray is " + myIntArray[i]);
		}

		int[] anotherIntArray = { 1, 2, 3, 4 };
		// Java lets you create unbound arrays, as you can define the size with list of input values, need to know which method is recommended

		for (int i = 0; i < anotherIntArray.length; i++) {

			System.out.println(" anotherIntArray value " + anotherIntArray[i]);
		}
		
		String [] texts = {"hello", "value"};
		
		System.out.println( texts [1]);

	}

}
