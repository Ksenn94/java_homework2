package com.demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestRegistrationForm {
    //add a default url
    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
    }

    @Test
    void fillregistrationformtest() {
        open("/automation-practice-form");
        Registrationform.filldata(); // filling out the form
        Assertions.checks(); //assertions
    }

    @AfterAll
    static void finalnotification() {
        System.out.println("!THE TEST IS SUCCESSFULLY FINISHED!");
    }
}
