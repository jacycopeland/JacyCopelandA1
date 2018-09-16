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
	
	

}
