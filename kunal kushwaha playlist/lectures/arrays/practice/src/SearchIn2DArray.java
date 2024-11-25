import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr= {
            {1,34,5},
            {45,76,32,90},
            {12,65},
            {87,67,45}
        };
        int target = 65;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(target == arr[row][col]){
                    return new int[]{row, col};
                }
            }

        }

        return null;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    private boolean even(int num) {
        String n= Integer.toString(num);
        int res = n.length();
        if(res%2==0) {
            return true;
        }
        return false;
    }

}
