package tests.pages;

import com.codeborne.selenide.SelenideElement;
import tests.components.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.TestData.*;

public class RegistrationPage {
    //locators & elements
    private final String FORM_TITLE = "Student Registration Form";
    public Calendar calendar = new Calendar();
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
            resultsTable = $(".modal-open");

    //actions
    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));

    }

    public RegistrationPage fillName(String value) {
        nameInput.setValue(name);
        return this;

    }

    public RegistrationPage fillLastName(String value) {
        lastNameInput.setValue(lastName);
        return this;
    }

    public RegistrationPage fillEmail(String value) {
        emailInput.setValue(email);
        return this;
    }

    public RegistrationPage fillGender(String value) {
        genderRadio.$(byText(gender)).click();
        return this;
    }

    public RegistrationPage fillMobileNumber(String value) {
        mobileNumberInput.setValue(mobile);
        return this;
    }

    public RegistrationPage fillSubject(String value1, String value2) {
        subjectsInput.setValue(subject1).pressEnter();
        subjectsInput.setValue(subject2).pressEnter();
        return this;
    }

    public RegistrationPage fillHobbies(String value) {
        hobbiesInput.findElement(byText(hobby)).click();
        return this;
    }


    public RegistrationPage uploadPicture() {
        pictureInput.uploadFromClasspath(path);
        return this;
    }


    public RegistrationPage checkResultsValue(String key, String value) {
        resultsTable.$(byText(key))
                .parent().shouldHave(text(value));
        return this;
    }


}


