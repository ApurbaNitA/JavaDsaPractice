import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        //https://www.cleartrip.com/flights/international/results?adults=1&childs=0&infants=0&depart_date=18/03/2025&return_date=01/04/2025&intl=y&from=BOM&to=DXB&airline=&carrier=&sd=1738392165650&page=&sellingCountry=IN&ssfi=&flexi_search=&ssfc=&origin=BOM%20-%20Mumbai,%20IN&destination=DXB%20-%20Dubai,%20AE&class=Economy&sft=&utm_source=affinity&utm_medium=affiliate&utm_campaign=Affinity_flights

        System.setProperty("webdriver.chrome.driver", "/Users/apurbapodder/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com/flights/international/results?adults=1&childs=0&infants=0&depart_date=18/03/2025&return_date=01/04/2025&intl=y&from=BOM&to=DXB&airline=&carrier=&sd=1738392165650&page=&sellingCountry=IN&ssfi=&flexi_search=&ssfc=&origin=BOM%20-%20Mumbai,%20IN&destination=DXB%20-%20Dubai,%20AE&class=Economy&sft=&utm_source=affinity&utm_medium=affiliate&utm_campaign=Affinity_flights");

        Thread.sleep(20000);

//        driver.Manage().Window.Maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0, 200)");


        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/div[9]/div/div[1]/div[1]/div/div/div[4]/div/div[2]"));
        element.click();
        Thread.sleep(2000);
        WebElement text = driver.findElement((By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div[2]/div[9]/div/div[1]/div[1]/div/div/div[7]/div[2]/div[2]/div[2]/div[2]/div[1]/span[2]/span[1]")));
        String getText = text.getText();
        System.out.println(getText);

        driver.quit();
    }
}
