import java.util.Arrays;

/**
 * Created by HP on 20/01/2022.
 */
public class CopyArray {

    public static int[] copy()
    {
        int[] a = {1,2,3,4,5};
        int[] copy = new int[a.length];
        copy = a;
        return copy;
    }

    public static void main(String[] args) {
        System.out.println( "copy ="+Arrays.toString(copy()));
    }
}
