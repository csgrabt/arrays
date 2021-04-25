package longestsortedsequence;

public class Sequence {
    public int longestSortedSequence(int[] ints) {
        if (ints.length == 0) {
            return 0;
        }
        int counter = 1;
        int subCounter = 1;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] <= ints[i + 1]) {
                subCounter++;
            } else {
                subCounter = 1;
            }
            if (counter < subCounter) {
                counter = subCounter;
            }

        }


        return counter;
    }
}
