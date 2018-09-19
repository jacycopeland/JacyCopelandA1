package common;
import java.util.ArrayList;
import java.util.List;


public class Game {

	//game elements 
	private Deck deck;
	private Player player;
	private Dealer dealer;
	private List<Card> d;
	
	//Game constructor
	public Game()
	{
		deck = new Deck(d = new ArrayList<>());
		deck.insertCard(new Card('H',"A",11));
		deck.insertCard(new Card('C',"A",11));
		deck.insertCard(new Card('S',"A",11));
		deck.insertCard(new Card('D',"A",11));
		deck.insertCard(new Card('H',"2",2));
		deck.insertCard(new Card('C',"2",2));
		deck.insertCard(new Card('S',"2",2));
		deck.insertCard(new Card('D',"2",2));
		deck.insertCard(new Card('H',"3",3));
		deck.insertCard(new Card('C',"3",3));
		deck.insertCard(new Card('S',"3",3));
		deck.insertCard(new Card('D',"3",3));
		deck.insertCard(new Card('H',"4",4));
		deck.insertCard(new Card('C',"4",4));
		deck.insertCard(new Card('S',"4",4));
		deck.insertCard(new Card('D',"4",4));
		deck.insertCard(new Card('H',"5",5));
		deck.insertCard(new Card('C',"5",5));
		deck.insertCard(new Card('S',"5",5));
		deck.insertCard(new Card('D',"5",5));
		deck.insertCard(new Card('H',"6",6));
		deck.insertCard(new Card('C',"6",6));
		deck.insertCard(new Card('S',"6",6));
		deck.insertCard(new Card('D',"6",6));
		deck.insertCard(new Card('H',"7",7));
		deck.insertCard(new Card('C',"7",7));
		deck.insertCard(new Card('S',"7",7));
		deck.insertCard(new Card('D',"7",7));
		deck.insertCard(new Card('H',"8",8));
		deck.insertCard(new Card('C',"8",8));
		deck.insertCard(new Card('S',"8",8));
		deck.insertCard(new Card('D',"8",8));
		deck.insertCard(new Card('H',"9",9));
		deck.insertCard(new Card('C',"9",9));
		deck.insertCard(new Card('S',"9",9));
		deck.insertCard(new Card('D',"9",9));
		deck.insertCard(new Card('H',"10",10));
		deck.insertCard(new Card('C',"10",10));
		deck.insertCard(new Card('S',"10",10));
		deck.insertCard(new Card('D',"10",10));
		deck.insertCard(new Card('H',"J",10));
		deck.insertCard(new Card('C',"J",10));
		deck.insertCard(new Card('S',"J",10));
		deck.insertCard(new Card('D',"J",10));
		deck.insertCard(new Card('H',"Q",10));
		deck.insertCard(new Card('C',"Q",10));
		deck.insertCard(new Card('S',"Q",10));
		deck.insertCard(new Card('D',"Q",10));
		deck.insertCard(new Card('H',"K",10));
		deck.insertCard(new Card('C',"K",10));
		deck.insertCard(new Card('S',"K",10));
		deck.insertCard(new Card('D',"K",10));
		
		player = new Player();
		dealer = new Dealer();
				
	}

	public Deck getDeck() {
		return deck;
	}
	
	public void startGame() {
		System.out.println("Welcome to Blackjack!\n\n");
	//	System.out.println("Here is the player's initial hand: \n");
		//player draws
		player.initalDraw(deck);
		
		System.out.println("\n");
		
		//dealer draws
		dealer.initalDraw(deck);
		
		System.out.println("\n");
		
		
	}
	
	
	//player's turn
	public void playerTurn()
	{
		//check to make sure dealer doesnt have a black jack
		if(dealer.getScore() < 22 && player.getScore() <21) {
			
	
		System.out.println("\n");
		System.out.println("It is the player's turn:\n\n");
		
		player.drawMore(deck);
		
		player.winOrBust();}
		
		//else specify that there is a back jack
		else {
			dealer.winOrBust();
			player.winOrBust();
		}
		
	}
	
	public void dealerTurn()
	{
		//if the player has a score over 21 skip turn
		if(player.getScore() < 22)
		{
			System.out.println("\n");
			System.out.println("It is the dealer's turn:\n\n");
			
			dealer.drawMore(deck);
			dealer.reveal();
			dealer.winOrBust();
		}
	}
	
	public void testWin()
	{
		
		//boolean to keep track of player win status
		boolean playerWin = false;
		
		if(dealer.getScore() > 21)
		{
			playerWin = true;
		}
		else if (player.getScore() > dealer.getScore())
		{
			playerWin = true;
		}
		
		if(playerWin == false) {
			System.out.println("The Dealer wins with a score of " + dealer.getScore());
		}
		else {
			System.out.println("The Player wins with a score of " + player.getScore());
		}
	}

}
