import java.util.Scanner;

public class DiceCardTest{

	public static void main (String[] args){

		Scanner input = new Scanner (System.in);

		Dice dice = new Dice();
		Card card = new Card();

		int tryAgain = 0;
			
		do
		{
			System.out.print("Press 1 to role a Dice, or 2 to pick a Card: ");
			int userChoice = input.nextInt();

			try
			{
				if (userChoice == 1)
				{
					int randomDiceNum = dice.getRandomNum();
					System.out.println("Random Dice number = "+randomDiceNum);
					dice.setNumHistory(randomDiceNum);
				}
				else if (userChoice == 2)
				{
					int randomCardNum = card.getRandomNum();
					System.out.println("Random Card number = "+ randomCardNum);
					card.setNumHistory(randomCardNum);
				}
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Random number can only be generated and stored 10 times.");
			}

			System.out.print("Press 1 to try again or 2 to print history: ");
			tryAgain = input.nextInt();
		}
		while (tryAgain ==1);

		System.out.println("\nArray   Dice #");

		for (int count = 0; count <= 9; count++)
		{
			System.out.printf("%d       ",count);
			System.out.println(dice.getHistory(count));
		}

		System.out.println("\nArray   Card #");

		for (int count = 0; count <= 9; count++)
		{
			System.out.printf("%d       ",count);
			System.out.println(card.getHistory(count));
		}
	}
}