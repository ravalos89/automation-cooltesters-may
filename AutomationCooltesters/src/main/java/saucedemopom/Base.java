package saucedemopom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.Duration;

public class Base {
    private WebDriver driver;

    // Acciones a los elementos
    /*
    click, sendkeys, selectdropdown, checkbox, launchbrowser, chromedriver setup, wait methods, findelement, input
     */

    // Constructor
    public Base(WebDriver driver){
        this.driver = driver;
    }

    /*
    Method setup chromedriver
     */
    public WebDriver setupChromedriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        // incognito
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }

    /*
    Method setup firefox
     */
    public WebDriver setupFirefoxdriver(){
        driver = new FirefoxDriver();
        return driver;
    }

    /*
    Launch browser
     */
    public void launchBrowser(String url){
        try{
            // Block code
            log(">>>> Info: Launching... "+url);
            driver.get(url);
        }catch(TimeoutException e){
            // Block code
            e.printStackTrace();
        }
    }

    /*
    Reporting log
     */
    public void log(String message){
        Reporter.log(message);
    }

    /*
    Type(sendkeys)
     */
    public void type(String inputText, By locator){
        try{
            driver.findElement(locator).sendKeys(inputText);
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
    }

    /*
    click
     */
    public void click(By locator){
        try{
            driver.findElement(locator).click();
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
    }

    // Implicit wait
    public void implicitWait(){
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GlobalVariables.GENERAL_TIMEOUT));
        }catch(TimeoutException e){
            e.printStackTrace();
        }
    }

    // Implicit wait (Overloading)
    public void implicitWait(int timeout){
        try{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
        }catch(TimeoutException e){
            e.printStackTrace();
        }
    }

    // Explicit wait
    public void waitForElementPresent(By locator){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVariables.GENERAL_TIMEOUT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch(TimeoutException e){
            e.printStackTrace();
        }
    }

    public void waitForElementNotPresent(By locator){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVariables.GENERAL_WAIT_FOR_ELEMENT_NOT_PRESENT));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        }catch(TimeoutException e){
            e.printStackTrace();
        }
    }

    public boolean isElementDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public String getText(By locator){
        try{
            return driver.findElement(locator).getText();
        }catch(NoSuchElementException e){
            e.printStackTrace();
            return null;
        }
    }

    public void driverClose(){
        try{
            driver.close();
        }catch (NoSuchSessionException e){
            e.printStackTrace();
        }
    }

    /**
     * Get Data from JSON file (Directly)
     *
     * @author Ricardo Avalos
     * @param jsonFileObj, jsonKey
     * @return jsonValue
     * @throws FileNotFoundException
     */
    public String getJSONValue(String fileName, String jsonFileObj, String jsonKey) {
        try {

            // JSON Data
            InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + fileName + ".json");
            JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

            // Get Data
            String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);
            return jsonValue;
        } catch (FileNotFoundException e) {
            Assert.fail("JSON file is not found");
            return null;
        }
    }

    /*
     * Take screenshot
     *
     * @author Ricardo Avalos
     * @throws IOException
     */
    public String takeScreenshot(String fileName){
        try {
            String pathFileName= GlobalVariables.PATH_EXTENT + fileName + ".png";
            Screenshot screenshot = new AShot().takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "PNG", new File(pathFileName));
            return pathFileName;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
