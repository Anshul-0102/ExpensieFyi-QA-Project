import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://expense.fyi/login");
        driver.findElement(By.name("email")).sendKeys("test@example.com");
        driver.findElement(By.name("password")).sendKeys("test1234");
        driver.findElement(By.tagName("button")).click();
        driver.quit();
    }
}
