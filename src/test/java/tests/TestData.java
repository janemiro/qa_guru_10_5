package tests;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

public static String url = "https://demoqa.com/automation-practice-form";

public String
            name = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = "jee.doe@gmail.com";

/*
            gender = "Other",
            mobile = "1234567890",
            month = "May",
            year = "1990",
            day = "30",
            dateOfBirth = day + month + year,
            subject1 = "Commerce",
            subject2 = "Arts",
            hobby = "Music",
            path = "img/1.jpg",
            picture = "img/1.jpg",
            address = "Roof, 5",
            state = "Rajasthan",
            city = "Jaipur"


            */


}
