package ifExamples;

public class IfElseExample {

	public static void main(String[] args) {

		int number = 17;

//		whether this number is even or odd
//		even number --> completely divisible 2 --> remainder is zero
//		odd number -->	not completely divisible by 2 --> remainder is not zero

		if (number % 2 == 0) {
			System.out.println("This number is even number");
		} else {
			System.out.println("This number is odd number");
		}

	} 

}
