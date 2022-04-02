package Builder;

import Pages.Login.LoginPage;
import Pages.Register.BasicInformationFormPage;
import Pages.Register.RegisterPage;
import Utils.Utils;
import org.openqa.selenium.UnableToSetCookieException;
import org.openqa.selenium.WebDriver;

public class PageBuilder {

    private static LoginPage loginPage;
    private static RegisterPage registerPage;
    private static BasicInformationFormPage basicInformationPage;
    private static Utils util;

    public static void setupPage(WebDriver driver){

        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        basicInformationPage = new BasicInformationFormPage(driver);
        util = new Utils(driver);
    }

    public static LoginPage getLoginPage() {
        return loginPage;
    }
    public static RegisterPage getRegisterPage() {
        return registerPage;
    }
    public static BasicInformationFormPage getBasicInformationPage(){
        return basicInformationPage;
    }
    public static Utils getUtilPage(){
        return util;
    }
}
