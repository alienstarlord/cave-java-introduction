
public class StringFunctionalClass {

	public static void main(String[] args) {
		
		StaticBaseClass objectA = new StaticBaseClass();
		String info = objectA.knowName(objectA.getValue());
		System.out.println(info + " and value is " + objectA.getValue());
		
		System.out.println("The name is "+ objectA.getName() + " the value is " + objectA.getValue() + " and count is " + StaticBaseClass.count);
		System.out.println("The indian batting legend is " + StaticBaseClass.INDIAN_BATTING_LEGEND);
	}
}
