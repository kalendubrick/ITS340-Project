package guiPackage;

import java.util.ArrayList;

public class Hand 
{
	private Card highCard, kicker, secondPairHighCard;
	private HandRank finalHand;
	
	// constructor for pair, high card, straight
	public Hand(Card highCard, HandRank finalHand)
	{
		this.highCard = highCard;
		this.finalHand = finalHand;
	}
	
	// constructor for two pair
	public Hand(Card highCard, Card secondPairHighCard, Card kicker, HandRank finalHand)
	{
		this.highCard = highCard;
		this.secondPairHighCard = secondPairHighCard;
		this.kicker = kicker;
		this.finalHand = finalHand;
	}
	
	// constructor for quad
	public Hand(Card highCard, Card kicker, HandRank finalHand)
	{
		this.highCard = highCard;
		this.kicker = kicker;
		this.finalHand = finalHand;
	}
	
	
}
