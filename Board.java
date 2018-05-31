import java.util.Scanner;

public class Board {
	public static int position;
	
	public static int positionOnBoard(int dice) {
		position  = dice;
		//System.out.println("the position for player is: "+position);
		return position;
		
	}
	
	public static int throwDice() {
		int dice1=(int)(Math.random()*6+1);
	    int dice2=(int)(Math.random()*6+1);
	    int sum= dice1 + dice2; 
	    System.out.println(sum);
	    positionOnBoard(sum);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Game Start");
		Scanner Player = new Scanner(System.in);
		System.out.println("choose how many player :");
		int numOfPlayer = Integer.parseInt(Player.nextLine());
		System.out.println("you choose "+numOfPlayer+" Players ");
		
		int PlayerPlay[] = new int[numOfPlayer];
		for (int i = 0; i < PlayerPlay.length; i++) {
			System.out.print("the dice for player " + (i+1) + " is: ");
			PlayerPlay[i] = throwDice();

		}
		
	}

}