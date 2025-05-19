package org.example.piece;

import org.example.Color;
import org.example.Coordinates;

import java.util.Set;

public class Pawn extends Piece {
    public Pawn(Color color, Coordinates coordinate) {
        super(color, coordinate);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return null;
    }
}
