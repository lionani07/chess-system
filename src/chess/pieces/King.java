package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;
import javafx.geometry.Pos;

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

        //Up
        positionToMove.moveTo(this.position);
        positionToMove.toUp();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Down
        positionToMove.moveTo(this.position);
        positionToMove.toDown();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Left
        positionToMove.moveTo(this.position);
        positionToMove.toLeft();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Right
        positionToMove.moveTo(this.position);
        positionToMove.toRight();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Left-Up
        positionToMove.moveTo(this.position);
        positionToMove.toLeftUP();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Left-Down
        positionToMove.moveTo(this.position);
        positionToMove.toLeftDown();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Right-Up
        positionToMove.moveTo(this.position);
        positionToMove.toRightUP();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        //Right-Down
        positionToMove.moveTo(this.position);
        positionToMove.toRightDown();
        if (this.cantMove(positionToMove)) {
            mat[positionToMove.getRow()][positionToMove.getColumn()] = true;
        }

        return mat;
    }

    private boolean cantMove(Position position) {
       if (this.board.positionExists(position)) {
            if (this.board.thereIsAPiece(position)) {
                return isThereOpponentPiece(position);
            }
            return true;
       }
       return false;
    }

}
