package guiPackage;

public enum HandRank 
{
	ROYAL_FLUSH (10, "Royal Flush"),
	STRAIGHT_FLUSH (9, "Straight Flush"),
	QUADS (8, "Quads"),
	BOAT (7, "Full House"),
	FLUSH (6, "Flush"),
	STRAIGHT (5, "Straight"),
	SET (4, "Set"),
	TWO_PAIR (3, "Two Pair"),
	PAIR (2, "Pair"),
	HIGH_CARD (1, "High Card");
	
	private final int rank;
	private final String name;
	
	HandRank(int rank, String name)
	{
		this.rank = rank;
		this.name = name;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public String getName()
	{
		return name;
	}
}
