package common;

import java.util.List;
import java.util.Collections;


public class Deck {

	//create a "deck of cards"
	private List<Card> deck;
	private int size;
	final int MAX_SIZE = 52;
	
	//constructor for creating a deck
	public Deck(List<Card> d)
	{
		deck = d;
		size = d.size();
	}
	
	
	//get commands for a deck
	List<Card> getDeck()
	{
		return deck;
	}
	
	int getSize()
	{
		return size;
	}
	
	//Draw command for a deck
	public Card drawCard()
	{
		
		//if the size is 0 break
		if(size ==0)
		{
			System.out.println("The Card Deck is Empty");
			return null;
		}
		//Player receives the 'top' card of the deque
		size--;
		
		//return the "top card" and remove it from the deck
		
	
		return deck.remove(size);
		
	}
	
	//shuffle command for the deck
	public void shuffle() {
			Collections.shuffle(deck);
	}
	
	//add a card command
	public void insertCard(Card c)
	{
		//flip c to be face down
		c.setFace();
		
		//increment size;
		size ++;
		
		deck.add(c);
		
		//increment 
		//System.out.println("Card: " + c.getSuit() +c.getNumber() + "has been added to the deck.");
	}
}
