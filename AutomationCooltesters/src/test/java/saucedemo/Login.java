package saucedemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login {

    // LINEAR SCRIPTING

    @Test
    public void test001(){

        /*
        1- Enter valid username
        2- Enter valid password
        3- click login button
        4- Validate users is logged successfully
         */

        // Setup Chrome driver
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        //Launch browser
        driver.get("https://www.saucedemo.com/");

        // Test Steps
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@data-test=\"login-button\"]")).click();

        // Espera Implicita - esta relacionado al DOM
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // timeout

        // Espera Explicita - esta relacionada a un objeto en especifico
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo")));
        boolean isCarritoDisplayed;
        // Try/Catch
        try{
            isCarritoDisplayed = driver.findElement(By.id("shopping-cart-container")).isDisplayed();
        }catch(Exception e){
            e.printStackTrace();
            isCarritoDisplayed = false;
        }

        Assert.assertTrue(isCarritoDisplayed, "Validate users is logged successfully"); // VALIDACION
    }

    @Test
    public void test002(){

        /*
        1- Enter invalid username
        2- Enter valid password
        3- click login button
        4- Validate error message
         */

        // Setup Chrome driver
        String expectedResult = "Epic sadface: Username and password do not match any user in this service";
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        //Launch browser
        driver.get("https://www.saucedemo.com/");

        Reporter.log(">>>> Info: User navigate https://www.saucedemo.com/");

        // Test Steps
        Reporter.log(">>>> Info: Enter username");
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("invalid_user");
        Reporter.log(">>>> Info: Enter password");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@data-test=\"login-button\"]")).click();
        Reporter.log(">>>> Info: Clicked Login button");

        String actualResult = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

        Assert.assertEquals(actualResult, expectedResult, "Validate Error message for invalid user");
        //Assert.assertTrue(actualResult.contains(expectedResult), "Validate Error message for invalid user"); // Regular expressions

        driver.close(); // Cerrar las ventanas

    }

    @Test
    public void test003(){
        // Validar cuando no se mandan valores(empty) en el username y password.

        // Setup Chrome driver
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        //Launch browser
        driver.get("https://www.saucedemo.com/");

        // Test Steps
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("");
        driver.findElement(By.xpath("//*[@data-test=\"login-button\"]")).click();

        String expectedResult = "Epic sadface: Username is required";
        String actualResult = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();

        Assert.assertEquals(actualResult, expectedResult, "Validar cuando no se mandan valores(empty) en el username y password");

        driver.close();
    }

    @Test
    public void test004(){
        // Validate lock user is not able to login.
    }

    @Test
    public void test005(){
        // Validar que el username no contenga mas de 20 caracters.
    }

}
