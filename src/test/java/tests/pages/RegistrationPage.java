package tests.pages;

import com.codeborne.selenide.SelenideElement;
import tests.components.Calendar;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    //locators & elements
    private final String FORM_TITLE = "Student Registration Form";
    public Calendar calendar = new Calendar();
    public void submit(){}
    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            nameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderRadio = $("#genterWrapper"),
            mobileNumberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureInput = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            stateInput = $("#state"),
            stateCitySelected = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            submitButton = $("#submit"),
            resultsTable = $(".table-responsive");


    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
        return this;
    }

    public RegistrationPage fillName(String value) {
        nameInput.setValue(value);
        return this;

    }

    public RegistrationPage fillLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage fillEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage fillGender(String value) {
        genderRadio.$(byText(value)).click();
        return this;
    }

    public RegistrationPage fillMobileNumber(String value) {
        mobileNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage fillSubject(String value) {
        //как сделать 2 предмета? что должно быть в аргументах?
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage fillHobbies(String value) {
        hobbiesInput.findElement(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture() {
        pictureInput.uploadFile(new File("src/test/resources/img/1.jpg"));
        return this;
    }

    public RegistrationPage fillAddress(String value) {
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage fillState(String value) {
        stateInput.scrollTo();
        stateInput.click();
        stateCitySelected.$(byText(value)).scrollTo().click();
        return this;
    }

    public RegistrationPage fillCity(String value) {
        cityInput.click();
        stateCitySelected.$(byText(value)).scrollTo().click();
        return this;
    }

    public void submitClick() {
        submitButton.click();
    }

    public RegistrationPage checkResultsValue(String key, String value) {
        resultsTable.$(byText(key))
                .parent().shouldHave(text(value));
        return this;

    }

}
