import java.util.Scanner;
public class Ifelse3 {

	public static void main(String[] args) {
 
		//to enter a number
	 //
		
		Scanner src = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = src.nextInt();
if(n>0) {
			System.out.print("Positive" + ",");
			if(n%2==0) 
				System.out.print("It is Even\n");
				else System.out.print("It is Odd\n");
		}
		
  else if(n<0) {
			System.out.print("Negative" + ",");
			if(n%2==0) 
				System.out.print("It is Even\n");
				else System.out.print("It is Odd\n");
			  }
   else {
			System.out.println("It is zero");
		}
	  }
	}

