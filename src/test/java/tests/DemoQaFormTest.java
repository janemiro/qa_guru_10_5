package tests;

import org.junit.jupiter.api.Test;
import tests.data.TestData;
import tests.pages.RegistrationPage;


public class DemoQaFormTest extends TestData {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .fillName(name)
                .fillLastName(lastName)
                .fillEmail(email)
                .fillGender(gender)
                .fillMobileNumber(mobile)
                .calendar.setDate(day, month, year);

        registrationPage.fillSubject(subject1)
                .fillHobbies(hobby)
                .uploadPicture()
                .fillAddress(address)
                .fillState(state)
                .fillCity(city)
                .submitClick();


        // Check the final form
        registrationPage.checkResultsValue("Student Name", (name + " " + lastName))
                .checkResultsValue("Student Email", email)
                .checkResultsValue("Gender", gender)
                .checkResultsValue("Mobile", mobile)
                .checkResultsValue("Date of Birth", dateOfBirth)
                .checkResultsValue("Subjects", subject1)
                .checkResultsValue("Hobbies", hobby)
                .checkResultsValue("Picture", picture)
                .checkResultsValue("Address", address)
                .checkResultsValue("State and City", (state + " " + city));

    }
}