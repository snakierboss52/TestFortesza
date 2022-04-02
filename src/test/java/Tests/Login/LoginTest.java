package Tests.Login;

import Tests.AbstractBaseTest.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;


import static Builder.PageBuilder.getLoginPage;
import static Builder.PageBuilder.setupPage;

@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:LoginTest.feature",
        plugin = {"pretty"}
)
public class LoginTest extends TestBase {

    @Override
    public String getName() {
        return null;
    }

    @Given("^Get configuration driver for the login automation$")
    public void setUpPage() {
        if (TestBase.firtsLaunch){
            TestBase.firtsLaunch = false;
        }else {
            driver.quit();
            driver = setDriver();
        }
        setupPage(driver);
    }

    @Given("^The user login in the page with email (.*) and password (.*)$")
    public void theUserLoginInThePageWithUserUserAndPasswordPass(String email, String pass) throws InterruptedException {
        getLoginPage().login(email, pass);
    }
}
