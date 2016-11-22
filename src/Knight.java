
public class Knight extends Piece{

	public String Color;
	public int moveCount;
	
	public Knight(String color){
		this.color = color;
	}

	
	public boolean validateMove(Piece[] [] board, int currX, int currY, int newX, int newY)
	{
		if(Math.abs(newX - currX) == 2 && Math.abs(newY - currY) == 1)
		{
			return true;
		}
		if(Math.abs(newY - currY) == 2 && Math.abs(newX - currX) == 1)
		{
			return true;
		}
		
		return false;
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
		return color.charAt(0) + "N";
	}
}
