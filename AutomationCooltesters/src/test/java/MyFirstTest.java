import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void googleTest() {

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String x = "1";

    }
}
