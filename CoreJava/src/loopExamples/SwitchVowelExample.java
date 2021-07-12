package loopExamples;

public class SwitchVowelExample {

	public static void main(String[] args) {
		char ch = 'a';
		
		int i = 10;
		
		switch(ch) {
		
		case 'A': System.out.println("vowel");
		case 'a': System.out.println("vowel");
		break;
		case 'E': System.out.println("vowel");
				  if(i>5) {
					  System.out.println("value of i: " + 1);
				  }else {
					  System.out.println("i is not greater than 5");
				  }
		break;
		case'i': System.out.println("vowel");
		break;
		case 'O': System.out.println("vowel");
		break;
		case 'U': System.out.println("vowel");
		default: System.out.println(" consonant");
		}

	}

}
