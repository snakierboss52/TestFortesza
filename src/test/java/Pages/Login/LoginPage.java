package Pages.Login;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/app-root[1]/app-principal-layout[1]/app-navbar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[6]/button[1]/span[1]/div[1]/span[1]")
    private WebElement starSession;

    @FindBy(xpath = "//input[@id='txt-email-or-user']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@id='txt-password']")
    private WebElement txtPassword;

    @FindBy(id = "btn-sign-in-page")
    private WebElement btnlogin;


    public void login(String email, String pass) throws InterruptedException {
        Thread.sleep(2000);
        starSession.click();
        Thread.sleep(1000);
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(pass);
        btnlogin.click();
        Thread.sleep(4000);
    }

}
