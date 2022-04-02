package Pages.Register;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static Builder.PageBuilder.getUtilPage;

public class BasicInformationFormPage extends BasePage {

    public BasicInformationFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[4]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement firstName;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[5]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement secondName;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[6]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement lastName;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[7]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement secondLastName;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[8]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
    private WebElement genre;

    @FindBy(xpath = "//span[contains(text(),'Masculino')]")
    private WebElement male;

    @FindBy(xpath = "//span[contains(text(),'Femenino')]")
    private WebElement female;

    @FindBy(xpath = "//span[contains(text(),'Prefiero no responder')]")
    private WebElement noResponse;

    @FindBy(xpath = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[9]/app-question[1]/div[1]/div[1]/div[1]/ngx-intl-tel-input[1]/div[1]/div[1]/div[1]/div[3]")
    private WebElement phoneCode;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='country-search-box']")
    private WebElement searchCountry;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[1]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[9]/app-question[1]/div[1]/div[1]/div[1]/ngx-intl-tel-input[1]/div[1]/div[1]/div[2]/ul[1]/li[50]")
    private WebElement codeColmbia;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[2]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[1]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
    private WebElement documentType;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
    private WebElement passport;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[2]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[3]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement documentNumber;

    @FindBy(xpath = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[2]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[4]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
    private WebElement maritalStatus;

    @FindBy(xpath = "//span[contains(text(),'Soltero/a')]")
    private WebElement singleStatus;

    @FindBy(xpath = "//span[contains(text(),'Casado/a')]")
    private WebElement marriedStatus;

    @FindBy(xpath = "//span[contains(text(),'Viudo/a')]")
    private WebElement widowerStatus;

    @FindBy(xpath = "//body/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[2]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[5]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
    private WebElement date;

    @FindBy(xpath = "//tbody/tr[5]/td[3]/div[1]")
    private WebElement day;

    @FindBy(xpath = "//div[@id='mat-select-value-7']")
    private WebElement country;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/ngx-mat-select-search[1]/div[1]/input[1]")
    private WebElement selectCountry;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
    private WebElement matchCountry;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[2]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[7]/app-question[1]/div[1]/div[1]/div[1]/app-country-single-question[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]")
    private  WebElement nationality;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/ngx-mat-select-search[1]/div[1]/input[1]")
    private WebElement searchNationality;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
    private WebElement matchNationality;

    @FindBy(xpath = "//div[@id='mat-select-value-11']")
    private WebElement livePanama;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
    private WebElement txtNo;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[4]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[1]/app-question[1]/div[1]/div[1]/div[1]/app-country-single-question[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]")
    private WebElement hostCountry;

    @FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/ngx-mat-select-search[1]/div[1]/input[1]")
    private WebElement searchHostCountry;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[4]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[2]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement city;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[4]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[3]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement address;

    @FindBy(xpath = "//body[1]/app-root[1]/app-user-layout[1]/app-navbar[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/app-get-questionnaire[1]/section[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/app-dynamic-group[1]/div[1]/form[1]/div[4]/div[1]/app-dynamic-form[1]/div[1]/div[1]/div[4]/app-question[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")
    private WebElement houseInformation;

    @FindBy(xpath = "//button[contains(text(),'Continuar')]")
    private WebElement btnContinue;

    public void fillFormBasicInformation(List<Map<String, String>> data) throws InterruptedException {
        firstName.sendKeys(data.get(0).get("name"));
        secondName.sendKeys(data.get(0).get("name2"));
        lastName.sendKeys(data.get(0).get("lastname"));
        secondLastName.sendKeys(data.get(0).get("lastname2"));
        genre.click();
        selectGenre(data);
        phoneCode.click();
        searchCountry.sendKeys(data.get(0).get("country"));
        selectCountry(data);
        Thread.sleep(1000);
        mobilePhone.sendKeys(data.get(0).get("phone"));
        getUtilPage().scroll();
        documentType.click();
        selectDocumentType(data);
        documentNumber.sendKeys(data.get(0).get("document"));

    }

    public void fillFormPersonalInformation(List<Map<String, String>> data) throws InterruptedException {
        getUtilPage().scroll();
        documentType.click();
        selectDocumentType(data);
        Thread.sleep(1000);
        getUtilPage().scroll();
        documentNumber.sendKeys(data.get(0).get("document"));
        maritalStatus.click();
        selectMaritalstatus(data);
        date.click();
        day.click();
        country.click();
        selectCountry.sendKeys(data.get(0).get("country"));
        matchCountry.click();
        Thread.sleep(1000);
        nationality.click();
        searchNationality.sendKeys(data.get(0).get("country"));
        matchNationality.click();
        livePanama.click();
        Thread.sleep(1000);
        userLivesInPanama(data);
        getUtilPage().scroll();

    }

    public void fillFormResidenceInformation(List<Map<String, String>> data){
        hostCountry.click();
        searchHostCountry.sendKeys(data.get(0).get("country"));
        matchCountry.click();
        city.sendKeys("Bogotá");
        address.sendKeys("carrera 69");
        houseInformation.sendKeys("201");
        btnContinue.click();
    }

    public void selectGenre(List<Map<String, String>> data){
        String genre = data.get(0).get("Genre");

        switch(genre){
            case "M":
                male.click();
                break;
            case "F":
                female.click();
                break;
            case "NA":
                noResponse.click();
        }
    }

    public void selectCountry(List<Map<String, String>> data){
        String country = data.get(0).get("country");

        switch(country){
            case "colombia":
                codeColmbia.click();
                break;
        }
    }

    public void selectDocumentType(List<Map<String, String>> data){
        String country = data.get(0).get("country");
        if(country != "Panama"){
            passport.click();
        }
    }

    public void selectMaritalstatus(List<Map<String, String>> data){
        String maritalStatus = data.get(0).get("maritalStatus");

        switch(maritalStatus){
            case "soltero/a":
                singleStatus.click();
                break;
            case "casado/a":
                marriedStatus.click();
                break;
            case "viudo/a":
                widowerStatus.click();
        }
    }

    public void userLivesInPanama(List<Map<String, String>> data){
        String country = data.get(0).get("country");
        switch(country){
            case "colombia":
                txtNo.click();
                break;
        }
    }


}
