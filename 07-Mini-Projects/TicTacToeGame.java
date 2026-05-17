import java.util.*;

/**
 * TicTacToeGame.java
 *
 * A two-player Tic-Tac-Toe game with board display, win/draw detection,
 * and replay support. Demonstrates 2D arrays, game state management,
 * input validation, and clean console UI.
 *
 * Features:
 *   - Visual 3x3 board rendering
 *   - Two-player turn-based gameplay
 *   - Win, draw, and invalid-move detection
 *   - Score tracking across rounds
 *   - Replay option
 */
public class TicTacToeGame {

    private final char[][] board = new char[3][3];
    private char currentPlayer = 'X';
    private int scoreX = 0, scoreO = 0, draws = 0;

    public TicTacToeGame() { resetBoard(); }

    private void resetBoard() {
        int cell = 1;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = (char) ('0' + cell++);
        currentPlayer = 'X';
    }

    private void displayBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("   %c │ %c │ %c%n", board[i][0], board[i][1], board[i][2]);
            if (i < 2) System.out.println("  ───┼───┼───");
        }
        System.out.println();
    }

    private boolean placeMove(int cell) {
        if (cell < 1 || cell > 9) return false;
        int row = (cell - 1) / 3, col = (cell - 1) % 3;
        if (board[row][col] == 'X' || board[row][col] == 'O') return false;
        board[row][col] = currentPlayer;
        return true;
    }

    private boolean checkWin() {
        // rows and cols
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true;
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true;
        }
        // diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true;
        return false;
    }

    private boolean isBoardFull() {
        for (char[] row : board)
            for (char c : row)
                if (c != 'X' && c != 'O') return false;
        return true;
    }

    private void displayScoreboard() {
        System.out.println("┌────────────────────────┐");
        System.out.printf("│  X: %-3d │ O: %-3d │ D: %-2d│%n", scoreX, scoreO, draws);
        System.out.println("└────────────────────────┘");
    }

    public void play(Scanner sc) {
        resetBoard();
        System.out.println("\n🎮 New game! X goes first.");
        displayBoard();

        while (true) {
            System.out.printf("  Player %c — enter cell (1–9): ", currentPlayer);
            int cell;
            try { cell = Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("  ⚠ Enter 1–9."); continue; }

            if (!placeMove(cell)) { System.out.println("  ⚠ Invalid move."); continue; }

            displayBoard();

            if (checkWin()) {
                System.out.printf("  🏆 Player %c wins!%n", currentPlayer);
                if (currentPlayer == 'X') scoreX++; else scoreO++;
                break;
            }
            if (isBoardFull()) {
                System.out.println("  🤝 It's a draw!");
                draws++;
                break;
            }
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        displayScoreboard();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToeGame game = new TicTacToeGame();

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║        TIC  TAC  TOE  GAME         ║");
        System.out.println("╚════════════════════════════════════╝");

        boolean playing = true;
        while (playing) {
            game.play(sc);
            System.out.print("\n  Play again? (y/n): ");
            playing = sc.nextLine().trim().equalsIgnoreCase("y");
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
