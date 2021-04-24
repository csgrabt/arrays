package ismagicsquare;

public class Magic {
    public boolean isMagicSquare(int[][] a) {

        if (isNotCubic(a)) {
            return false;
        }

        if (isTheSumOfTheRowsNotEquals(a)) {
            return false;
        }

        if (isTheSumOfTheColumnIsNotEquals(a)) {
            return false;
        }

        if (isTheDiagonalsNotEquals(a)) return false;


        return true;
    }

    private boolean isTheDiagonalsNotEquals(int[][] a) {
        int differentOfTheDiagonals = 0;


        for (int i = 0; i < a.length; i++) {
            differentOfTheDiagonals += a[i][i];
            differentOfTheDiagonals -= a[a.length - 1 - i][a.length - 1 - i];
        }
        if (differentOfTheDiagonals != 0) {
            return true;
    }
        return false;
    }

    private boolean isTheSumOfTheColumnIsNotEquals(int[][] a) {
        for (int i = 1; i < a.length; i++) {

            int column1 = (sumOfTheColumn(a, i - 1));
            int column2 = (sumOfTheColumn(a, i));

            if (column1 != column2) {
                return true;
            }

        }


        return false;
    }

    private int sumOfTheColumn(int[][] a, int i) {
        int counter = 0;

        for (int b = 0; b < a.length; b++) {
            counter += a[b][i];
        }


        return counter;
    }

    private boolean isTheSumOfTheRowsNotEquals(int[][] a) {
        for (int i = 1; i < a.length; i++) {

            int row1 = sumOfTheRow(a, i - 1);
            int row2 = sumOfTheRow(a, i);

            if (row1 != row2) {
                return true;
            }
        }
        return false;
    }

    private boolean isNotCubic(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != a.length) {
                return true;
            }
        }
        return false;
    }

    private int sumOfTheRow(int[][] a, int i) {
        int counter = 0;

        for (Integer item : a[i]
        ) {
            counter += item;

        }
        return counter;
    }
}
