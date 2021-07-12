package methodExample;

public class Sum {
	
	/*
	 * public void addition(int x, int y) { //we can add, sub, divide by adding one
	 * more int but for easy solution see below
	 * 
	 * System.out.println(x+y); }
	 */
	
	public int addtion(int x, int y) {
		
		int z = x + y ;
		return z;
	}
	
	public static void main(String[] args) {
		
		Sum s = new Sum();
//		s.addition(10, 15);
//		s.addition(10, 5);
//		s.addition(10, 35);
//		s.addition(10, 10);
//		s.addition(10, 65);
//		s.addition(10, 85);
		
		System.out.println(s.addtion(10, 5)*10);
		System.out.println(s.addtion(20, 30)*5);
		System.out.println(s.addtion(5, 5)/5);

		 
	}

}
