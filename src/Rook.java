
public class Rook extends Piece {

	public String color;
	public int moveCount;
	
	public Rook(String color){
		this.color = color;
	}

	public boolean validateMove(Piece[] [] board, int currX, int currY, int newX, int newY)
	{
		//can't move diagonally
		if(currX != newX && currY != newY){
			return false;
		}
		int offset;
		
		if(currX < newX){
			offset = 1;
		}else{
			offset = -1;
		}
		for(int i = currX + offset; i < newX; i += offset){
			if(board[i][currY] != null){
				return false;
			}
		}
		
		if(currY < newY){
			offset = 1;
		}else{
			offset = -1;
		}
		
		for(int i = currY; i < newY; i += offset){
			if (board[currX][i] != null){
				return false;
			}
		}
		
		
		
		
		return true;
	}
	
	
	public String getColor() {
		return this.color;
	}
	public void setMoveCount()
	{
		this.moveCount++;		
	}
	public String toString()
	{
		return color.charAt(0) + "R";
	}
	
}
