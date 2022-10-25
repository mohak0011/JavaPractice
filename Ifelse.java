package Demo;
import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
	
  // Taking i/p from user and deciding number is odd or even
		
		
	 Scanner src = new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int n = src.nextInt();
		if(n%2==0) {
			System.out.println("It is even");
		}
		else {
			System.out.println("It is odd");
		}
	}

}
