import java.util.ArrayList;

public class Hand 
{
	public static void determineHand(ArrayList<Card> cards)
	{
		int[] ranks;
		
		ranks = new int[13];
		
		// make histogram
		for (int i = 0; i < cards.size(); i++)
		{
			System.out.println(cards.get(i).getRank());
			ranks[cards.get(i).getRank()-2]++;
		}
		
		// display histogram
		for (int j = 0; j < ranks.length; j++)
		{
			System.out.println(ranks[j] + " of " + (j+2));
		}
	}
}
