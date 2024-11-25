public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,34,56,6,78};
        int a=5;
        System.out.println(search(arr,a));
    }

    static int search(int [] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}
