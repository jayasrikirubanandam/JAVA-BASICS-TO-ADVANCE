package GuessTheGame;

import java.util.Scanner;

class Guesser{
	 int guessedNo;
	 
	 int guessTheNumber() {
		
		
		 System.out.println("Guess a Number between 0-9");
		 Scanner scanner = new Scanner(System.in);
		 guessedNo = scanner.nextInt();
		 
		 return guessedNo;
	}
}

class Players{
	
     int guessedNo;
	 int guessTheNumber() {
		
		 System.out.println("Guess a Number between 0-9");
		 Scanner scanner = new Scanner(System.in);
		 guessedNo = scanner.nextInt();
		 
		 return guessedNo;
	}
}

class Umpire{
	
	int guessByGuesser;
	int guessByPlayer1;
	int guessByPlayer2;
	int guessByPlayer3;
	
	public int getFromGuesser(){
		
		Guesser guesser = new Guesser();
		guessByGuesser = guesser.guessTheNumber();
		return guessByGuesser; 
	}
	public int getFromPlayer1(){
		
		Players player1 = new Players();
		guessByPlayer1 = player1.guessTheNumber();
		return guessByPlayer1; 
	}
	
	public int getFromPlayer2(){
		
		Players player1 = new Players();
		guessByPlayer2 = player1.guessTheNumber();
		return guessByPlayer2; 
	}
	public int getFromPlayer3(){
		
		Players player1 = new Players();
		guessByPlayer3 = player1.guessTheNumber();
		return guessByPlayer3; 
	}
	
	void Compare() {
		if(guessByGuesser == guessByPlayer1) {
			System.out.println("Player1 is a winner");
		}else if(guessByGuesser == guessByPlayer2) {
			System.out.println("Player2 is a winner");
		}else if( guessByGuesser == guessByPlayer2) {
			System.out.println("Player3 is a winner");
		}
	}
}
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
