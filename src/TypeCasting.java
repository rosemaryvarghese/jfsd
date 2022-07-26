public class TypeCasting {

	public static void main(String[] args) {
		//explicit conversion
		System.out.println("EXPLICIT TYPE CASTING");
		

		double a=39.9;
		int b=(int)a;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		//implicit conversion
		System.out.println("---------------------------------");
		System.out.println("IMPLICIT TYPE CASTING");
		char c='C';
		System.out.println("Value of c: "+c);
		
		int d=c;
		System.out.println("Value of d: "+d);
		
		double e=c;
		System.out.println("Value of e: "+e);
		
		float f=c;
		System.out.println("Value of f: "+f);
		
		long g=c;
		System.out.println("Value of g: "+g);
				
		System.out.println("\n");
		
		
	
		
		
	}
}
