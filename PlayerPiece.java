
public class PlayerPiece {
	private BoardSquare currentPosition;
	private String color;
	
	private PlayerPiece(String c) {
		color = c;
	}
	private void setColor(String color) {
		this.color = color;
	}
	String getColor() {
		return color;
	}
	BoardSquare getCurrentPosition() {
		return currentPosition;
	}
	void moveTo(BoardSquare newPosition){
		newPosition.movePlayerPiece(this);
	}
	void setCurrentPosition(BoardSquare newPosition) {
		currentPosition = newPosition;
	}
}
