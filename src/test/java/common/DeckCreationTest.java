package common;

import junit.framework.TestCase;
import java.util.List;
import java.util.ArrayList;

public class DeckCreationTest extends TestCase {

	//function for checking the contents of the deque
	public void testExistance(Deck deck)
	{
		//for each member of the card deque print it
		
		
		for(int i = 0; i < deck.getSize();i++)
		{
			Card c =deck.drawCard() ;
			//print the cards
			System.out.println(+c.getSuit() + c.getNumber() + "/n");
		}
	}
		
	//function for checking if the deck is full
	public isFull(Deck deck)
	{
		if(deck.getSize() != deck.MAX_SIZE)
		{
			System.out.println("Deck not full");
			
				
		}
		else
		{
			System.out.println("The deck is full");
			
		}
	}
	
	//testing for a shuffle
	public void testShuffled(Deck deck)
	{
		testExistance(deck);
	}
	
	
	//test add function
	public void testInsert(Deck deck)
	{
		//create a test card
		Card hk = new Card('H','K',13);
		
		deck.insertCard(hk);
	}
	
	//test remove function
	public void testDraw(Deck deck)
	{
		//create a test card
	
		
		deck.drawCard();
	}
	
	public void testTest() {
	List<Card> a = new ArrayList<>();
	Deck d = new Deck(a);
	
	
	testInsert(d);
	testShuffled(d);
	}
	
}
