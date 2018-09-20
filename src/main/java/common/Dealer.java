package common;
import java.util.List;
import java.util.ArrayList;
public class Dealer {
	
	//Dealer has a :
	private int score;
	private List<Card> hand;
	private List<Card> hand2;
	
	//constructor for a dealer
	public Dealer() {
		score = 0;
		hand = new ArrayList<>();
		hand2 = new ArrayList<>();
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
	
	public List<Card> getHand2(){
		return hand2;
	}
	
	public void setScore(int n)
	{
		score = n;
	}
	
//function that draws the inital hand
	public void initalDraw(Deck d)
	{
		hand.add(d.drawCard());
		checkScore(hand.get(hand.size()-1));
		
		hand.add(d.drawCard());
		checkScore(hand.get(hand.size()-1));
		System.out.println("The Dealer's hand is ? and " + hand.get(1).getSuit() + hand.get(1).getNumber() + "\n");
		
		//show that the card is face up
		hand.get(1).setFace();
		
	}
	
	public void split()
	{
		if(hand.get(0).getNumber().equals(hand.get(1).getNumber())) {
			hand2.add(hand.remove(1));
		}
	}
	
	//function for adding and checking the score
	public int checkScore(Card c)
	{
		if(c.getNumber().equals("A") && score > 10) {
			c.SetPoints();
			
		}
		
		score = score + c.getPoints();
		
		
		
		//.out.println("Points are: " + score + "\n");
		return score;

	}
	
	//draw more cards function
	public void drawMore(Deck d) {
		
		Card a = null;
		//find if there is an ace
		for(Card c:hand) {
			if(c.getNumber() == "A" && c.getPoints() == 11)
			{
				a = c;
				break;
			}
			
			a = null;
		}
		
		while(score < 17 || (score == 17 && a!=null))
		{
			hand.add(d.drawCard());
			checkScore(hand.get(hand.size()-1));
			System.out.println("Dealer has drawn a " + hand.get(hand.size()-1).getSuit() + hand.get(hand.size()-1).getNumber() +"\n" );
		}
	}
	
	public void reveal()
	{
		//print hand then print score
		
		System.out.println("The Dealer has : ");
		for(Card c: hand)
		{
			System.out.println(c.getSuit() + c.getNumber() + ", ");
		}
		System.out.println("\n");
		System.out.println("Their score is: " + score + "\n");
	}

	
	public void winOrBust()
	{
		if(score == 21)
		{
			System.out.println("Dealer has backjack\n");
			
		}
		
		if(score > 21)
		{
			System.out.println("dealer has bust");
		}
	}
}
