import java.util.LinkedList;


public class Dealer 
{
	private Deck deck;
	private Stack<Card> cards;
	
	public Dealer()
	{
		deck = new Deck();
		deck.shuffleDeck();
		cards = deck.getDeck();
	}
	
	public void dealCards(LinkedList<Player> players)
	{
		for (int i = 0; i < 4; i++)
		{
			for (Player player : players)
			{
				player.receiveCard(cards.pop());
			}
		}
	}
	
	public void givePot(Player player, int pot)
	{
		player.receiveWinnings(pot);
	}
}
