package org.example;

import org.example.piece.Piece;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPositions();

//        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
//        renderer.render(board);
//
//        Piece piece = board.getPiece(new Coordinates(File.B, 1));
//        Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

        Game game = new Game(board);
        game.gameLoop();

        int x = 123;

    }
}
