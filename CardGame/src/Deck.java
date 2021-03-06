import java.util.Random;

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
		cardArray[11] = new Card("Hearts", "King");
		cardArray[12] = new Card("Hearts", "Ace");
		for (i = 13; i < 22; i++)
		{
			cardArray[i] = new Card("Spades", String.valueOf((i % 13)+2));
		}
		cardArray[22] = new Card("Spades", "Jack");
		cardArray[23] = new Card("Spades", "Queen");
		cardArray[24] = new Card("Spades", "King");
		cardArray[25] = new Card("Spades", "Ace");
		for (i = 26; i < 35; i++)
		{
			cardArray[i] = new Card("Diamonds", String.valueOf((i % 26)+2));
		}
		cardArray[35] = new Card("Diamonds", "Jack");
		cardArray[36] = new Card("Diamonds", "Queen");
		cardArray[37] = new Card("Diamonds", "King");
		cardArray[38] = new Card("Diamonds", "Ace");
		for (i = 39; i < 48; i++)
		{
			cardArray[i] = new Card("Clubs", String.valueOf((i % 39)+2));
		}
		cardArray[48] = new Card("Clubs", "Jack");
		cardArray[49] = new Card("Clubs", "Queen");
		cardArray[50] = new Card("Clubs", "King");
		cardArray[51] = new Card("Clubs", "Ace");
	}
	
	public Stack<Card> getDeck()
	{
		cardStack = new Stack<Card>();
		
		for (int i = 0; i < cardArray.length; i++)
		{
			cardStack.push(cardArray[i]);
		}
		
		return cardStack;
	}
	
	public void shuffleDeck()
	{
		Card temp;
		Random randGen = new Random();
		
		for (int i = (cardArray.length-1); i > 1; i--)
		{
			int randInt = (randGen.nextInt(i-1) + 1);
			
			temp = cardArray[i];
			cardArray[i] = cardArray[randInt];
			cardArray[randInt] = temp;
		}
	}
}
