import java.util.LinkedList;

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
		
		while (round < 5)
		{
			
			round++;
		}
	}
	
	
}
