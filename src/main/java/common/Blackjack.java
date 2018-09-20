package common;

import java.io.IOException;

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
	
	public void file() throws IOException
	{
		g.startGameFile();
		g.playerTurn();
		g.dealerTurn();
		g.testWin();
	}

}
