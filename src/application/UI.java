package application;

import chess.ChessPiece;

import java.util.Arrays;
import java.util.Objects;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        int qtdPiece = pieces.length;
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < qtdPiece ; i++) {
            System.out.printf("%s ", qtdPiece - i);
            for (int j = 0; j < qtdPiece ; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.printf("%s ", qtdPiece - i);
            System.out.println("");
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece) {
        if (Objects.isNull(piece)) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
