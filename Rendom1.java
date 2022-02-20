import java.util.Arrays;
import java.util.Random;

/**
 * Created by HP on 20/01/2022.
 */
public class Rendom1 {
    public static int[] rem(int[] x)
    {
        Random r = new Random();
        int index = r.nextInt(x.length-1);
        System.out.println(index);
        for (int i = 0; i < x.length; i++) {
            if (index <= i )
            {
                x[i] = -1;
            }

        }
        return x;
    }
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        System.out.println( Arrays.toString(rem(a)));
    }

}
