package com.globant.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThe implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://www.espn.com/?src=com"));
    }

    public static OpenThe browser() {
        return Tasks.instrumented(OpenThe.class);
    }
}
