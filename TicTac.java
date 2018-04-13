import java.util.Arrays;
import java.util.Scanner;

public class TicTac {

	String[][] board = { { "-", "-", "-" }, { "-", "-", "-" }, { "-", "-", "-" } };
	String Marker = "X";
	int win = 0;

	public void display() {
		for (int i = 0; i < board.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " ");
			}
		}
		System.out.print("\n");
	}

	public void placeSign() {
		int row;
		int col;
		int cont = 1;
		Scanner in = new Scanner(System.in);
		while (cont == 1) {
			System.out.print("Enter the ROW number: ");
			row = in.nextInt() - 1;
			if (row <= 2) {
				System.out.print("Enter the COLUMN number: ");
				col = in.nextInt() - 1;
				if (col <= 2) {
					if (board[row][col].equals("-")) {
						board[row][col] = Marker;
						cont = 0;
					} else {
						System.out.println("Sorry, that space is taken.");
					}
				} else {
					System.out.println("Sorry, that is not a valid number");
				}
			} else {
				System.out.println("Sorry, that is not a valid number");
			}
		}
	}

	public void changePlayer() {
		if (Marker == "X") {
			Marker = "O";
		} else {
			Marker = "X";
		}
	}

	public void checkRowWin() {
		if (board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && board[0][2].equals(board[0][0])
				&& !board[0][1].equals("-") && !board[0][0].equals("-") && !board[0][2].equals("-")
				|| board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && board[1][2].equals(board[1][0])
						&& !board[1][0].equals("-") && !board[1][1].equals("-") && !board[1][2].equals("-")
				|| board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && board[2][2].equals(board[2][0])
						&& !board[2][0].equals("-") && !board[2][1].equals("-") && !board[2][2].equals("-")) {
			win = 1;
		}
	}

	public void checkColWin() {
		if (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && board[2][0].equals(board[0][0])
				&& !board[1][0].equals("-") && !board[0][0].equals("-") && !board[2][0].equals("-")
				|| board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && board[2][1].equals(board[0][1])
						&& !board[0][1].equals("-") && !board[1][1].equals("-") && !board[2][1].equals("-")
				|| board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && board[2][2].equals(board[0][2])
						&& !board[0][2].equals("-") && !board[1][2].equals("-") && !board[2][2].equals("-")) {
			win = 1;
		}
	}

	public void checkDiagWin() {
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals(board[0][0])
				&& !board[1][1].equals("-") && !board[0][0].equals("-") && !board[2][2].equals("-")
				|| board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[2][0].equals(board[0][2])
						&& !board[0][2].equals("-") && !board[1][1].equals("-") && !board[2][0].equals("-")) {
			win = 1;
		}
	}
}
