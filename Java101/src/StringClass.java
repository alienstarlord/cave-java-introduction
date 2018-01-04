
public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 3;
		String myString = "This is my first String data This";
		String replace = "This";
		String replaced = "Okay";
		double myDouble = 7.1;
				
		System.out.println(myString);
		System.out.println("adding integer and double then the value is: " + myInt + myDouble);
		char myChar = myString.charAt(1);
		System.out.println(myChar);
		String ExperimentString1 = myString.concat(" experiment");
		System.out.println(ExperimentString1);
		String ExperimentString2 = myString.intern();
		System.out.println(ExperimentString2);
		String ExperimentString3 = myString.replace('s','c');
		System.out.println(ExperimentString3);
		String ExperimentString4 = myString.replaceAll(replace, replaced);
		System.out.println(ExperimentString4);
		String ExperimentString5 = myString.toLowerCase();
		System.out.println(ExperimentString5);
	
	}

}
