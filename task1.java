package numbergame;
import java.util.*;
import java.util.Random;
public class Numbergame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random radn = new Random();
		
        System.out.println("Welcome to the Number Guessing Game!");

		int score=0;
		boolean playagain = true;
		
		while(playagain)
		{
			int targetnumber = radn.nextInt(100)+1;
			int chance = 0;
			int maxchance = 10;
			System.out.println("I have selected a number from 1 to 100. Can you guess it?");
			while(chance<maxchance)
			{
				System.out.println("Enter the Guess:");
				int userguess = sc.nextInt();
				sc.nextLine();
				chance++;
			if(userguess==targetnumber)
			{
				System.out.println("Congratulations! You guessed the number " + targetnumber + " in " + chance + " attempts.");
				score++;
				break;
			}
			else if(userguess<targetnumber)
			{
				System.out.println("Too low!Try again");
			}
			else
			{
				System.out.println("Too high!Try again");
			}
			}
			if(chance>=maxchance)
			{
				System.out.println("Sorry,You have run out of the attempts.the correct number was"+targetnumber+".");
			}
			System.out.println("Do you want to play again?(yes/no)");
			String play = sc.nextLine();
			playagain = play.equalsIgnoreCase("yes");
			}
			System.out.println("Game Over!Your score is"+score+".");
			sc.close();
		}
	}


