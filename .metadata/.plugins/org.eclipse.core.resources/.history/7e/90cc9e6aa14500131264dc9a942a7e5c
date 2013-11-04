public class Card implements Comparable<Card>
{
	private String suit;
	private boolean face;
	private int value;
	
	public Card(String suit, String value)
	{
		this.suit = suit;
		
		switch (value)
		{
			case "Ace":
				face = true;
				this.value = 14;
				break;
			case "Jack":
				face = true;
				this.value = 11;
				break;
			case "Queen":
				face = true;
				this.value = 12;
				break;
			case "King":
				face = true;
				this.value = 13;
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
				this.value = Integer.valueOf(value);
				break;
			default:
				throw new IllegalArgumentException("Not a valid card value");
		}
	}

	@Override
	public int compareTo(Card anotherCard) {
		if (this.value > anotherCard.value)
			return 1;
		else if (this.value < anotherCard.value)
			return -1;
		else
			return 0;
	}
}
