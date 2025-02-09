import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apurbapodder/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://example.com");

        List<WebElement> inputBoxes = driver.findElements(By.xpath("//http"));
        List<WebElement> submitButtons = driver.findElements(By.xpath("//http"));
        for (int i = 3; i < inputBoxes.size(); i++) {
            inputBoxes.get(i).sendKeys("Apurba");
            submitButtons.get(i).click();
        }
        driver.quit();
    }
}
