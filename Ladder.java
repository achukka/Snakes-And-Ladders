public class Ladder {
	private BoardSquare top;
	
	Ladder(BoardSquare Top, BoardSquare foot) {
		setTop(Top);
		foot.addLadder(this);
	}
	private void setTop(BoardSquare top) {
		this.top = top;
	}
	private BoardSquare getTop() {
		return this.top;
	}
	void movePlayerPiece(PlayerPiece counter) {
		System.out.println("Up the ladder to "+getTop().getPosition());
		counter.setCurrentPosition(getTop());
	}
	
}
