
public class King extends Piece{
	
	
	public String color; 
	public int moveCount;
	
	public King(String color){
		this.color = color;
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
		return color.charAt(0) + "K";
	}


	@Override
	public boolean validateMove(Piece[][] board, int currX, int currY, int newX, int newY) {
		// TODO Auto-generated method stub
		return false;
	}
}
