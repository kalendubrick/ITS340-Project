package guiPackage;

import java.util.ArrayList;
import java.util.Arrays;

public final class HandCalc 
{
	public static HandRank determineHand(ArrayList<Card> cards)
	{
		int[] ranks = new int[13];
		int highestCount = 0, midCount = 0, lowestCount = 0;
		int highIndex = 0, midIndex = 0, lowIndex = 0;
		HandRank finalHand;
		Card highCard = cards.get(0); // initially set highcard as first card
		Hand bestHand;
		
		// what cards do we have?
		for (Card card : cards)
		{
			System.out.println(card.toString());
		}
		
		// make histogram
		for (int i = 0; i < cards.size(); i++)
		{
			ranks[cards.get(i).getRank()-2]++;
		}
		
		// count and display histogram
		for (int j = 0; j < ranks.length; j++)
		{
			if (ranks[j] >= highestCount)
			{
				if (highestCount != 0)
				{
					if (midCount != 0)
					{
						lowestCount = midCount;
						lowIndex = midIndex;
					}
					midCount = highestCount;
					midIndex = highIndex;
				}
				highestCount = ranks[j];
				highIndex = j;
			}
			System.out.println(ranks[j] + " of " + (j+2));
		}
		
		System.out.printf("Counts: %d, %d, %d\n", highestCount, midCount, lowestCount);
		
		// check ranks first
		switch (highestCount)
		{
			case 4:
				finalHand = HandRank.QUADS;
				break;
			case 3:
				if (midCount == 2)
				{
					finalHand = HandRank.BOAT;
					break;
				}
				else
				{
					finalHand = HandRank.SET;
					break;
				}
			case 2:
				if (midCount == 2)
				{
					finalHand = HandRank.TWO_PAIR;
					break;
				}
				else
				{
					finalHand = HandRank.PAIR;
					break;
				}
			default:
				finalHand = HandRank.HIGH_CARD;	
		}
		
		// check flush (and make sure we're not replacing a higher hand rank)
		if (areSameSuit(cards) && finalHand.getRank() < HandRank.FLUSH.getRank())
			finalHand = HandRank.FLUSH;
		
		// only check for straight if we know we don't have any paired cards
		if (!finalHand.equals(HandRank.BOAT)
				&& !finalHand.equals(HandRank.QUADS)
				&& !finalHand.equals(HandRank.SET)
				&& !finalHand.equals(HandRank.TWO_PAIR)
				&& !finalHand.equals(HandRank.PAIR))
		{
			// sort cards by rank to check for a straight/straight flush/royal flush
			cards = sortByRank(cards);
			
			if (cards.get(4).getRank() - cards.get(0).getRank() == 4) // straight
			{
				if (finalHand.equals(HandRank.FLUSH))
				{
					if (cards.get(4).getRank() == 14) // ace high, so royal flush
						finalHand = HandRank.ROYAL_FLUSH;
					else
						finalHand = HandRank.STRAIGHT_FLUSH;
				}
				else
					finalHand = HandRank.STRAIGHT;
			}
		}
		
		// figure what else we need to build the hand
		switch(finalHand)
		{
			case PAIR: case STRAIGHT: case HIGH_CARD: case SET: case STRAIGHT_FLUSH: case FLUSH:
				break;
			case TWO_PAIR:
				break;
			case QUADS:
				break;
			case BOAT:
				break;
			case ROYAL_FLUSH:
				
		}
		
		return finalHand;
		
	}
	
	public int compareHands(ArrayList<Hand> hands)
	{
		
		return -1;
	}
	
	private static boolean areSameSuit(ArrayList<Card> cards)
	{	
		for (int i = 0; i < (cards.size()-1); i++)
		{
			if (!cards.get(i).getSuit().equals(cards.get(i+1).getSuit()))
			{
				return false;
			}
		}
		
		return true;
	}
	
	private static ArrayList<Card> sortByRank(ArrayList<Card> cards)
	{
		Card[] cardArray = (Card[]) cards.toArray();
		int in, out;
		
		for (out = 1; out < cardArray.length; out++)
		{
			Card temp = cardArray[out];
			in = out;
			while (in > 0 && cardArray[in-1].getRank() >= temp.getRank())
			{
				cardArray[in] = cardArray[in-1];
				--in;
			}
			cardArray[in] = temp;
		}
		
		return new ArrayList<Card>(Arrays.asList(cardArray));
	}
	
	private static Card getHighCard(ArrayList<Card> cards)
	{
		int highCard = 0;
		
		for (int i = 1; i < cards.size(); i++)
		{
			if (cards.get(highCard).getRank() < cards.get(i).getRank())
			{
				highCard = i;
			}
		}
		
		return cards.get(highCard);
	}
}
