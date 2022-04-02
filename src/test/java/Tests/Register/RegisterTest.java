package Tests.Register;

import Tests.AbstractBaseTest.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.Map;

import static Builder.PageBuilder.*;


@CucumberOptions(
        strict = true,
        monochrome = true,
        features = "classpath:RegisterTest.feature",
        plugin = {"pretty"}
)
public class RegisterTest extends TestBase {


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

    @Given("^The user clicks on register button fill the form with email (.*) and password (.*)$")
    public void theUserClicksOnRegisterButton(String email, String pass) throws InterruptedException {
        getRegisterPage().fillForm(email,pass);
    }

    @When("^check terms and conditions box and clicks on create account button$")
    public void userClicksOnCreateAccountButton() throws Throwable {
        getRegisterPage().CheckTermsAndCreateAccount();
    }

    @And("^User registered succesfully on Fortesza page and click on continue$")
    public void userRegisteredSuccesfullyOnForteszaPage() throws Throwable {
        getRegisterPage().continueButtonAndFinalizeRegister();
        System.out.println("User registered succesfully");
    }

    @Then("^User fill form with basic information:$")
    public void userFillFormWithBasicInformation(List<Map<String, String>> data) throws Throwable {
        getBasicInformationPage().fillFormBasicInformation(data);
        getBasicInformationPage().fillFormPersonalInformation(data);
        getBasicInformationPage().fillFormResidenceInformation(data);

        Thread.sleep(5000);
    }




}
