package less11;

import java.util.Arrays;

public class Board {

    char[][] board = new char[3][3];
    char currentPlayer;
    int countMove;
    int x, y;

    public Board() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
        countMove = 0;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                System.out.println("   | 1 | 2 | 3");
            }

            System.out.println("--- --- --- ---");

            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    System.out.print(" " + (i + 1) + " | " + board[i][j] + " ");
                } else {
                    System.out.print("| " + board[i][j] + " ");
                }

                if (j == 2) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    public boolean gameHasWinner() {

        if (countMove < 5) {
            return false;
        }

        for (int i = 0; i < 3; i++) {

            if (checkHorizontalLine(i)) {
                return true;
            } else if (checkVerticalLine(i)) {
                return true;
            }
        }

        if (checkDiagonalLine()) {
            return true;
        }

        return false;
    }

    public boolean makeMove() {

        board[x][y] = currentPlayer;
        countMove++;

        return true;
    }

    public void changeCurrentPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    private boolean checkHorizontalLine(int i) {
        if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
            return true;
        }
        return false;
    }

    private boolean checkVerticalLine(int i) {
        if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
            return true;
        }
        return false;
    }

    private boolean checkDiagonalLine() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        } else if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMoveValid(String move) {

        if (move.length() != 2) {
            return false;
        }

        try {
            x = Character.getNumericValue(move.charAt(0)) - 1;
            y = Character.getNumericValue(move.charAt(1)) - 1;
        } catch (Exception e) {
            return false;
        }

        if (x > 2 || y > 2 || x < 0 || y < 0) {
            return false;
        }

        if (board[x][y]!= ' ') {
            return false;
        }

        return true;
    }

    public boolean isBoardFull() {
        if (countMove == 9) {
            return true;
        } else {
            return false;
        }
    }
}
