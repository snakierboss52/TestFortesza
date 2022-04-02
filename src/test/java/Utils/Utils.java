package Utils;

import Pages.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utils extends BasePage {

    public Utils(WebDriver driver) {
        super(driver);
    }

    public void  scroll(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,450)");
    }

}
