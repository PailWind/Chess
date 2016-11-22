
public class Bishop extends Piece{

	public String color; 
	public int moveCount;
	
	public Bishop (String color){
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}
	public void setMoveCount()
	{
		this.moveCount += 1;		
	}
	public String toString()
	{
		return color.charAt(0) + "B";
	}
}
