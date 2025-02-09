import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//   all webelements with 9 tyes of locators. all popups
//           mouse, keyboard, contextclick, javascriptexecutor, all popups, auto, IT, calender
//           testng annotations, restassured api annotations

public class demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apurbapodder/Downloads/chromedriver-mac-arm64/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the page
        driver.get("https://www.youtube.com/");



//        Thread.sleep(5000);
        driver.quit();
    }
}
