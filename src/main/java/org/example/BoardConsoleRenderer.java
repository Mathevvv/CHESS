package org.example;

import org.example.piece.Piece;

public class BoardConsoleRenderer {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_PIECE_COLOR = "\u001B[97m";
    public static final String ANSI_BLACK_PIECE_COLOR = "\u001B[30m";

    public static final String ANSI_WHITE_SQUARE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_BLACK_SQUARE_BACKGROUND = "\u001B[0;100m";

    //public static final String ANSI_HIGHLIGHTED_SQUARE_BACKGROUND = "\u001B[45m";

    public void render(Board board) {
        for (int rank = 8; rank >=1; rank--) {
            String line = "";
            for(File file: File.values()){
                Coordinates coordinates = new Coordinates(file, rank);
                if(board.isSquareEmpty(coordinates)){
                    line += getSpriteForEmptySquare(coordinates);
                } else {
                    line +=getSpriteForPieceSquare(board.getPiece(coordinates));
                }

            }
            line += ANSI_RESET;
            System.out.println(line);
        }
    }


    private String colorizeSprite(String sprite, Color pieceColor, boolean isSquareDark) {

        //format = background color + font color + text

        String result = sprite;
        if(pieceColor == Color.WHITE){
            result = ANSI_WHITE_PIECE_COLOR + result;
        }
        else {
            result = ANSI_BLACK_PIECE_COLOR + result;
        }
        if(isSquareDark){
            result = ANSI_BLACK_SQUARE_BACKGROUND + result;
        }
        else {
            result = ANSI_WHITE_SQUARE_BACKGROUND + result;
        }
        return result;
    }


    private String getSpriteForEmptySquare(Coordinates coordinates) {
        return  colorizeSprite("   ", Color.BLACK, Board.isSquareDark(coordinates));
    }

    private String getSpriteForPieceSquare(Piece piece) {
        return colorizeSprite( " " + selectUnicodeSpriteForPiece(piece) + " ", piece.color, Board.isSquareDark(piece.coordinates));
    }

    private String selectUnicodeSpriteForPiece(Piece piece) {
        switch (piece.getClass().getSimpleName()) {
            case "Pawn": return "♟";
            case "Bishop": return "♝";
            case "King": return "♚";
            case "Queen": return "♛";
            case "Rook": return "♜";
            case "Knight": return "♞";
        }
        return "";
    }
}

