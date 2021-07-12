package methodExample;

public class VariablesExamples {
	//Instance Variables, class variables, global variables
	//int m;
	//int n;
	
	boolean bl;
	int i;
	byte b;
	short s;
	long l;
	char c;
	float f;
	double d;
	String str;
	
	public void sum() {
		//Local Variables, method variables
		int x = 10;
		int y = 10;
		
		System.out.println(x+y);
		
	}

	public void multiply () {
	}
	
	
	public static void main(String[] args) {
		VariablesExamples ve = new VariablesExamples();
		System.out.println(ve.bl);//boolean
		System.out.println(ve.i);//int
		System.out.println(ve.s);//short
		System.out.println(ve.c);//char
		System.out.println(ve.d);//double
		System.out.println(ve.f);//float
		System.out.println(ve.b);//byte
		System.out.println(ve.l);//long
		System.out.println(ve.str);//String
		
	}
}
