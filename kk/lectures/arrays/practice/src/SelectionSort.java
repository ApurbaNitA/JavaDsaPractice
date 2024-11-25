import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-i-1;
            int maxIndex = max(arr,0,lastIndex);
            int temp=arr[lastIndex];
            arr[lastIndex]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
    }

    private static int max(int[] arr, int startIndex, int lastIndex) {
        int max = startIndex;
        for (int i = startIndex; i <=lastIndex ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
