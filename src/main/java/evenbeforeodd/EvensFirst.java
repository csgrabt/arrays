package evenbeforeodd;

public class EvensFirst {
    public int[] evenBeforeOdd(int[] ints) {

        for (int i = 0; i < ints.length; i++
        ) {
            if (ints[i] % 2 != 0) {

                int number = ints[i];

                changeTheValues(ints, i, number);
            }
        }
        return ints;
    }

    private void changeTheValues(int[] ints, int i, int number) {
        for (int b = i; b < ints.length; b++) {
            if (ints[b] % 2 == 0) {
                ints[i] = ints[b];
                ints[b] = number;
                return;
            }
        }
    }


}
