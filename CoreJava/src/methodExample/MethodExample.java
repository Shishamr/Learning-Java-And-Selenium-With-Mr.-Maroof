package methodExample;

import java.util.Scanner;

public class MethodExample {

	public void findEvenOdd() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = scan.nextInt();
				
		if (num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	public static void main(String[] args) {
		MethodExample me = new MethodExample();
		me.findEvenOdd();
		

	}

}
