public class Card implements RandomNumInterface {
	
	private int randomNumHistory [] = new int [10];
	private int arrayCount = 0;
	
	@Override
	public int getRandomNum()
	{
		if (arrayCount >= 10)
			throw new IllegalArgumentException("System can only hold 10 spaces.");
		int randNum = 1 + (int)(Math.random()*52);
		return randNum;
	}
	public void setNumHistory (int n)
	{
		randomNumHistory [arrayCount] = n;
		arrayCount++;
	}
	public int getHistory (int count)
	{
		return randomNumHistory[count];	
	}
}