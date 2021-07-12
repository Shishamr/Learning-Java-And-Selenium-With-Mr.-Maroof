package ifExamples;

public class IfElseLeapYearExample {

	public static void main(String[] args) {

		int year = 2000;

//		if (year % 4 == 0 && year % 100 != 0) { // Use  &&  only when both the condition are true
		if ((year % 4 == 0 && year % 100 != 0) || (year %400 == 0)) { // Use  OR  when at-least one condition are true
			    
			System.out.println("Leap Year");
		} else {

			System.out.println("Its not a Leap Year");
		}

	}

}
 