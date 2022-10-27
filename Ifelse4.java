import java.util.Scanner;
public class Ifelse4 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the first number:");  
		int a = src.nextInt();
		System.out.println("Enter the second number:");  
		int b = src.nextInt();
		System.out.println("Enter the third number:");
		int c = src.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println(a);
		}else if(b>=a && b>=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		System.out.println("The largest number is: ");  

	}

}
