package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Registrationform {

    static void filldata() {
        //personal info
        $("#firstName").setValue("Tommy");
        $("#lastName").setValue("Shelby");
        $("#userEmail").setValue("Shelby@mail.com");
        $("[for='gender-radio-1']").click();
        $("#userNumber").setValue("1234567891");
        // picture
        $("#uploadPicture").uploadFile(new File("src/test/resources/DSC07524.JPG"));
        //subjects
        $("#subjectsInput").setValue("English").pressEnter();
        $("#subjectsInput").setValue("Maths").pressEnter();
        //address
        $("#currentAddress").setValue("Country Region City Street house floor 2 apartment 45");
        $("#react-select-3-input").setValue("Haryana").pressEnter();
        $("#react-select-4-input").setValue("Agra").pressEnter();
        //или можно так:
        //$("#react-select-3-option-0").click();
        //$("#city").click();

        //$("[for = hobbies-checkbox-1]").scrollIntoView(false).click();
        //$("[for = hobbies-checkbox-2]").click()


        //$("#dateOfBirthInput").scrollIntoView(false).click();
        //$(".react-datepicker__year-select").selectOptionContainingText("2000");
        //$("#dateOfBirthInput").scrollIntoView(false).click();
        //$(".react-datepicker__month-select").selectOptionContainingText("Oct");
        //$(".react-datepicker__day--001").click();
        //$("#submit").scrollTo().click();
        //$("#submit").scrollIntoView(false).click();


    }

}


