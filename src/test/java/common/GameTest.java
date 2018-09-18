package common;

import junit.framework.TestCase;

public class GameTest extends TestCase {
	
	
	public void test1() {
	Game g = new game();
	
	//test deck
	for(Card c: g.deck)
	{
		System.out.println(c.getSuit() + c.getNumber()+ "\n\n");
	}
	
	//test shuffle
	g.deck.shuffle();
	
	for(Card e: g.deck)
	{
		System.out.println(c.getSuit() + c.getNumber()+ "\n\n");
	}
	
	//test initial draws
	g.startGame();
	
	//test player turn
	g.playerTurn();
	
	g.dealerTurn();
	
	
	//test who wins
	g. testWin();}
}
