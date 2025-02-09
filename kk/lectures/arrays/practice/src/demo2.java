import java.util.HashMap;

public class demo2 {

//   all webelements with 9 tyes of locators. all popups
//           mouse, keyboard, contextclick, javascriptexecutor, all popups, auto, IT, calender
//           testng annotations, restassured api annotations

   public static void main(String[] args) {
      String str = "Apurba Podder";
      String [] arr = str.split("\\s+");
       for (String s : arr) {
//           s = s.toLowerCase();
           char ch = s.charAt(0);
           char ch1 = Character.toLowerCase(ch);
           System.out.println(ch1);
       }
       str=str.toLowerCase();
       HashMap <Character, Integer> map = new HashMap<>();
       for (int i = 0; i < str.toCharArray().length; i++) {
           for (int j = i+1; j < str.toCharArray().length; j++) {
               int count=1;
               if(str.toCharArray()[i] == str.toCharArray()[j]){
                   count++;
                   map.put(str.toCharArray()[i],count);
                   System.out.println("duplicate: "+str.toCharArray()[i]);
               }
           }
       }
       System.out.println(map);

   }

}
