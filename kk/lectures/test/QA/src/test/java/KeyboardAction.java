import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAction {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/apurbapodder/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
    try {
    // Open webpage
    driver.get("https://example.com");

//    // Wait for the input field to be visible
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("inputField")));
//
//    // Send Keys: Select All (Mac uses COMMAND, Windows/Linux uses CONTROL)
//    element.sendKeys(Keys.chord(Keys.COMMAND, "a")); // Select all
//
//    // Press ENTER using Actions class
//    Actions actions = new Actions(driver);
//    actions.sendKeys(Keys.ENTER).perform();
//
//    // Perform Cut, Copy, Paste
//    element.sendKeys(Keys.chord(Keys.COMMAND, "x")); // Cut
//    element.sendKeys(Keys.chord(Keys.COMMAND, "c")); // Copy
//    element.sendKeys(Keys.chord(Keys.COMMAND, "v")); // Paste
//
//    // Move to next field using TAB
//    element.sendKeys(Keys.TAB);
//
//    // Press ENTER and ESCAPE
//    element.sendKeys(Keys.ENTER);
//    element.sendKeys(Keys.ESCAPE);

       // Type in a field and submit using Enter key
        WebElement field = driver.findElement(By.id("id"));
        field.sendKeys("text");
        field.sendKeys(Keys.ENTER);

        //Copy text from one input field and paste into another
        WebElement firstInput = driver.findElement(By.id("firstInputId"));
        firstInput.sendKeys("Hello Selenium!");
        firstInput.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select All
        firstInput.sendKeys(Keys.chord(Keys.CONTROL, "c")); // Copy

        WebElement secondInput = driver.findElement(By.id("secondInputId"));
        secondInput.click();
        secondInput.sendKeys(Keys.chord(Keys.CONTROL, "v")); // Paste

        //Perform Shift key operation (Type in Uppercase)
        Actions actions = new Actions(driver);
        WebElement inputField = driver.findElement(By.id("inputId"));

        actions.keyDown(Keys.SHIFT).sendKeys(inputField, "selenium").keyUp(Keys.SHIFT).perform(); // Output: SELENIUM

        //Open a link in a new tab using keyboard shortcuts (Ctrl + Click)
        actions.keyDown(Keys.COMMAND).click(inputField).keyUp(Keys.COMMAND).perform();

        //Handle pop-ups using ESC key
        actions.sendKeys(Keys.ESCAPE).perform();

        //Simulate Tab key navigation between input fields
        WebElement firstInput1 = driver.findElement(By.id("first"));
        firstInput1.sendKeys("First Input");
        firstInput1.sendKeys(Keys.TAB); // Moves focus to next field

        WebElement secondInput1 = driver.switchTo().activeElement();
        secondInput1.sendKeys("Second Input");

        //Simulate form submission using Enter key
        WebElement inputField1 = driver.findElement(By.id("searchBox"));
        inputField1.sendKeys("Selenium");
        inputField1.sendKeys(Keys.ENTER); // Submits the form

        // Select dropdown options using Arrow keys
        WebElement dropdown = driver.findElement(By.id("dropdownId"));
        dropdown.click();
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ARROW_DOWN);
        dropdown.sendKeys(Keys.ENTER);

        //Press Ctrl+S to trigger "Save As" dialog (not handled by Selenium directly)
        actions.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();
        //or
        inputField.sendKeys(Keys.chord(Keys.COMMAND, "s"));

        //Handle file uploads using Robot class
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
/*
        📌 Theory Questions
        1. What are keyboard actions in Selenium WebDriver?

                Keyboard actions in Selenium allow automation of keystrokes like typing, shortcuts (Ctrl+C, Ctrl+V), navigation, and special key handling using the Keys class and Actions class.

        2. How do you perform keyboard operations in Selenium WebDriver?

                Using sendKeys() for simple typing.
                Using Keys class for special keys (e.g., Keys.ENTER, Keys.TAB).
                Using Actions class for complex keyboard interactions (keyDown(), keyUp(), sendKeys()).

        3. What is the difference between sendKeys() and Actions class for keyboard events?

        sendKeys() is used directly with elements for simple typing.
        Actions class is used for advanced interactions like key combinations (Ctrl+A).

        4. How do you simulate pressing Enter, Tab, or Backspace in Selenium?

                element.sendKeys(Keys.ENTER);
        element.sendKeys(Keys.TAB);
        element.sendKeys(Keys.BACK_SPACE);

        5. How do you handle keyboard shortcuts in Selenium?

        Using Keys.chord(Keys.CONTROL, "a") for multiple keys together.
                Using Actions class for more flexibility.

        6. How do you copy-paste using Selenium?

        element.sendKeys(Keys.chord(Keys.CONTROL, "a")); // Select All
        element.sendKeys(Keys.chord(Keys.CONTROL, "c")); // Copy
        targetElement.sendKeys(Keys.chord(Keys.CONTROL, "v")); // Paste

        7. How do you simulate holding a key and releasing it later?

                Using Actions class:

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys("hello").keyUp(Keys.SHIFT).perform(); // HELLO

        8. How do you automate pressing multiple keys at once?

                Using Keys.chord() or Actions.keyDown() + keyUp().

        9. Can sendKeys() work without an element?

                No, sendKeys() requires an element.
                For global key events, use Robot class.

        10. What is the Robot class in Java, and how does it help in keyboard automation?

        The Robot class simulates real keyboard and mouse actions at the OS level.
        Used for file uploads, pop-ups, and system-wide key events.

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        */


    } catch (AWTException e) {
        throw new RuntimeException(e);
    } finally {
    driver.quit();
    }


    }
}
