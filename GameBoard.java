
public class GameBoard {
	BoardSquare [] squares;
	public final int START_SQUARE = 1;
	public final int MAX_SQUARE = 100;
	public final int
	GameBoard() {
		die = new Die();
		squares = new BoardSquare[START_SQUARE + MAX_SQUARE];
		for(int i = START_SQUARE; i <= MAX_SQUARE; i++){
			squares[i] = new BoardSquare(i);
		}
		
	}
	
	BoardSquare getStartSquare() {
		return squares[START_SQUARE];
	}
	void movePlayerPiece(PlayerPiece counter) {
		BoardSquare current = counter.getCurrentPosition();
		int nextPosition = current.getPosition() + die.getRoll();
		if(nextPosition > MAX_SQUARE) {
			System.out.println("Sorry ");
		}
		else
		{
			counter.moveTo(squares[nextPosition]);
		}
		System.out.println(counter.getColor()+ " on " + counter.getCurrentPosition().getPosition());
	}
	
}
