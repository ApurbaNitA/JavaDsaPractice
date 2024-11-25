import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractise {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(53);
//        list.add(25);
//        list.add(21);
//        list.add(13);
//        list.add(234);
//        list.add(2);
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(5);
//        System.out.println(list);
        Scanner in = new Scanner(System.in);

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }
        for(int i=0; i<5; i++){
            System.out.println( list.get(i));
        }
        System.out.println(list);


    }
}
