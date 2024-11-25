import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "apurba";
        char target = 'a';
        int start=1;
        int end=5;
        System.out.println(search(name, target, start, end));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search1(name,target));
    }
    static int search(String str, char target, int start, int end){
        if (str.isEmpty()){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    static boolean search1(String str, char target){
        if(str.isEmpty()){
            return  false;
        }
        for (char ch: str.toCharArray()) {
            if(target == ch){
                return true;
            }
        }
        return false;
    }

}
