import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		
		int x =0;
		int y =0;
		System.out.println("Enter a move:");
		Scanner src = new Scanner(System.in);
		char move = src.next().charAt(0);
		switch(move) {
		
		case 'L':
			x--;
			break;
		case 'R':
		    x++;
		    break;
		case 'U' :
		    y++;
		    break;
		case 'D' :
			y--;
			break;
			
		default: 
			System.out.println("Invalid move");
		}
	}

}
