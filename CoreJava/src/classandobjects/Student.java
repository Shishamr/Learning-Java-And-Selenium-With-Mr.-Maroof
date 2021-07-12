package classandobjects;

public class Student {
	
	int rollNum;
//	char c = 'A'; // Char we use for single character
	String name;
	
	Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
	}

	public static void main(String[] args) {	
		Student student = new Student(123, "John");
		Student stud = new Student(456, "Mike");
		
		System.out.println(student.rollNum);
		System.out.println(student.name);
		
		
		System.out.println(stud.rollNum);
		System.out.println(stud.name);
		
		
		

	}

}
