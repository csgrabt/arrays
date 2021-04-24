package countinrange;

public class CountInRange {
    public int countInRange(int[] array, int minRange, int maxRange) {
        int counter = 0;

        for (Integer item : array
        ) {
            if (item > minRange && item < maxRange) {
                counter++;
            }

        }


        return counter;
    }
}
