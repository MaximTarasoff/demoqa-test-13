package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestBoxHW {

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulTest() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("Maxim");
        $("#lastName").setValue("Tarasoff");

        $("#userEmail").setValue("360m@mail.ru");

        $("#gender-radio-1").doubleClick();

        $("#userNumber").setValue("89296349550");

        $("#dateOfBirthInput").click();
        $(By.className("react-datepicker__month-select")).selectOptionByValue("0");
        $(By.className("react-datepicker__year-select")).selectOptionByValue("2020");
        $(By.className("react-datepicker__day--009")).click();

        $(".subjects-auto-complete__input").click();
        $("#subjectsInput").sendKeys("Physics");
        $("#subjectsInput").pressEnter();

        $(byText("Sports")).click();
        $(byText("Music")).click();

        $("#uploadPicture").uploadFromClasspath("AAAAAAAAAAAAAAAAAAAAA.jpg");

        $("#currentAddress").setValue("If you know, you know");

        $("#state").click();
        $(byText("Uttar Pradesh")).click();

        $("#city").click();
        $(byText("Lucknow")).click();

        $("#submit").click();

        $(".modal-content").shouldHave(text("Maxim"), text("Tarasoff"), text("360m@mail.ru"), text("Male"), text("09 January,2020"), text("Sports, Music"), text("AAAAAAAAAAAAAAAAAAAAA.jpg"), text("If you know, you know"), text("Uttar Pradesh Lucknow"));

    }
}
