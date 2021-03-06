
public class Player 
{
	private final int MAX_CARDS = 5;
	
	private String name;
	private int money, numCards;
	private Card[] playerCards;
	private boolean computerControlled;
	private boolean inPlay;
	
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
		inPlay = true;
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
	
	public boolean isInPlay()
	{
		return inPlay;
	}
	
	public void receiveCard(Card card)
	{
		if (numCards < (MAX_CARDS - 1))
			playerCards[numCards++] = card;
		else
			throw new ArrayIndexOutOfBoundsException("Only 5 cards allowed!");
	}
	
	public void receiveWinnings(int winnings)
	{
		money += winnings;
	}
	
	public void call()
	{
		
	}
	
	public void check()
	{
		
	}
	
	public void fold()
	{
		inPlay = false;
	}
}
