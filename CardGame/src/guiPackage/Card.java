package guiPackage;

public class Card implements Comparable<Card>
{
	private String suit;
	private boolean face;
	private int rank;
	private boolean visible; // for community cards
	
	public Card(String suit, String value)
	{
		this.suit = suit;
		visible = true;
		
		switch (value)
		{
			case "Ace":
				this.rank = 14;
				break;
			case "Jack":
				face = true;
				this.rank = 11;
				break;
			case "Queen":
				face = true;
				this.rank = 12;
				break;
			case "King":
				face = true;
				this.rank = 13;
				break;
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				face = false;
				this.rank = Integer.valueOf(value);
				break;
			default:
				throw new IllegalArgumentException("Not a valid card value");
		}
	}
	
	public boolean isFaceCard()
	{
		return face;
	}
	
	public boolean isVisible()
	{
		return visible;
	}
	
	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}

	@Override
	public int compareTo(Card anotherCard) {
		if (this.rank > anotherCard.rank)
			return 1;
		else if (this.rank < anotherCard.rank)
			return -1;
		else
			return 0;
	}
	
	@Override
	public String toString()
	{
		String tempString = null;
		
		if (rank <= 10)
		{
			tempString = rank + " of " + suit;
		}
		else
		{
			switch (rank)
			{
				case 11:
					tempString = "Jack of " + suit;
					break;
				case 12:
					tempString = "Queen of " + suit;
					break;
				case 13:
					tempString = "King of " + suit;
					break;
				case 14:
					tempString = "Ace of " + suit;
			}
		}
		
		return tempString;
	}
}
