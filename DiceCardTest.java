import java.util.Scanner;

public class DiceCardTest{

	public static void main (String[] args){

		Scanner input = new Scanner (System.in);

		Dice dice = new Dice();
		Card card = new Card();

		int tryAgain = 0;
		int numberHistory [] = new int [10];
			
		for (int arrayCount = 1; arrayCount < numberHistory.length; arrayCount++)
		{
			System.out.print("Press 1 to role a Dice, or 2 to pick a Card: ");
			int userChoice = input.nextInt();

			try
			{
				if (userChoice == 1)
				{
					int randomDiceNum = dice.getRandomNum();
					System.out.println("Random Dice number = "+randomDiceNum);
					numberHistory [arrayCount] = randomDiceNum;
				}
				else if (userChoice == 2)
				{
					int randomCardNum = card.getRandomNum();
					System.out.println("Random Card number = "+ randomCardNum);
					numberHistory [arrayCount] = randomCardNum;
				}
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Random number can only be generated and stored 10 times.");
			}
		}

		System.out.println("\nArray   Random #");

		for (int count = 0; count <= 9; count++)
		{
			System.out.printf("%d       ",count);
			System.out.println(numberHistory[count]);
		}
	}
}