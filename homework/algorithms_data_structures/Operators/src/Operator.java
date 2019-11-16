
public class Operator {

	public static void main(String[] args) {
		int integerOne;
		int integerTwo;
		int equals;

		try {
			integerOne = Integer.parseInt(args[1]);
			integerTwo = Integer.parseInt(args[2]);

			if (args[0].contentEquals("minus")) {
				equals = integerOne - integerTwo;
				System.out.println(equals);
			}

			else if (args[0].contentEquals("plus")) {
				
				equals = integerOne + integerTwo;
				System.out.println(equals);

			}

			else {
				System.out.print("Insert plus or minus \n");
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}
