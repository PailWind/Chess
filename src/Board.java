import java.util.Arrays;

public class Board {

		String[] rowLetters = {"  a ", "b ", "c ", "d ", "e ", "f ", "g ", "h "}; 
		Piece[] [] board = new Piece[8] [8];
	
		public Board(){
			this.SetPieces();
			 System.out.println(Arrays.toString(rowLetters));
			 for(int i = 0; i < board.length; i++)
			 {
			 System.out.println(i+1 + " " + Arrays.deepToString(board[i]));
			 }
//			System.out.println(Arrays.deepToString(board));
//			performMove("a2a3");
//			System.out.println(Arrays.deepToString(board));

		}

	private void SetPieces()
	{
		for(int x = 0; x < board.length; x++)
		{
			for(int y = 0; y < board[0].length; y++)
			{
			board[x] [y] = new EmptySpace();
			}
		}
		for(int i = 0; i < 8; i++)
		{
			board[1][i] = new Pawn("white");
			board[6][i] = new Pawn("black");
		}
			board[0][1] = new Knight("white");
			board[0][6] = new Knight("white");
			board[7][1] = new Knight("black");
			board[7][6] = new Knight("black");
			
			board[0][0] = new Rook("white");
			board[0][7] = new Rook("white");
			board[7][0] = new Rook("black");
			board[7][7] = new Rook("black");
			
			board[0][2] = new Bishop("white");
			board[0][5] = new Bishop("white");
			board[7][2] = new Bishop("black");
			board[7][5] = new Bishop("black");
			
			board[0][3] = new King("white");
			board[7][3] = new King("black");

			board[0][4] = new Queen("white");
			board[7][4] = new Queen("black");
			
	}
	
	public void performMove(String move)
	{
		//String[] rowLetters = {"a ", " b", "c ", "d ", "e ", "f ", "g ", "h "}; 
		int[] moveAr = parseMove(move);
		 board[moveAr[0]][moveAr[1]].setMoveCount();
		 board[moveAr[2]][moveAr[3]] = board[moveAr[0]][moveAr[1]];
		 board[moveAr[0]][moveAr[1]] = new EmptySpace();
		// System.out.println(board[moveAr[2]][moveAr[3]].moveCount);
		 System.out.println(Arrays.toString(rowLetters));
		 for(int i = 0; i < board.length; i++)
		 {
		 System.out.println(i+1 + " " + Arrays.deepToString(board[i]));
		 }
		}
		
	public int[] parseMove(String move)
	{
		int[] moveArray = new int[4];
		//from move
		moveArray[1] = charToInt(move.charAt(0));
		moveArray[0] = Integer.parseInt(move.charAt(1) + "") -1;
		//to move
		moveArray[3] = charToInt(move.charAt(2));
		moveArray[2] = Integer.parseInt(move.charAt(3) + "") -1;
		//System.out.println(Arrays.toString(moveArray));
		return moveArray;
	}
	
	
	public int charToInt(char ch)
	{
		switch(ch)
		{
		case 'a': return 0;
		case 'b': return 1;
		case 'c': return 2;
		case 'd': return 3;
		case 'e': return 4;
		case 'f': return 5;
		case 'g': return 6;
		case 'h': return 7;
		default: return 8;
		}
		
	}
	
	
	
	
	
}

