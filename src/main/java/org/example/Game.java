package org.example;

import org.example.piece.Piece;

import java.util.Set;

public class Game {
    public final Board board;

    private final BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        boolean isWhiteToMove = true;
        while (true) {

            renderer.render(board);

            //input
            Coordinates sourceCoordinates = InputCoordinates.inputPieceCoordinatesForColor(
                    isWhiteToMove ? Color.WHITE : Color.BLACK, board
            );

            Piece piece = board.getPiece(sourceCoordinates);

            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            Coordinates targetCoordinates = InputCoordinates.inputAvailableSquare(availableMoveSquares);

            //make move

            board.movePiece(sourceCoordinates, targetCoordinates);
            isWhiteToMove = !isWhiteToMove;
        }

    }

}
