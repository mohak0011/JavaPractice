package Demo;

public class Wrapper {

	public static void main(String[] args) {
		
		int x1 =10;
		Integer x2 =x1; //Autoboxing 
		int x3 = x2;    // Auto-unboxing
		
		
		if(x3==x2) {
			System.out.println("same");
			System.out.println(x1);
			System.out.println(x2);
		}
		
		else {
			System.out.println("Not same");
		}

	}

}
