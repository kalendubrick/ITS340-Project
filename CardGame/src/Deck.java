
public class Deck 
{
	private Card[] cardArray;
	private Stack<Card> cardStack;
	
	public Deck()
	{
		cardArray = new Card[52];
		int i;
		
		// fill the array
		for (i = 0; i < 9; i++)
		{
			cardArray[i] = new Card("Hearts", String.valueOf(i+2));
		}
		cardArray[9] = new Card("Hearts", "Jack");
		cardArray[10] = new Card("Hearts", "Queen");
		cardArray[9] = new Card("Hearts", "King");
		cardArray[9] = new Card("Hearts", "Ace");
		
		
		
	}
	
	
}
