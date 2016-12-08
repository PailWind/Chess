import java.util.Arrays;
import java.util.Scanner;


public class Chess {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Board gBoard = new Board();
		for(int i = 0; i < 100; i++)
		{
		
		System.out.println("Move: ");
		try{
		gBoard.performMove(sc.nextLine());
		}catch(Exception e){
			System.out.println("Invalid-move!");
			continue;
		}
		}
		
		//gBoard.performMove("e4e5");
		
		//System.out.println(Arrays.deepToString(gBoard));
	}
}
