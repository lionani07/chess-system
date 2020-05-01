package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessMatch {
    private  static final int QTD_ROWS = 8;
    private  static final int QTD_COLUMNS = 8;

    private Board board;

    public ChessMatch() {
        this.board = new Board(QTD_ROWS,QTD_COLUMNS);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[this.board.getRows()][this.board.getRows()];
        for (int i = 0; i < board.getRows() ; i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) this.board.piece(i, j);
            }
        }
        return mat;
    }
}
