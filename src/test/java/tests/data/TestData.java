package tests.data;

import com.github.javafaker.Faker;
import tests.TestBase;

public class TestData {

    Faker faker = new Faker();
    public String name = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            mobile = faker.number().digits(10),
            address = faker.address().streetAddress(),
            gender = "Other",
            month = "May",
            year = "1990",
            day = "30",
            dateOfBirth = day + " " + month + "," + year,
            subject1 = "Commerce",
           // subject2 = "Arts",
            hobby = "Music",
            picture = "1.jpg",
            state = "Rajasthan",
            city = "Jaipur";


}