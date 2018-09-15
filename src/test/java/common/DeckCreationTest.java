package common;

import junit.framework.TestCase;
import java.util.List;

public class DeckCreationTest extends TestCase {

	//function for checking the contents of the deque
	public void testExistance(Deck deck)
	{
		//for each member of the card deque print it
		
		
		for(Card card: deck)
		{
			//print the cards
			System.out.println(card.toString() + "/n");
		}
	}
		
	//function for checking if the deck is full
	public void isFull(Deck deck)
	{
		if(deck.size() != 52)
		{
			System.out.println("Deck not full");
				
		}
		else
		{
			System.out.println("The deck is full");
		}
	}
	
	//testing for a shuffle
	public void isShuffled(Deck deck)
	{
		testExistance(deck);
	}
	
	
	//test add function
	public void testInsert(Deck deck)
	{
		//create a test card
		Card hk = new card(H,13,K);
		
		insertCard(hk,deck);
	}
	
	//test remove function
	public void testDraw(Deck deck)
	{
		//create a test card
	
		
		drawCard();
	}
	
}
