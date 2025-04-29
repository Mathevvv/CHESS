package org.example;


abstract public class Piece {
    public final Color color;
    public Coordinates coordinate;

    public Piece(Color color, Coordinates coordinate) {
        this.color = color;
        this.coordinate = coordinate;
    }
}
