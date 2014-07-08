package org.paypal.working;

public class GameBoard {
	int[] squares;
	int totalBlocks;

	GameBoard() {
		totalBlocks = 101;
		squares = new int[101];
		for (int i = 0; i <= 100; i++) {
			squares[i] = i;
		}

	}

	GameBoard(int len) {
		totalBlocks = len + 1;
		squares = new int[len + 1];
		for (int i = 0; i <= len; i++) {
			squares[i] = i;
		}
	}

	public void addSnake(int head, int tail) {
		squares[head] = tail;
	}

	public void addLadder(int top, int foot) {
		squares[foot] = top;
	}

	public int movePlayerPiece(int index) {
		return squares[index];

	}
	public int getTotalBlocks() {
		return totalBlocks;
	}

	public String printType(int index) {
		if (squares[index] == index) {
			return "";
		}
		if (squares[index] > index) {
			return "Ladder";
		} else {
			return "Snake";
		}
	}
}
