package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static tests.TestData.*;


public class DemoQaFormTest extends TestBase {

    @Test
    void fillFormTest() {

        registrationPage.openPage();
        // Set the contact info and gender
        registrationPage.fillName(name)
                .fillLastName(lastName)
                .fillEmail(email)
                .fillGender(gender)
                .fillMobileNumber(mobile)
                .calendar.setDate(day, month, year);

        registrationPage.fillSubject(subject1, subject2)
                .fillHobbies(hobby)
                .uploadPicture();

        // Set address, state and city info
        $("#currentAddress").setValue(address);

        $("#state").click();
        $(byText(state)).scrollTo().click();

        $("#city").click();
        $(byText(city)).scrollTo().click();

        // Submit the form
        $("#submit").click();

        // Check the final form
      //  registrationPage.checkResultsValue("Student name", (name + " " + lastName))
        registrationPage.checkResultsValue("Student Email", email)
                .checkResultsValue("Gender", gender)
                .checkResultsValue("Mobile", mobile)
                .checkResultsValue("Date of Birth", dateOfBirth)
                .checkResultsValue("Subjects", (subject1 + subject2))
                .checkResultsValue("Hobbies", hobby)
                .checkResultsValue("Picture", picture)
                .checkResultsValue("Address", address)
                .checkResultsValue("State and City", (state + city));

    }
}