package practice;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		String[]rps = {"r","p","s"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		
		String playerMove = " ";
		while(true)
	 {
		System.out.print( "enter your move (r/p/s) : ");
	    playerMove = scanner.nextLine();
		if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
		break;
		}
		else {
			System.out.println( playerMove +" is invalid .");
		}
     }
		System.out.println("computer\'s choice : " + computerMove);
		if (playerMove.equals(computerMove)) {
			
		System.out.println("The game was a tie!");
		}
		else if (playerMove.equals("r")) {
			if (computerMove.equals("p")) {
				System.out.println( "YOU LOSE !");
			}
			else {
				System.out.println("YOU WIN !");
			}
		}
		else if (playerMove.equals("p")) {
			if (computerMove.equals("s")) {
				System.out.println( "YOU LOSE !");
			}
			else {
				System.out.println("YOU WIN !");
			}
		}
		else if (playerMove.equals("s")) {
			if (computerMove.equals("r")) {
				System.out.println( "YOU LOSE !");
			}
			else {
				System.out.println("YOU WIN !");
			}
		}
		System.out.println();
        System.out.print("play again ? (y/n) : ");
        String playAgain = scanner.nextLine();
        System.out.println();
        if(playAgain.equals("n")) {
        	break;
        }
		}

	}	
}