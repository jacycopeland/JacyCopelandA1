package common;


public class Card {
	
	//Card is Made of:
	private char Suit;
	private char Number;
	private int Points;
	private boolean Face;
	
	//Creation Array of Suits
	//private final List<char> POSSIBLE_SUITS = new List <>(H, D, S, C);
	
	
	//constructor for a card -> cards are made face down
	public Card(char suit, char num, int p)
	{
		Suit = suit;
		Number = num;
		Points = p;
		Face = false;
	}
	
	//get functions for a card
	public char getSuit() {
		return Suit;
	}
	
	public char getNumber()
	{
		return Number;
	}
	
	public int getPoints()
	{
		return Points;
	}
	
	public boolean getFace()
	{
		return Face;
	}
	
	//set the face of the card
	public void setFace()
	{
		if(Face == false)
		{
			Face = true;
		}
		else {
			Face =false;
		}
		}
	}
	
	
	

