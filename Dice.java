
public class Dice implements RandomNum{
	
	private int randomNumHistory [] = new int [10];
	private int array = 0;
	
	public int getRandomNum()
	{
		int randNum = 1 + (int)(Math.random()*6);
		return randNum;
	}
	public void setHistory (int n)
	{
		randomNumHistory [array] = n;
		array++;
	}
	public int getHistory (int count)
	{
		return randomNumHistory[count];
		
	}
}
