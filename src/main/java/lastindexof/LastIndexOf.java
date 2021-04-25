package lastindexof;

public class LastIndexOf {
    public int lastIndexOf(int[] numbers, int i) {
        int index = -1;

        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] == i) {
                index = k;
            }
        }

        return index;
    }
}
