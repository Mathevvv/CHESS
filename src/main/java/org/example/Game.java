package org.example;

public class Game {
    public final Board board;

    private final BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        boolean isWhiteToMove = true;
        while (true) {

            //print
            //input
            //make move
            isWhiteToMove = !isWhiteToMove;
        }

    }

}
