package org.example.piece;


import org.example.Color;
import org.example.Coordinates;

abstract public class Piece {
    public final Color color;
    public Coordinates coordinate;

    public Piece(Color color, Coordinates coordinate) {
        this.color = color;
        this.coordinate = coordinate;
    }
}
