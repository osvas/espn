package com.globant.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.globant.test.userinterfaces.IndexPage.NFL_LINK;
import static com.globant.test.userinterfaces.IndexPage.STANDINGS_LINK;

public class EnterToThe implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NFL_LINK),
                Click.on(STANDINGS_LINK));
    }

    public static EnterToThe standings() {
        return Tasks.instrumented(EnterToThe.class);
    }
}
