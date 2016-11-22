
public class Queen extends Piece{

	public String color;
	public int moveCount;
	
	public Queen(String color){
		
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setMoveCount()
	{
		this.moveCount++;		
	}
	public String toString()
	{
		return color.charAt(0) + "Q";
	}
}
