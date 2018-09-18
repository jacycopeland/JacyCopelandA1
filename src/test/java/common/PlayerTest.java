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
		
		p.intialDraw();
		
		//check for initial bust or black jack 
		p.winOrBust();
		
		//check that player can hit miss
		p.drawMore();
		
		p.checkScore();
		
		p.winOrBust();
		
	}

	
}
