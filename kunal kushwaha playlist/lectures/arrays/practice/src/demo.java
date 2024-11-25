import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        int[][] arr = new int[5][2];
        Scanner in = new Scanner(System.in);
        for(int row=0 ; row< arr.length ; row++){
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=in.nextInt();
            }
        }

        //one way to print 2D ARRAY
        for (int[] its : arr) {
            for (int anInt : its) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        /*
        Another way to print 2D Array
        for (int[] i :arr1) {
            System.out.println(Arrays.toString(i));
        }
        */

        /*
        Another way to print 2D Array
        for(int row=0 ; row< arr.length ; row++){
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        */

        //Dynamic Array
        int [][] arr1 = {
                {1,2,3,4},
                {2,3},
                {5,6,7,8,9}
        };

        for (int[] i :arr1) {
            System.out.println(Arrays.toString(i));
        }
//        System.out.println(Arrays.toString(arr));
    }
}
