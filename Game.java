
public class Game {

	public static void main(String[] args) {
		int turn = 1;
		TicTac game = new TicTac();
		System.out.println("X Welcome to TicTacToe! O");
		while (game.win == 0) {
			System.out.println("\nIt is currently " + game.Marker + "'s turn");
			game.display();
			game.placeSign();
			game.checkColWin();
			game.checkRowWin();
			game.checkDiagWin();
			if (game.win == 1) {
				System.out.println("Congratulations, the winner is " + game.Marker + "!");
			} else if (turn == 9) {
				game.win = 2;
				game.display();
				System.out.println("It's a draw!");
			} else {
				turn++;
				game.changePlayer();
			}
		}
	}

}
