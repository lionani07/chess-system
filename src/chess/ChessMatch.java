package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private  static final int QTD_ROWS = 8;
    private  static final int QTD_COLUMNS = 8;

    private Board board;

    public ChessMatch() {
        this.board = new Board(QTD_ROWS,QTD_COLUMNS);
        initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(this.board, Color.WHITE));
        placeNewPiece('e', 8, new King(this.board, Color.WHITE));
        placeNewPiece('e', 1, new King(this.board, Color.BLACK));
    }
}
