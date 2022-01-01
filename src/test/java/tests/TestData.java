package tests;

import com.github.javafaker.Faker;

public class TestData {


    public static String url = "https://demoqa.com/automation-practice-form";
    Faker faker = new Faker();

    public static String
    String name = faker.name().firstName(),
            lastName = "Doe",
            email = "jee.doe@gmail.com",
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
            city = "Jaipur";


    String fakename = faker.name().name();
    String fakeLastName = faker.name().lastName();

}
