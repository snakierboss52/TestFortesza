package Pages.Register;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/app-root[1]/app-principal-layout[1]/app-navbar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[6]/button[2]/span[1]/div[1]")
    private WebElement registerButton;

    @FindBy(xpath = "//input[@id='input-email-register']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@id='input-password-register']")
    private WebElement txtPassword;

    @FindBy(xpath = "//body/app-root[1]/app-register[1]/div[3]/mat-card[1]/mat-card-content[1]/form[1]/div[1]/mat-checkbox[1]/label[1]/div[1]")
    private WebElement termsAndConditionsCheckBox;

    @FindBy(xpath = "//button[@id='btn-register-user']")
    private WebElement createAccountButton;

    @FindBy(xpath = "//button[contains(text(),'Continuar')]")
    private WebElement continueButton;

    public void fillForm(String email,String pass) throws InterruptedException {
        Thread.sleep(1000);
        registerButton.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(pass);
        Thread.sleep(1000);
    }

    public void CheckTermsAndCreateAccount() throws InterruptedException {
        termsAndConditionsCheckBox.click();
        createAccountButton.click();
        Thread.sleep(8000);
    }

    public void continueButtonAndFinalizeRegister() throws InterruptedException {
        continueButton.click();
        Thread.sleep(2000);
    }

}
