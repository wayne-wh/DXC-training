import java.util.Scanner; //packages


class Guesser
{
	int guessNum()
	{
		System.out.println("Guesser guess a number");
		Scanner sc = new Scanner(System.in);
		int gnum = sc.nextInt();
		return gnum;
	}
}
class Player
{
	int guessNum(int count)
	{
		System.out.println("Player " + count + " guess a number");
		Scanner sc = new Scanner(System.in);
		int pnum = sc.nextInt();
		return pnum;
	}
}

class Referee
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void askGuesser()
	{
		Guesser akhil = new Guesser();
		numFromGuesser = akhil.guessNum();
	}

	void askPlayers()
	{
		int counter = 1;
		Player ryan = new Player();
		Player deeps = new Player();
		Player dee = new Player();

		numFromPlayer1 = ryan.guessNum(counter);
		counter++;
		numFromPlayer2 = deeps.guessNum(counter);
		counter++;
		numFromPlayer3 = dee.guessNum(counter);
		counter++;
	}

	void checkNum()
	{
		int checker = 0;
		String output = "";

		if(numFromPlayer1 == numFromGuesser)
		{
			output += "Player 1 ";
			checker++;
		}
		if(numFromPlayer2 == numFromGuesser && checker > 0)
		{
			output += ", Player 2 ";
			checker++;
		} else if (numFromPlayer2 == numFromGuesser){
			output += "Player 2 ";
			checker++;
		}
		if(numFromPlayer3 == numFromGuesser && checker > 0)
		{
			output += ", Player 3 ";
			checker++;
		} else if (numFromPlayer3 == numFromGuesser){
			output += "Player 3 ";
			checker++;
		}
		if (checker == 0) {
			System.out.println("Game Ended");
		} else if (checker == 1){
			System.out.println(output + "is the winner.");
		} else if (checker == 3) {
			System.out.println(output + "are all winners.");
		} else if (checker > 1) {
			System.out.println(output + "are the winners.");
		}
	}
}


class Game
{
	public static void main(String[] args)
	{
		Referee xavier = new Referee();
		xavier.askGuesser();
		xavier.askPlayers();
		xavier.checkNum();
	}
}