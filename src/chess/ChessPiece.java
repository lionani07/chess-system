package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

import java.util.Objects;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public boolean isThereOpponentPiece(Position position) {
        ChessPiece chessPiece = (ChessPiece) this.board.piece(position);
        return !Objects.isNull(chessPiece) && !this.color.equals(chessPiece.getColor());
    }
}
