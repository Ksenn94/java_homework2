package com.demoqa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.AfterAll;

import static com.codeborne.selenide.Selenide.$;

public class Assertions {
    static void checks() {
        $("#example-modal-sizes-title-lg").shouldHave(Condition.text("Thanks for submitting the form"));
        $(".modal-body").shouldHave(
                Condition.text("Tommy"),
                Condition.text("Shelby"),
                Condition.text("Male")
        );
    }


}
