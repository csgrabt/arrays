package collapse;


public class Collapsing {


    public int[] collapse(int[] a1) {

        int[] result;

        result = setTheLengthOfResultArray(a1);

        fillTheResultArray(a1, result);

        lastIndexOfResultArray(a1, result);

        return result;
    }

    private int[] setTheLengthOfResultArray(int[] a1) {
        int[] result;
        if (a1.length % 2 == 0) {
            result = new int[a1.length / 2];
        } else {
            result = new int[a1.length / 2 + 1];
        }
        return result;
    }

    private void fillTheResultArray(int[] a1, int[] result) {
        int counter = 0;
        for (int i = 0; i < a1.length - 1; i += 2) {
            result[counter] = a1[i] + a1[i + 1];
            counter++;

        }
    }

    private void lastIndexOfResultArray(int[] a1, int[] result) {
        if (a1.length % 2 == 1) {
            result[result.length - 1] = a1[a1.length - 1];
        }
    }


}
