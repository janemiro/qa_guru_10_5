package tests;

import org.junit.jupiter.api.Test;
import tests.data.TestData;
import tests.pages.RegistrationPage;


public class DemoQaFormTest extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    void fillFormTest() {

        registrationPage.openPage()
                .fillName(testData.name)
                .fillLastName(testData.lastName)
                .fillEmail(testData.email)
                .fillGender(testData.gender)
                .fillMobileNumber(testData.mobile)
                .calendar.setDate(testData.day, testData.month, testData.year);

        registrationPage.fillSubject(testData.subject1)
                .fillHobbies(testData.hobby)
                .uploadPicture()
                .fillAddress(testData.address)
                .fillState(testData.state)
                .fillCity(testData.city)
                .submitClick();


        // Check the final form
        registrationPage.checkResultsValue("Student Name", (testData.name + " " + testData.lastName))
                .checkResultsValue("Student Email", testData.email)
                .checkResultsValue("Gender", testData.gender)
                .checkResultsValue("Mobile", testData.mobile)
                .checkResultsValue("Date of Birth", testData.dateOfBirth)
                .checkResultsValue("Subjects", testData.subject1)
                .checkResultsValue("Hobbies", testData.hobby)
                .checkResultsValue("Picture", testData.picture)
                .checkResultsValue("Address", testData.address)
                .checkResultsValue("State and City", (testData.state + " " + testData.city));

    }
}