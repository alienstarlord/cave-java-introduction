
public class StaticBaseClass {

	private int value;
	private String name;
	static int count = 0;
	static final String INDIAN_BATTING_LEGEND = "SACHIN";

	StaticBaseClass() {
		value = 1;
		name = "Cricketer";
		count++;
		System.out.println("The current value of count is " + count);
	}

	StaticBaseClass(String name, int value) {
		this.name = name;
		this.value = value;
		count++;
		System.out.println("The current value of count is " + count);

	}

	String knowName(int value) {
		if (value % 2 == 0) {
			return "EvenNumber";
		} else
			return "Odd Number";
	}

	String getName() {
		return name;
	}

	int getValue() {
		return value;
	}

	void setName(String name) {
		this.name = name;
	}

	void setValue(int value) {
		this.value = value;
	}

}
