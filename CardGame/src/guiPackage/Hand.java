package guiPackage;

import java.util.ArrayList;

public final class Hand 
{
	public static void determineHand(ArrayList<Card> cards)
	{
		int[] ranks;
		
		ranks = new int[13];
		
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
		
		// display histogram
		for (int j = 0; j < ranks.length; j++)
		{
			System.out.println(ranks[j] + " of " + (j+2));
		}
	}
}
