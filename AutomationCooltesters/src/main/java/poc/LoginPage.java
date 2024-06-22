package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import saucedemopom.Base;

public class LoginPage extends Base {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // POC = Page Object Class
    /*
    * Object
    * Metodos customizados
     */

    By txtUsername = By.xpath("//input[@data-test='username']");
    By txtPassword = By.xpath("//input[@data-test='password']");
    By btnLogin = By.xpath("//*[@data-test='login-button']");
    By lblErrorMessageInvalidUser = By.xpath("//h3[@data-test='error']");

    public void loginSauce(String username, String password){
        type(username, txtUsername);
        type(password, txtPassword);
        click(btnLogin);
        implicitWait();
    }

    public boolean validateInvalidUserErrorMessage(String expectedErrorMsg){
        if(expectedErrorMsg.equalsIgnoreCase(getText(lblErrorMessageInvalidUser))){
            return true;
        }
        return false;
    }
}
