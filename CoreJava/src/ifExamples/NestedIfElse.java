package ifExamples;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 18;
		int weight = 52;

		if (age >= 18) {
//			System.out.println("User is eligible to donate blood");
			if (weight <= 50) {
				System.out.println("User is eligible to donate blood");
			} else {
				System.out.println("User is not eligible to donate blood");
			}

		} else {
			System.out.println("age must be greater than 18");
		}

	}

}
