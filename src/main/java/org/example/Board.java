package org.example;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void SetPiece(Coordinates coordinates, Piece piece) {
        piece.coordinate = coordinates;
        pieces.put(coordinates, piece);
    }

    public void setupDefaultPiecesPositions() {

    }
}
