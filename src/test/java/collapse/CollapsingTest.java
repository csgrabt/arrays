package collapse;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class CollapsingTest {

    @Test
    void collapse() {
        Collapsing c = new Collapsing();
        int[] a1 =new int[]{7,2,8,9,4,13,7,1,9,10};
        int[] a2 =new int[]{9,17,17,8,19};

        int[] b1 =new int[]{1,2,3,4,5};
        int[] b2 =new int[]{3,7,5};

        int[] d1 =new int[]{2,2,2,2};
        int[] d2 =new int[]{4,4};

        int[] c1 =new int[]{7,2,8,9,4,13,7,1,0,0};
        int[] c2 =new int[]{9,17,17,8,0};

        assertArrayEquals(a2, c.collapse(a1));
        assertArrayEquals(b2, c.collapse(b1));
        assertArrayEquals(d2, c.collapse(d1));
        assertArrayEquals(c2, c.collapse(c1));

    }
}
