package common;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Player {
	
	//player elements
	private List<Card> hand;
	private int score;
	
	//player constructor
	public Player()
	{
		hand = new ArrayList<>();
		score = 0;
		
	}
	
	//get/setvalues for a player
	public int getScore()
	{
		return score;
	}
	
	public int checkScore(Card c)
	{
		if(c.getNumber().equals("A") && score > 10) {
			c.SetPoints();
			
		}
		
		score = score + c.getPoints();
		
		
		
		//.out.println("Points are: " + score + "\n");
		return score;
	}
	
	
	
	//code from dealer class then altered
	public void initalDraw(Deck d) {
		
		
		hand.add(d.drawCard());
		checkScore(hand.get(hand.size()-1));
		
		hand.add(d.drawCard());
		checkScore(hand.get(hand.size()-1));
		System.out.println("The Player's hand is " + hand.get(0).getSuit() + hand.get(0).getNumber() + " and " + hand.get(1).getSuit() + hand.get(1).getNumber() + "\n");
	}
	
	public void winOrBust()
	{
		if(score == 21)
		{
			System.out.println("Player has backjack\n");
			
		}
		
		if(score > 21)
		{
			System.out.println("Player has bust");
		}
	}
	
	//drawing for the player
	public void drawMore(Deck d)
	{
		
		while(score < 21 )
		{
			System.out.println("Your current score is: " + score +"\n");
			System.out.println("Would you like to hit(H) or Stand (S)?");
			
			//Get the input from the user
			
			@SuppressWarnings("resource")
			Scanner response = new Scanner(System.in);
			
			String r = response.nextLine();
			
			
			//if not a valid input specify
			if(r.equals("H") ||r.equals("h")) {
				hand.add(d.drawCard());
				checkScore(hand.get(hand.size()-1));
				System.out.println("Your hand is: " );
				for(Card c: hand)
				{
					System.out.print(c.getSuit() + c.getNumber() + ", ");
				}
				System.out.println("\n");
			}
			else if(r.equals("S") ||r.equals("s")) {
				//stop the loop turn is over
				System.out.println("The player stands\n");
				break;
			}
			else {
				System.out.println("Please type a valid response.  To hit press H. To stand press S. \n");
			}
		}
	}

}
