
public class ArrayClassExtended {
	
	public static void main (String [] args) {

		
		String [] [] textgrid = new String [3][2];
		
		textgrid [0][0] = "This is test";
		String [] text = {"this is ", "great"};
		textgrid [1] = text;
		
		for (int row = 0; row < textgrid.length; row ++) {
			
			for (int column = 0; column < textgrid[row].length; column ++) {
				
				System.out.print(textgrid[row][column] + "\t");
			}
			
			System.out.println();
		}
				
	}

}
