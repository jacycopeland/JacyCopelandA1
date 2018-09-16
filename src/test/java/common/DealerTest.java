package common;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class DealerTest extends TestCase {
	
	
	
	public void testBust(){
	//test the initial hand of the dealer
	//fails if both cards are or are not visible
	Dealer d = new Dealer();
	List<Card> l = new ArrayList<>();
	Deck c = new Deck(l);
	c.insertCard(new Card('H',"2",2));
	c.insertCard(new Card('D',"10",10));
	c.insertCard(new Card('S',"2",2));
	c.insertCard(new Card('D',"8",7));
	
	
	System.out.println("The Dealer is drawing Cards: ");
	public void d.initalDraw(Deck c);
	
	System.out.println("Checking dealers current score: ");
	//fuction to check if the dealer has a blackjack
	d.checkScore();
	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore();
	System.out.println("Revealing Secret Card");
	//check that the card is revealed at game end
	d.reveal();
	System.out.println("Blackjack or bust?");
	//check for a blackjack or bust
	d.winOrBust();
	}
	
	
	public void testBlackjack(){
	//test the initial hand of the dealer
	//fails if both cards are or are not visible
	Dealer d = new Dealer();
	List<Card> l = new ArrayList<>();
	Deck c = new Deck(l);
	c.insertCard(new Card('H',"2",2));
	c.insertCard(new Card('D',"10",10));
	c.insertCard(new Card('S',"9",9));

	
	System.out.println("The Dealer is drawing Cards: ");
	public void d.initalDraw(Deck c);
	
	System.out.println("Checking dealers current score: ");
	//fuction to check if the dealer has a blackjack
	d.checkScore();
	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore();
	System.out.println("Revealing Secret Card");
	//check that the card is revealed at game end
	d.reveal();
	System.out.println("Blackjack or bust?");
	//check for a blackjack or bust
	d.winOrBust();
	}
	
	
	public void testSoft17(){
	//test the initial hand of the dealer
	//fails if both cards are or are not visible
	Dealer d = new Dealer();
	List<Card> l = new ArrayList<>();
	Deck c = new Deck(l);
	c.insertCard(new Card('H',"A",1));
	c.insertCard(new Card('S',"6",6));
	c.insertCard(new Card('D',"8",7));
	
	
	System.out.println("The Dealer is drawing Cards: ");
	public void d.initalDraw(Deck c);
	
	System.out.println("Checking dealers current score: ");
	//fuction to check if the dealer has a blackjack
	d.checkScore();
	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore();
	System.out.println("Revealing Secret Card");
	//check that the card is revealed at game end
	d.reveal();
	System.out.println("Blackjack or bust?");
	//check for a blackjack or bust
	d.winOrBust();
	}
	
	

}
