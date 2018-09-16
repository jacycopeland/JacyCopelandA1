package common;
import java.util.List;
import java.util.ArrayList;
public class Dealer {
	
	//Dealer has a :
	private int score;
	private List<Card> hand;
	
	//constructor for a dealer
	public Dealer() {
		score = 0;
		hand = new ArrayList<>();
	}
	
	//get/set functions
	public int getScore()
	{
		return score;
	}
	
	public List<Card> getHand()
	{
		return hand;
	}
	
	public void setScore(int n)
	{
		score = n;
	}
	
//function that draws the initil hand
	public void initilDraw(Deck d)
	{
		hand.add(d.drawCard());
		hand.add(d.drawCard());
		
		System.out.println("The Dealer's hand is ? and " + hand.get(1));
		
		//show that the card is face up
		hand.get(1).setFace();
		
	}
	
	//function for adding and checking the score
	public int checkScore()
	{
		score = score + hand.get(hand.size()-1).getPoints();
		
		if(score < 11 && hand.get(size()-1).getNumber() == "A")
		{
			score = score +10;
			
			return score;
		}
	}
	
	

}
