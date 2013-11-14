
public class Player 
{
	private final int MAX_CARDS = 5;
	
	private String name;
	private int money, numCards;
	private Card[] playerCards;
	private boolean computerControlled;
	
	public Player(String name, int startingMoney, int ai)
	{
		this.name = name;
		money = startingMoney;
		if (ai == 0)
			computerControlled = true;
		else
			computerControlled = false;
		playerCards = new Card[5];
		numCards = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMoney()
	{
		return money;
	}
	
	public Card[] getPlayerCards()
	{
		return playerCards;
	}
	
	public boolean isComputerControlled()
	{
		return computerControlled;
	}
	
	public void receiveCard(Card card)
	{
		if (numCards < (MAX_CARDS - 1))
			playerCards[numCards++] = card;
		else
			throw new ArrayIndexOutOfBoundsException("Only 5 cards allowed!");
	}
	
	
}
