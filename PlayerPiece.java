package org.paypal.working;

public class PlayerPiece {

	String PlayerName;
	String color;
	int currentPosition;
	int index;

	PlayerPiece(int id) {
		index = id;
		currentPosition = 0;
		PlayerName = "A";
	}

	public int getCurrentPosition() {
		return this.currentPosition;
	}

	void movePlayerPiece(GameBoard board, int steps) {
		int oldPosition = this.getCurrentPosition();
		String jumpType = "";
		int newPosition = steps + this.getCurrentPosition();
		if (newPosition < board.getTotalBlocks()) {
			this.setCurrentPosition(board.squares[newPosition]);
			jumpType = board.printType(newPosition);
		}
		System.out.println(" From " + oldPosition
				+ "--" + this.getCurrentPosition() + "\t" + jumpType);
	}

	public void setCurrentPosition(int newPos) {
		currentPosition = newPos;
	}

	public boolean wins(GameBoard b) {
		return (currentPosition == (b.getTotalBlocks()-1)) ? true : false;
	}
}
