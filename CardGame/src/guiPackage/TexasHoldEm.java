package guiPackage;

import java.util.LinkedList;
import java.util.ArrayList;

public class TexasHoldEm 
{
	private int numPlayers;
	private int startingFund;
	private int round;
	private Dealer dealer;
	private LinkedList<Player> players;
	private Player smallBlind;
	private Player bigBlind;
	private Card[] communityCards;
	
	public TexasHoldEm()
	{
		numPlayers = 4;
		startingFund = 500;
		dealer = new Dealer();
		players = new LinkedList<Player>();
		for (int i = 0; i < numPlayers; i++)
		{
			Player temp = new Player("Player " + (i+1), startingFund, 1);
			if (i == 0)
				smallBlind = temp;
			else if (i == 1)
				bigBlind = temp;
			players.add(temp);
		}
		round = 1;
		communityCards = new Card[5];
	}
	
	public Card[] deal()
	{
		 return dealer.dealCards(players);
	}
	
	public void playGame()
	{
		communityCards = deal();
		
		Card[] testCards = players.getFirst().getPlayerCards();
		ArrayList<Card> hand = new ArrayList<Card>();
		for (int i = 0; i < 2; i++)
		{
			hand.add(testCards[i]);
		}
		
		// set first 3 cards as visible
		communityCards[0].setVisible(true);
		communityCards[1].setVisible(true);
		communityCards[2].setVisible(true);
		//communityCards[3].setVisible(true);
		//communityCards[4].setVisible(true);
		
		for (int j = 0; j < communityCards.length; j++)
		{
			if (communityCards[j].isVisible())
				hand.add(communityCards[j]);
		}
		
		HandCalc.determineHand(hand);
		
		while (round < 5)
		{
			
			round++;
		}
	}
}
