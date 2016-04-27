package less11;

import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        System.out.println("Game started...");

            while (!board.gameHasWinner() && !board.isBoardFull()) {

                board.printBoard();

                System.out.println("Player " + board.currentPlayer + " moves...");
                System.out.print("Enter your move: ");
                String move = sc.next();

                if (board.isMoveValid(move)) {
                    board.makeMove();
                    board.changeCurrentPlayer();

                } else {
                    System.out.println("Input was incorrect. Repeat your move.");
                }

            }

        board.printBoard();

        if(board.gameHasWinner()){
            board.changeCurrentPlayer();
            System.out.println("The winner is " + board.currentPlayer + ".");
        }else{
            System.out.println("Dead head.");
        }

        System.out.println("Game over.");
    }
}
