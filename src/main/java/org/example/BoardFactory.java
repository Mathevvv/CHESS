package org.example;

public class BoardFactory {

    public Board fromFen(String fen) {
        Board board = new Board();
        String[] split = fen.split(" ");

        return board;
    }
}
