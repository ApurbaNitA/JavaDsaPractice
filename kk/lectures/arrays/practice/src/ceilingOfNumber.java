public class ceilingOfNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,7,9,12,23,45,67,89,90};
        int target = 70;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int [] arr, int target){
        int s=0;
        int e= arr.length-1;

        boolean asc= arr[e]>arr[s];

        while(s<=e){
            int mid = s + (e-s)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(asc) {
                if (target > arr[mid]) {
                    s = mid + 1;
                } else if (target < arr[mid]) {
                    e = mid - 1;
                }
            }else {
                if (target < arr[mid]) {
                    s = mid + 1;
                } else if (target > arr[mid]) {
                    e = mid - 1;
                }
            }
        }
        return s;
        //floor of a number: return e
    }
}
