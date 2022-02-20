import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HP on 20/01/2022.
 */
public class ArrayOperation {
    public static void main(String[] args) {
        Scanner in=new Scanner( System.in );
        int x[]={11,12,13,14,15};
        int n;
        do {
            System.out.println("print array");
            System.out.println("reverse array");
            System.out.println("shift right");
            System.out.println("shift left");
            n=in.nextInt();
            switch (n){
                case 1:
                    System.out.println(Arrays.toString(x));
                    break;
                case 2:
                    System.out.println("after reverse");
                    System.out.println(Arrays.toString(reverse(x)));
                    break;
                case 3:
                    System.out.println("after shift right");
                    System.out.println(Arrays.toString(shiftRight(x)));
                    break;
                case 4:
                    System.out.println("after shift left");
                    System.out.println(Arrays.toString(shiftLeft(x)));
                    break;
            }
        }while (n!=0);
    }
//    عكس المصفوفة
    public static  int[] reverse(int[]a)
    {
        int n= a.length-1;
        for (int i = 0; i <a.length-1 ; i++) {
            int t= a[i];
            a[i]=a[n];
            a[n]=t;
            n--;
        }
        return a;

    }
//    ازاحة الى اليمين
    public static  int[] shiftRight(int[] b)
    {
        int t= b[b.length-1];
        for (int i = b.length-1; i>0 ; i--) {
            b[i]=b[i-1];
        }
        b[0]=t;
        return b;}
//    ازاحة الى اليسار
    public static  int[] shiftLeft(int[] b)
    {
        int t= b[0];
        for (int i = 0; i <b.length-1 ; i++) {
            b[i]=b[i+1];
        }
        b[b.length-1]=t;
    return b;}
}
