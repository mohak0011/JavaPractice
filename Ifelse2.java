import java.util.Scanner;


public class Ifelse2 {

	public static void main(String[] args) {
		
//Program for if number is -ve print it
//is invalid or +ve  print sum of first n  natural no's
		
		Scanner src = new Scanner(System.in);
        System.out.println("Enter a No: ");		
		int n = src.nextInt();
		if(n < 0) {
			System.out.println("Number is invalid");
		}
		else {
		System.out.println(n*(n+1)/2);
		}
	}

}
