package week11examples;

import java.util.Objects;

public class PairNaive {
        private Integer row;
        private Integer column;

        public PairNaive(Integer row, Integer column) {
            this.row = row;
            this.column = column;
        }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PairNaive pairNaive = (PairNaive) o;
        return Objects.equals(row, pairNaive.row) && Objects.equals(column, pairNaive.column);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {
        return "PairNaive{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    public static void main (String[] args) {
            PairNaive p1 = new PairNaive(1, 5);
            p1.setRow(4);
            p1.setColumn(3);

            System.out.println(p1);
        }
}
