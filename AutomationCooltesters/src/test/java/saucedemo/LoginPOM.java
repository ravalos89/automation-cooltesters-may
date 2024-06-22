package saucedemo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import poc.LoginPage;
import poc.ProductsPage;
import saucedemopom.Base;
import saucedemopom.GlobalVariables;

public class LoginPOM {

    WebDriver driver;
    Base base;
    LoginPage loginPage;
    ProductsPage productsPage;
    String validUser, validPwd, invalidUser;

    @BeforeTest
    public void beforeTest(){
        base = new Base(driver);
        driver = base.setupChromedriver();
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        // Get Test data
        validUser = base.getJSONValue("LoginData", "validUser", "username");
        invalidUser = base.getJSONValue("LoginData", "invalidUser", "username");
        validPwd = base.getJSONValue("LoginData", "validUser", "password");
    }

    @AfterTest
    public void afterTest(){
        base.driverClose();
    }

    @Test
    public void test001(){
        /*
        1- Enter valid username
        2- Enter valid password
        3- click login button
        4- Validate users is logged successfully
         */
        // Launch browser
        base.launchBrowser(GlobalVariables.SAUCE_URL);
        loginPage.loginSauce(validUser, validPwd);

        Assert.assertTrue(productsPage.isUserLogged(), "Validate user is logged");
    }

    @Test
    public void test002(){
        /*
        1- Enter invalid username
        2- Enter valid password
        3- click login button
        4- Validate error message
         */

        String expectedResult = "Epic sadface: Username and password do not match any user in this service";
        // Launch browser
        base.launchBrowser(GlobalVariables.SAUCE_URL);

        loginPage.loginSauce(invalidUser, validPwd);

        Assert.assertTrue(loginPage.validateInvalidUserErrorMessage(expectedResult), "Validate error message");
    }
}
