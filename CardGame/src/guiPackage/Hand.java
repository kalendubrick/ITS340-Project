package guiPackage;

import java.util.ArrayList;

public final class Hand 
{
	public static HandRank determineHand(ArrayList<Card> cards)
	{
		int[] ranks;
		int highestCount = 0, midCount = 0, lowestCount = 0;
		int highIndex = 0, midIndex = 0, lowIndex = 0;
		
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
		
		return HandRank.ROYAL_FLUSH;
		
	}
}
