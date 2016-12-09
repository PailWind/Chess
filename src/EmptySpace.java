
public class EmptySpace extends Piece {

	
	public String getColor() {
		return null;
	}
	public void setMoveCount() {
		
	}
public String toString(){
	return "[]";
}
@Override
public boolean validateMove(Piece[][] board, int currX, int currY, int newX, int newY) {
	// TODO Auto-generated method stub
	return false;
}
}
