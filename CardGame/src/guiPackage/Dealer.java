package guiPackage;

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
	
	public Card[] dealCards(LinkedList<Player> players)
	{
		Card[] commCards = new Card[5];
		deck.shuffleDeck();
		cards = deck.getDeck();
		
		for (int i = 0; i < 5; i++)
		{
			commCards[i] = cards.pop();
			commCards[i].setVisible(false);
		}
		
		for (int j = 0; j < 2; j++)
		{
			for (Player player : players)
			{
				player.receiveCard(cards.pop());
			}
		}
		
		return commCards;
	}
	
	public void givePot(Player player, int pot)
	{
		player.receiveWinnings(pot);
	}
	
}
