import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class MouseAction {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "/Users/apurbapodder/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);


        //Hover Over
        WebElement element = driver.findElement(By.id("elementId"));
        actions.moveToElement(element).perform();

        //Drag and Drop
        WebElement source = driver.findElement(By.id("sourceId"));
        WebElement target = driver.findElement(By.id("targetId"));
        actions.dragAndDrop(source, target).perform();

        //Right click (context click)
        actions.contextClick(element).perform();

        //double click
        actions.doubleClick(element).perform();

        // Mouse Hover and Click a Submenu
        WebElement menu = driver.findElement(By.id("mainMenu"));
        WebElement submenu = driver.findElement(By.id("subMenu"));

        actions.moveToElement(menu).perform(); // Hover over main menu
        submenu.click(); // Click submenu

        //Move Mouse by Offset
        actions.moveByOffset(100, 200).perform();

        //Scroll Using Actions Class
        actions.scrollByAmount(0, 500).perform(); // Scroll down 500 pixels

        //Scroll Using JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        //Handle Tooltip (Hover and Retrieve Text)
        WebElement tooltip = driver.findElement(By.id("tooltip"));
        actions.moveToElement(tooltip).perform();

        String tooltipText = tooltip.getText();
        System.out.println("Tooltip text: " + tooltipText);

        //Perform Click-and-Hold Without Releasing
        WebElement element1 = driver.findElement(By.id("holdButton"));
        actions.clickAndHold(element1).perform(); // Click and hold
//        Thread.sleep(3000);
        actions.release().perform(); // Release after 3 seconds

        //Click Element Using JavaScript (If Normal Click Fails)
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", element);

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("");
        FileUtils.copyFile(srcFile, destFile);

    }
}
