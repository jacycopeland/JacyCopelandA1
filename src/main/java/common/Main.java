package common;

import java.io.IOException;
import java.util.Scanner;

public class Main {
public static void main(String[]args) throws IOException {
	Blackjack b =  new Blackjack();
	
	System.out.println("Would you like  to play on the Console(C) or import a file(F)?");
	
	//Get the input from the user
	
	@SuppressWarnings("resource")
	Scanner response = new Scanner(System.in);
	
	String r = response.nextLine();
	
	
	//if not a valid input specify
	if(r.equals("C") ||r.equals("c")) {
		b.console();
	}
	else if(r.equals("F") ||r.equals("f")) {
		//stop the loop turn is over
		b.file();
	}
	else {
		System.out.println("Please type a valid response.  To hit press H. To stand press S. \n");
	}

}

}