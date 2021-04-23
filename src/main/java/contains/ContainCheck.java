package contains;

import java.util.Arrays;

public class ContainCheck {
    public static boolean contains(int[] a1, int[] a2) {
        if (a1.length < a2.length - 1) {
            return false;
        }
        if (Arrays.equals(a1, a2)) {
            return true;
        }

        for (int i = 0; i < a1.length - a2.length; i++) {
            int[] temp = new int[a2.length];
            for (int b = i; b < i + a2.length; b++) {
                temp[b - i] = a1[b];
            }
            if (Arrays.equals(temp, a2)) {
                return true;
            }
        }
        return false;
    }

}
