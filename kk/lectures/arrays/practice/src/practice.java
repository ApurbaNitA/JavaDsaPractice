import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class practice {
    public static void main(String[] args) {
        String str = "Welcome to Sprinkler";
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        int[]arr={0,0,1,1,1,0,1,0,1,1,0,0,0,0,1};
        int[]nums={2,3,1,1,1,0,1,5,1,1,5,6,6,6,1};
        System.out.println(reverse(first, second));
        System.out.println(anagram(first, second));
        System.out.println(nonRepeatingChar("apurba"));
        System.out.println(countOnes(arr));
        findDuplicates(nums);
        System.out.println(Arrays.toString(fibonacci(7)));
        System.out.println(palindrome("karatarak"));
        System.out.println(sum(7,8));
        System.out.println(rotateString("abcde","cdeab"));
    }

    public static String reverse(String str1, String str2) {

     str1 = str1.replaceAll("\\s","");
     str2 = str2.replaceAll("\\s","");
     String rev="";

        for (int i = str1.length()-1; i>=0 ; i--) {
            rev+=str1.charAt(i);
        }

        return (rev+str2);

    }

    static boolean anagram(String s1, String s2){
        char[] str1= s1.toCharArray();
        char[] str2= s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    static char nonRepeatingChar(String str){
        int n=str.length();
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i!=j && str.charAt(i)==str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return str.charAt(i);
            }
        }
        return '$';
    }

    public static int countOnes(int[] arr) {

        int n = arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                count++;
            }
        }

        return count;
    }
    public static void findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
//        for (int num : nums) {
//            if (!seen.add(num)) {
//                System.out.println("Duplicate: " + num);
//            }
//        }
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=j && nums[i]==nums[j]){
                    System.out.println("duplicate: "+nums[i]);
                    break;
                }
            }
        }
    }

    public static int[] fibonacci(int n){
        int[] arr= new int[n];
        if (n == 1) {
            return new int[]{0};
        } else if (n == 2) {
            return new int[]{0,1};
        } else {
            arr[0]=0;
            arr[1]=1;
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    public static boolean palindrome(String str){
//        char[] ch = str.toCharArray();
//        int n = ch.length;
//        for (int i = 0; i <n/2 ; i++) {
//            if (ch[i]!=ch[n-1-i]){
//                return false;
//            }
//        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static int sum(int a, int b){
        int sum =0;
        sum =a+b;
        return sum;
    }

    public static boolean rotateString(String s, String goal) {
        int n = s.length();
//        String abc="";
//        for(int i=0; i<n; i++){
//            abc = s.substring(i, n) + s.substring(0, i);
//            if(goal.equalsIgnoreCase(abc)){
//                return true;
//            }
//        }
        String total = s + s;
        return total.contains(goal);
    }



}



