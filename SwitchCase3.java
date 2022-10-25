package Demo;
import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
	
	  Scanner src = new Scanner(System.in);
	  System.out.println("Enter an operator: ");
	  char assignment = src.next().charAt(0);
	  switch(assignment) {
	  case '+': System.out.println("Addition");
	         break;
	  case '-': System.out.println("Subtraction");
      break;
	  case '/': System.out.println("Division");
      break;
	  case '*': System.out.println("Multiplication");
      break;
      default : 
    	  System.out.println("Invalid operator");
      
	  }

	}

}
