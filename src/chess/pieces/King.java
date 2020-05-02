package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position positionToMove = new Position(0, 0);

        //UP
        positionToMove.setValues(this.position.getRow() -1, this.position.getColumn());
        if (this.board.positionExists(positionToMove) && !this.board.thereIsAPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }
        if (this.board.positionExists(positionToMove) && isThereOpponentPiece(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }


        return mat;
    }
}
