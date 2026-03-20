package week11examples;

import java.util.Objects;

public class Pair {
    private final Integer row;
    private final Integer column;

    private Pair(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Integer getRow() {
        return row;
    }
    public Integer getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;
        return Objects.equals(getRow(), pair.getRow()) && Objects.equals(getColumn(), pair.getColumn());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getRow());
        result = 31 * result + Objects.hashCode(getColumn());
        return result;
    }

    @Override
    public String toString() {
        return "(" +
                "row=" + row +
                ", column=" + column +
                ")";
    }

    public static class Builder {
        private Integer row;
        private Integer column;

        public Builder() {}

        public Builder row(Integer row) {
            this.row = row;
            return this;
        }
        public Builder column(Integer column) {
            this.column = column;
            return this;
        }

        public Pair build() {
            return new Pair(row, column);
        }

    }
}