package loopExamples;

public class BreakExample {

	// write a code from 1 to 10 but don't go further when number is 5
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i== 5) {
				break;
			}
			System.out.println(i);
		}
		

	}

}
