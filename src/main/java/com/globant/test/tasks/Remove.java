package com.globant.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

import static com.globant.test.userinterfaces.IndexPage.REMOVE_ADS;

public class Remove implements Task {

    public <T extends Actor> void performAs(T actor) {
        for (WebElement element : REMOVE_ADS.resolveAllFor(actor)) {
            BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].style.display = 'none'", element);
        }
    }

    public static Remove ads() {
        return Tasks.instrumented(Remove.class);
    }
}
