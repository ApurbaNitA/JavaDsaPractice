import java.util.Arrays;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums ={{12,23,45,68},
                       {13,27,47,69},
                       {33,37,57,70}};
        int target =  33;
        System.out.println(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[][]nums, int target){
        int r=0;
        int c=nums.length-1;
        while(r< nums.length && c>=0){
            if(target==nums[r][c]){
                return new int[]{r,c};
            }else if(target<nums[r][c]){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
