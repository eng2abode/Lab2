import java.util.Arrays;

/**
 * Created by HP on 20/01/2022.
 */
public class Revers {
    public static int[] revers(int[] y)
    {
        int s = y.length-1;
        for (int i = 0; i <y.length/2 ; i++) {
            int t = y[i];
            y[i] = y[s-i];
            y[s-i] = t;
        }
        return y;
    }

    public static void main(String[] args) {
        int[] x ={1,2,3,4,5,6};
        System.out.println( Arrays.toString(revers(x)));
    }
}


