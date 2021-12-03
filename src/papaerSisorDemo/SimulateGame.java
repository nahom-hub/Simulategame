package papaerSisorDemo;

import java.util.Scanner;

public class SimulateGame {
	
	

	public static void main(String[] args) {
		SimulateGame sg = new SimulateGame();
		Scanner scan = new Scanner(System.in); 
		String responseOne = "rock";
		String responseTwo = "papar";
		String responseThree = "sissors";
		System.out.println("Welcome to rock, paper, scissors game");
		System.out.println("Both players have to say either \"rock\", \"paper\" or \"scissors\" at the same time.\r\n"
				+ "Rock beats scissors, paper beats rock, scissors beat paper.");
		System.out.println("Play the game");
		System.out.println("Player one: Enter your choice");
		String playerOneResponse = scan.nextLine();
		
		System.out.println("Player Two: Enter your choice");
		String playerTwoResponse = scan.nextLine();
		if(playerOneResponse.equalsIgnoreCase(responseOne) && playerTwoResponse.equalsIgnoreCase(responseTwo)) {
			System.out.println(sg.playerTwo());
		
		}
		
	
		else if(playerOneResponse.equalsIgnoreCase(responseTwo) && playerTwoResponse.equalsIgnoreCase(responseOne)) {
			
			System.out.println(sg.playerOne());
		} 
		
		
	
		else if(playerOneResponse.equalsIgnoreCase(responseTwo) && playerTwoResponse .equalsIgnoreCase(responseThree)) {
			System.out.println(sg.playerTwo());
		} 
		
		
		
		else if(playerOneResponse.equalsIgnoreCase(responseThree) && playerTwoResponse.equalsIgnoreCase(responseThree)) {
			System.out.println(sg.tieRespons());
		}
		
		
		else if(playerOneResponse==responseThree && playerTwoResponse ==responseTwo) {
			System.out.println(sg.playerOne());
		}
		
		
	}
	
	public String playerOne() {
		return "Player one win";
	}
	
	public String playerTwo() {
		return "Player two win";
	}
	
	public String tieRespons() {
		return "Tie";
	}
}
