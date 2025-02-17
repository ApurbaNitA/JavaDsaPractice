import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,4,7,9,3,23};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[]arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    static  void  reverse(int[]arr){
        int startIndex = 0;
        int endIndex = arr.length-1;
        while(startIndex<endIndex){
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }


}
