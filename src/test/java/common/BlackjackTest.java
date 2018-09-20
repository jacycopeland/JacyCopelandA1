package common;

import junit.framework.TestCase;

public class BlackjackTest  extends TestCase {
	
	public void testConsole()
	{
		Blackjack g = new Blackjack();
		g.console();
	}
	
	public void testFile()
	{
		Blackjack g = new Blackjack();
		g.file();
	}

}
