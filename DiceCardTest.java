import java.util.Scanner;

public class DiceCardTest{

	public static void main (String[] args){

		Scanner input = new Scanner (System.in);

		RandomNumInterface [] interfaceObject = new RandomNumInterface [10];
		interfaceObject [0] = new Dice();
		interfaceObject [1] = new Card();
			
		for (int arrayCount = 1; arrayCount < 10; arrayCount++)
		{
			System.out.print("Press 1 to role a Dice, or 2 to pick a Card: ");
			int userChoice = input.nextInt();

			try
			{
				if (userChoice == 1)
				{
					int randomDiceNum = interfaceObject[0].getRandomNum();
					System.out.println("Random Dice number = "+randomDiceNum);
					interfaceObject[0].setNumHistory(randomDiceNum);
				}
				else if (userChoice == 2)
				{
					int randomCardNum = interfaceObject[1].getRandomNum();
					System.out.println("Random Card number = "+ randomCardNum);
					interfaceObject[1].setNumHistory(randomCardNum);;
				}
			}
			catch (IllegalArgumentException e)
			{
				System.out.println("Random number can only be generated and stored 10 times.");
			}
		}

		System.out.println("\nArray   Dice #");
		for (int count = 0; count <= 9; count++)
		{
			System.out.printf("%d       ",count);
			System.out.println(interfaceObject[0].getHistory(count));
		}
		
		System.out.println("\nArray   Card #");
		for (int count = 0; count <= 9; count++)
		{
			System.out.printf("%d       ",count);
			System.out.println(interfaceObject[1].getHistory(count));
		}
	}
}