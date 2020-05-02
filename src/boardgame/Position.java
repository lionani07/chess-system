package boardgame;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void toUp() {
        this.setRow(this.row - 1);
    }

    public void toDown() {
        this.setRow(this.row + 1);
    }

    public void toLeft() {
        this.setColumn(this.column - 1);
    }

    public void toRight() {
        this.setColumn(this.column + 1);
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.row, this.column);
    }
}
