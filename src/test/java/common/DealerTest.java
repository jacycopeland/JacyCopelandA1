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
	c.insertCard(new Card('D',"8",8));
	c.insertCard(new Card('C',"10",10));
	
	
	System.out.println("The Dealer is drawing Cards: ");
	d.initalDraw(c);
	
	System.out.println("Checking dealers current score: ");
	//fuction to check if the dealer has a blackjack
	
	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore(c);
	System.out.println("Revealing Secret Card");
	//check that the card is revealed at game end
	d.reveal();
	System.out.println("Blackjack or bust?");
	//check for a blackjack or bust
	d.winOrBust();
	}
	
	
	
	public void testblackjack(){
		//test the initial hand of the dealer
		//fails if both cards are or are not visible
		Dealer d = new Dealer();
		List<Card> l = new ArrayList<>();
		Deck f = new Deck(l);
		f.insertCard(new Card('S',"10",10));
		f.insertCard(new Card('S',"A",11));


		
		System.out.println("The Dealer is drawing Cards: ");
		d.initalDraw(f);
		
		System.out.println("Checking dealers current score: ");
		//function to check if the dealer has a blackjack

		System.out.println("The Dealer is drawing Cards: ");
		//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
		d.drawMore(f);
		System.out.println("Revealing Secret Card");
		//check that the card is revealed at game end
		d.reveal();
		System.out.println("Blackjack or bust?");
		//check for a blackjack or bust
		d.winOrBust();
		}
	
	public void testAces(){
	//test the initial hand of the dealer
	//fails if both cards are or are not visible
	Dealer d = new Dealer();
	List<Card> l = new ArrayList<>();
	Deck f = new Deck(l);
	f.insertCard(new Card('S',"10",10));
	f.insertCard(new Card('C',"8",8));
	f.insertCard(new Card('H',"A",11));
	f.insertCard(new Card('D',"A",11));
	f.insertCard(new Card('S',"A",11));


	
	System.out.println("The Dealer is drawing Cards: ");
	d.initalDraw(f);
	
	System.out.println("Checking dealers current score: ");
	//function to check if the dealer has a blackjack

	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore(f);
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
	Deck f = new Deck(l);
	f.insertCard(new Card('H',"2",2));
	f.insertCard(new Card('D',"10",10));
	f.insertCard(new Card('S',"9",9));

	
	System.out.println("The Dealer is drawing Cards: ");
	d.initalDraw(f);
	
	System.out.println("Checking dealers current score: ");
	//function to check if the dealer has a blackjack

	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore(f);
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
	Deck e = new Deck(l);
	
	e.insertCard(new Card('D',"8",8));
	e.insertCard(new Card('S',"6",6));
	e.insertCard(new Card('H',"A",11));
	
	
	System.out.println("The Dealer is drawing Cards: ");
	 d.initalDraw(e);
	
	System.out.println("Checking dealers current score: ");
	//fuction to check if the dealer has a blackjack
	//d.checkScore();
	System.out.println(d.getScore());
	System.out.println("The Dealer is drawing Cards: ");
	//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
	d.drawMore(e);
	System.out.println("Revealing Secret Card");
	//check that the card is revealed at game end
	d.reveal();
	System.out.println("Blackjack or bust?");
	//check for a blackjack or bust
	d.winOrBust();
	}
	
	public void testSplit() {
		
		Dealer d = new Dealer();
		List<Card> l = new ArrayList<>();
		Deck e = new Deck(l);
		
		e.insertCard(new Card('D',"9",9));
		e.insertCard(new Card('H',"9",9));
		e.insertCard(new Card('D',"2",9));
		e.insertCard(new Card('S',"4",9));
		e.insertCard(new Card('C',"9",9));
		
		System.out.println("The Dealer is drawing Cards: ");
		 d.initalDraw(e);
		 
		 split();
		
		System.out.println("Checking dealers current score: ");
		//fuction to check if the dealer has a blackjack
		//d.checkScore();
		System.out.println(d.getScore());
		System.out.println("The Dealer is drawing Cards: ");
		//if dealer hand is less than 17 points or has an ace worth and 17 points draw face up stop after
		d.drawMore(e);
		d.drawSplitMore(e);
		System.out.println("Revealing Secret Card");
		//check that the card is revealed at game end
		d.reveal();
		System.out.println("Blackjack or bust?");
		//check for a blackjack or bust
		d.winOrBust();
	}
	

}
