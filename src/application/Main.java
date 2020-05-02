package application;

import boardgame.Piece;
import boardgame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printMatch(chessMatch);
                System.out.println();

                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(scanner);
                Position position = source.toPosition();
                ChessPiece chessPieceSource = chessMatch.getPieces()[position.getRow()][position.getColumn()];
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.printBoard(chessMatch.getPieces(), possibleMoves, chessPieceSource);

                System.out.println();

                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(scanner);

                ChessPiece chessPiece = chessMatch.performChessMove(source, target);
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }

    }
}
