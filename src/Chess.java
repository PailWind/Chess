import java.util.Arrays;
import java.util.Scanner;


public class Chess {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String move ;

		Board gBoard = new Board();
		for(int i = 0; i < 100; i++)
		{
		System.out.println("Make a move: ");
		move = sc.nextLine();
			if(move.length() == 4)
			{
				try
				{
				gBoard.performMove(move);
				}
				catch(Exception e)
				{
				System.out.println("Invalid-move!");
				continue;
				}
			}else{
				continue;
		}
		}
		
		//gBoard.performMove("e4e5");
		
		//System.out.println(Arrays.deepToString(gBoard));
	}
}
