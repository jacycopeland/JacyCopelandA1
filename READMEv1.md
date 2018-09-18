# JacyCopelandA1
COMP3004 assignment 1 - Blackjack program
Name: Jacy Copeland
Id#: 101037790
Date Started: September 8th 2018

Current Date: September 16th 2018
End Date:  September 20th 2018

Purpose: to create a simple Blackjack program using TDD.

File List:  Card.java - class definition of a card
            CardTest.java - a class dedicated to testing a card    
            Deck.java - a class declaration for the deck.
            DeckCreationTest.java - a class dedicated to testing a deck's functionality 
            Dealer.java -  a class definition and meathods for the dealer AI
            DealerTest.java - a class that tests different Dealer functions and hands
            GameTest.java - test code for the blackjack game
            Player.java - a class that defines a player
            PlayerTest.java - a class that tests funtionality of a player


Goals:  Create a Repository 
        Link Reposity to TA
        create a deck of cards ->   list? Map? or card objects (Card objects have a suit, a number, and a value(ace will have defult value))
                                    assign values to cards
                                    
        create a score checker ->   create an add function
                                    function that compares values to the number 21
                                    function that compares player hand to dealer
                                    function to change the value of aces accordingly (1 or 11)
        
        Create deck commands ->     Draw command
                                    Shuffle Command -> random gen
                                    Deal command    -> 2 cards per person following blackjack rules
                                  
                   
        Automate Dealer
        
        At startup select console or file input ->  console will create a random gen of cards
                                                    file will pull player commands and cards from a file
        
Goals Completed:Create a Respository, set up dependecies, card and deck classes completed.

Important meathods:

Limitations: Aces currently act as one point with multiple present for dealer.

Notes: player only has one test file as it can be rerun with different inputs from the player.
