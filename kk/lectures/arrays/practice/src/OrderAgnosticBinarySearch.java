public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,4,56,67,89,90,109};
        int [] arr1 = {109,104,90,80,78,56,45,34,12,1};
        int target = 90;
        System.out.println("index of "+target+" in the given array is "+search(arr1,target));
    }
    static int search(int[]arr, int target){
        int startIndex = 0;
        int endIndex = arr.length - 1;
        boolean async = arr[startIndex]<arr[endIndex];
        while(startIndex<=endIndex){
            int mid = startIndex + (endIndex-startIndex)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(async){
                if (arr[mid] > target) {
                    endIndex = mid - 1;
                } else if (arr[mid] < target) {
                    startIndex = mid + 1;
                }
            }else{
                if (arr[mid] < target) {
                    endIndex = mid - 1;
                } else if (arr[mid] > target) {
                    startIndex = mid + 1;
                }
            }
        }
        return -1;
    }
}
