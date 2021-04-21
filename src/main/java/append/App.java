package append;


public class App {
    public int[] append(int[] a1, int[] a2) {

        int[] append = new int[a1.length + a2.length];

        System.arraycopy(a1, 0, append, 0, a1.length);
        System.arraycopy(a2, 0, append, a1.length, a2.length);

        return append;
    }
}
