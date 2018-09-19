package common;

import junit.framework.TestCase;

public class GameTest extends TestCase {
	
	
	public void test1() {
	Game g = new Game();
	
	//test deck
	for(Card c: g.getDeck().getDeck())
	{
		System.out.println(c.getSuit() + c.getNumber()+ "\n");
	}
	
	//test shuffle
	g.getDeck().shuffle();
	
	for(Card e: g.getDeck().getDeck())
	{
		System.out.println(e.getSuit() + e.getNumber()+ "\n");
	}
	
	//test initial draws
	g.startGame();
	
	//test player turn
	g.playerTurn();
	
	g.dealerTurn();
	
	
	//test who wins
	g.testWin();}
}
