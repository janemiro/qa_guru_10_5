package tests.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Calendar {
    private SelenideElement dateInput = $("#dateOfBirthInput");

public void setDate(String day, String month, String year){
    dateInput.click();
    $(".react-datepicker__month-select").click();
    $(".react-datepicker__month-select").selectOption(month);
    $(".react-datepicker__year-select").selectOption(year);
    $(".react-datepicker__day--030:not(.react-datepicker__day--outside-month)").click();

}


}

