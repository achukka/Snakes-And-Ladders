
public class SnakesAndLadders {
	private GameBoard board;
	
	public SnakesAndLadders(){
		board = new GameBoard();
	}
	public void play() {
		PlayerPiece counter = new PlayerPiece("Red");
		counter.setCurrentPosition(board.getStartSquare());
		
	}
}
