
public class Pawn extends Piece {

	public String color;
	public int moveCount;
//	public boolean HasMoved;
	
	public Pawn (String color){
		this.color = color;
		
	}
	
	public boolean validateMove(Piece[] [] board, int currX, int currY, int newX, int newY)
	{
		//making sure the pawns are moving forward respective of their color
		if(color.equals("white")){
			if(currX > newX){
				return false;
			}	
		}else{
			if(currX < newX){
				return false;
			}
		}
		
		//making sure pawns only move one square forward at a time
		if(currY == newY){
			if(color.equals("white"))
			{
				if(board[currX + 1] [currY] != null){
					return false;
				}
			}else{
				if(board[currX - 1] [currY] != null){
					return false;
				}
			}
			
		
			
		}
		
		
		return true;
	}
	
	
	public void setMoveCount()
	{
		this.moveCount++;		
	}
	
	public String getColor()
	{
		return this.color;
	}
	public String toString()
	{
		return color.charAt(0) + "p";
	}


}
