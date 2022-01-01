package tests.Data;

import com.github.javafaker.Faker;
import tests.TestBase;

public class TestData extends TestBase {

    Faker faker = new Faker();
    public String name = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobile = faker.phoneNumber().phoneNumber(),
            address = faker.address().streetAddress(),
            gender = "Other",
            month = "May",
            year = "1990",
            day = "30",
            dateOfBirth = day + month + year,
            subject1 = "Commerce",
            subject2 = "Arts",
            hobby = "Music",
            path = "img/1.jpg",
            picture = "img/1.jpg",
            state = "Rajasthan",
            city = "Jaipur";
}