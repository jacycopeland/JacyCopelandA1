package common;

public class Blackjack {
	
	private Game g;
	
	public Blackjack()
	{
		g = new Game();
	}
	
	public void console()
	{
		g.startGame();
		g.playerTurn();
		g.dealerTurn();
		g.testWin();
	}

}
