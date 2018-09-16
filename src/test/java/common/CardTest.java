package common;

import junit.framework.TestCase;

public class CardTest extends TestCase{

	//test to see if a card properly is created
	public void testCardValues(Card card) {
		
		//if wrong suit specify
		if(card.getSuit()!='S'|| card.getSuit()!='H'||card.getSuit()!='D'||card.getSuit()!='C')
		{
			System.out.println("Invalid Card Creation!");
		}
		
		System.out.println("The card is "+ card.getSuit() + card.getNumber()+ "is worth" + card.getPoints() + "is face ");
		
		if(card.getFace() == false)
		{
			System.out.println("down./n");
		}
		else {
			System.out.println("up./n");
		}
		
		
		
		
	}
	
	//test card creation
	public void createCard()
	{
		Card SA = new Card('S','A',1);
		//should not create
		Card NA  = new Card('B','2',2);
			
		testCardValues(SA);
		testCardValues(NA);
	
		
	}
}
