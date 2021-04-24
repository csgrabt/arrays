package issorted;

public class Sorter {
    public static boolean isSorted(double[] doubles) {
        if (doubles.length == 1) {
            return true;
        }

        for (int i = 1; i < doubles.length; i++) {

            if (doubles[i - 1] > doubles[i]) {
                return false;
            }
        }
        return true;
    }
}
