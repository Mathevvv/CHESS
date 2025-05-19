package org.example;

import java.util.Scanner;
import java.util.Set;

import org.example.piece.Piece;
import org.example.Color;
import org.example.Board;


public class InputCoordinates {

    public static final Scanner scanner = new Scanner(System.in);


    public static Coordinates input() {
        while (true) {
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
    }

        public static Coordinates inputPieceCoordinatesForColor(Color color, Board board){
            while (true) {
                System.out.println("Enter coordinates for a piece to move");
                Coordinates coordinates = input();

                if (board.isSquareEmpty(coordinates)) {
                    System.out.println("Empty square");
                    continue;
                }

                Piece piece = board.getPiece(coordinates);
                if (piece.color != color) {
                    System.out.println("Wrong color");
                    continue;
                }

                Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);
                if (availableMoveSquares.isEmpty()) {
                    System.out.println("Blocked piece");
                    continue;
                }

                return coordinates;
            }
        }

    public static Coordinates inputAvailableSquare(Set<Coordinates> coordinates) {
        while (true) {
            System.out.println("Enter your move for selected piece");
            Coordinates input = input();

            if (!coordinates.contains(input)) {
                System.out.println("Non-available square");
                continue;
            }

            return input;
        }
    }




    }

