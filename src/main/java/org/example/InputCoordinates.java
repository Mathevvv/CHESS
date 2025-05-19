package org.example;

import java.util.Scanner;
import org.example.piece.Piece;
import org.example.Color;
import org.example.Board;


public class InputCoordinates {

    Scanner scanner = new Scanner(System.in);


    public Coordinates input() {
        while(true) {
            System.out.println("Please enter the coordinates (ex. a1) ");
            String line = scanner.nextLine();

            if (!line.matches("^[a-hA-H][1-8]$")) {
                System.out.println("Invalid input");
                continue;
            }

            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            File file = File.fromChar(fileChar);
            int rank = Integer.parseInt(rankChar + "");
            return new Coordinates(file, rank);

        }

        //public static Coordinates inputPieceCoordinatesForColor(Color color, Board board){


        //}


    }
}
