
public abstract class Piece {

	public String color;
	public int moveCount;
	//public boolean hasMoved;
	
	public Piece(){
		
	}
	public abstract String getColor();
	public abstract void setMoveCount();
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
