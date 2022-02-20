import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HP on 20/01/2022.
 */
public class ArraysOperation2 {
    int x[];
    int numOfElements;

    public ArraysOperation2() {
        x=new int[5];
        numOfElements=0;}


    public static void main(String[] args) {
        ArraysOperation2 test = new ArraysOperation2();
        Scanner in = new Scanner( System.in );

        int n;
        do {
            System.out.println( "print array" );
            System.out.println( "reverse array" );
            System.out.println( "shift right" );
            System.out.println( "shift left" );
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println( "input elements" );
                    for (int i = 0; i < 7; i++) {
                        if (test.addSorted( in.nextInt() ) == 0)
                            System.out.println( "added sucessfuly" );
                        else
                            System.out.println( "arry is full" );
                        System.out.println( Arrays.toString( test.x ) );
                    }

                    break;
                case 2:
                    System.out.println( "input index for delete" );
                    for (int i = 0; i < 7; i++) {
                        if (test.deleteSorted( in.nextInt() ) == 0)
                            System.out.println( "deleted sucessfuly" );
                        else
                            System.out.println( "arry is empty" );
                        System.out.println( Arrays.toString( test.x ) );
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;}
            }while (n != 0);
    }

    private int deleteSorted(int idex)
    {
        if(numOfElements>0&& idex>=0)
        {
            int i= idex;
            while (i<numOfElements-1 )
            {
                x[i]=x[i+1];
                i++;
            }
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0 ;
        }
        return -1;
    }
    public int delete(    )
    {
        if(numOfElements>0)
        {
            x[numOfElements-1]=-1;
            numOfElements--;
            return 0 ;
        }
        return -1;
    }
    public int add(int e)
    {
        if (numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

//    اضافة عنصر الى المصفوفة
    public int addSorted(int e)
    {
        if (numOfElements<x.length) {
            int i=numOfElements;

            while(i>0&&e<x[i-1])
            { x[i]=x[i-1];
                i--; }

            x[i]=e;
            numOfElements++;
            return 0;
        }
        return -1;

    }}



