import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://flipkert.com");
//        Thread.sleep(1000);
//        WebElement mailid = driver.findElement(By.id("loginid"));
//        mailid.sendKeys("apurba@gmail.com");
//        WebElement password = driver.findElement(By.id("password"));
//        password.sendKeys("password");
//        driver.findElement(By.id("sendBtn")).click();
//        JavascriptExecuter js = (JavascriptExecuter) driver;
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//
        String a="143729";
        int n=2;
//        min = 1329;
        System.out.println(findLeastString(a,n));




        int [] arr={1,2,3};
        int sum=4;
        ArrayList<int[]>pairs= sum1(arr,sum);
        for(int[]pair:pairs){
            System.out.println(Arrays.toString(pair));
        }

    }

    public static ArrayList<int[]> sum1(int[] arr, int sum) {
        ArrayList<int[]> list = new ArrayList<>();
        int n = arr.length;
        for (int j : arr) {
            for (int k : arr) {
                if (j + k == sum) {
                     list.add(new int[]{j, k});
                }
            }
        }
        return list;
    }

    public static String findLeastString(String str, int n) {
        // Initialize a StringBuilder to construct the result
        StringBuilder result = new StringBuilder();
        int len = str.length();
        int keep = len - n; // Number of characters to keep

        // Iterate through the string
        for (int i = 0; i < len; i++) {
            // Remove characters from the result if they're greater than the current character
            // and we still have characters to remove
            while (result.length() > 0 && result.charAt(result.length() - 1) > str.charAt(i) && n > 0) {
                result.deleteCharAt(result.length() - 1);
                n--;
            }
            // Add the current character to the result
            result.append(str.charAt(i));
        }

        // Return the first 'keep' characters from the result
        return result.substring(0, keep);
    }


}
