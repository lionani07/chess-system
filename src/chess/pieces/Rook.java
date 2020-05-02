package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position positionToMove = new Position(0, 0);

        //Up
        positionToMove.moveTo(this.position);
        positionToMove.toUp();
        while (this.board.positionExists(positionToMove) && !this.board.thereIsAPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
            positionToMove.toUp();
        }
        if (this.board.positionExists(positionToMove) && isThereOpponentPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Left
        positionToMove.moveTo(this.position);
        positionToMove.toLeft();
        while (this.board.positionExists(positionToMove) && !this.board.thereIsAPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
            positionToMove.toLeft();
        }
        if (this.board.positionExists(positionToMove) && isThereOpponentPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Right
        positionToMove.moveTo(this.position);
        positionToMove.toRight();
        while (this.board.positionExists(positionToMove) && !this.board.thereIsAPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
            positionToMove.toRight();
        }
        if (this.board.positionExists(positionToMove) && isThereOpponentPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Down
        positionToMove.moveTo(this.position);
        positionToMove.toDown();
        while (this.board.positionExists(positionToMove) && !this.board.thereIsAPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
            positionToMove.toDown();
        }
        if (this.board.positionExists(positionToMove) && isThereOpponentPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        return mat;
    }
}
