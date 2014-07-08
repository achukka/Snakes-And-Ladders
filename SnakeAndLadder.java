package org.paypal.working;

import java.util.Random;

public class SnakeAndLadder {

	private GameBoard board;
	private PlayerPiece players[];
	private PlayerPiece winner;
	private PlayerPiece currentPlayer;
	int noOfPlayers;

	SnakeAndLadder() {
		intializeBoard();
		noOfPlayers = 4;
		initializePlayers();
	}

	private void intializeBoard() {
		board = new GameBoard();
		board.addSnake(98, 2);
		board.addSnake(72, 34);
		board.addSnake(57, 25);
		board.addSnake(49, 17);
		board.addLadder(28, 11);
		board.addLadder(62, 32);
		board.addLadder(95, 36);
		board.addLadder(87, 51);
	}

	SnakeAndLadder(int p) {
		intializeBoard();
		noOfPlayers = p;
		initializePlayers();
	}

	private void initializePlayers() {
		players = new PlayerPiece[noOfPlayers];
		for (int i = 0; i < noOfPlayers; i++) {
			players[i] = new PlayerPiece(i);
		}
		winner = null;
	}

	private boolean gameNotOver() {
		return winner == null;
	}

	public void playGame() {
		int i = 0;
		Random rm = new Random();
		int roll, oldPosition;
		while (gameNotOver()) {

			currentPlayer = players[i % noOfPlayers];
			do {
				roll = rm.nextInt(6) + 1;
				System.out.print("Player :" + currentPlayer.index
						+ " Dice Count: " + roll + " ");
				oldPosition = currentPlayer.getCurrentPosition();
				currentPlayer.movePlayerPiece(board, roll);
				if (currentPlayer.wins(board)) {
					winner = currentPlayer;
				}
			} while (roll == 6
					&& oldPosition < currentPlayer.getCurrentPosition());
			i++;
		}
		System.out.println("\nPlayer " + winner.index + " is the winner");
	}

	public static void main(String[] args) {
		SnakeAndLadder snakeAndLadder = new SnakeAndLadder(
				Integer.parseInt(args[0]));
		snakeAndLadder.playGame();
	}
}
