public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,56,67,89,90,109};
        int target = 90;
        System.out.println("index of "+target+" in the given array is "+search(arr,target));
    }
    static int search(int[]arr, int target){
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while(startIndex<=endIndex){
            int mid = startIndex + (endIndex-startIndex)/2;
            if(arr[mid]>target){
                endIndex= mid-1;
            } else if (arr[mid]<target) {
                startIndex=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
