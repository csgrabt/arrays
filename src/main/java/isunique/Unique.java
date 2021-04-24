package isunique;

import java.util.Arrays;

public class Unique {
    public boolean isUnique(int[] ints) {

        Arrays.sort(ints);
        for (int i = 1; i < ints.length; i++) {

            if (ints[i - 1] == ints[i]) {
                return false;
            }
        }
        return true;
    }
}
