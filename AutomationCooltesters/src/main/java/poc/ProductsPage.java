package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import saucedemopom.Base;

public class ProductsPage extends Base {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    By frmProductsHeader = By.className("app_logo");

    public boolean isUserLogged(){
        return isElementDisplayed(frmProductsHeader);
    }
}
