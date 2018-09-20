package common;

import java.io.IOException;

import junit.framework.TestCase;

public class BlackjackTest  extends TestCase {
	
	public void testConsole()
	{
		Blackjack g = new Blackjack();
		g.console();
	}
	
	public void testFile() throws IOException
	{
		Blackjack g = new Blackjack();
		g.file();
	}

}
