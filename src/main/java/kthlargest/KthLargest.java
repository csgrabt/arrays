package kthlargest;

public class KthLargest {
    public int kthLargest(int[] numbers, int k) {

        for (Integer item : numbers
        ) {
            int counter = 0;
            for (Integer item2 : numbers
            ) {
                if (item < item2) {
                    counter++;
                }
            }
            if (counter == k) {
                return item;
            }
        }
        throw new IllegalArgumentException("No results to display");
    }
}
