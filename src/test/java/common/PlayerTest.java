package common;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class PlayerTest extends TestCase{


	public void testPlayer() {
		
		//Player will have a hand and score
		Player p = new Player();
		
		List<Card> deck = new ArrayList<>();
		Deck d =  new Deck(deck);
		
		d.insertCard(new Card('H',"2", 2));
		d.insertCard(new Card('H',"A", 11));
		d.insertCard(new Card('S',"A",11));
		d.insertCard(new Card('C',"A", 11));
		d.insertCard(new Card('C',"J", 10));
		d.insertCard(new Card('H',"8", 8));
		d.insertCard(new Card('H',"7", 7));
		d.insertCard(new Card('D',"2", 2));
		d.insertCard(new Card('D',"3", 3));
		d.insertCard(new Card('H',"Q", 10));
		
		d.shuffle();
		
		p.initalDraw(d);
		
		//check for initial bust or black jack 
		p.winOrBust();
		
		//check that player can hit miss
		p.drawMore(d);

		
		p.winOrBust();
		
	}
	


	
}
