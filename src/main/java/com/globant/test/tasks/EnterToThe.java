package com.globant.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.globant.test.userinterfaces.IndexPage.NFL_LINK;
import static com.globant.test.userinterfaces.IndexPage.STANDINGS_LINK;
import static com.globant.test.userinterfaces.NFLStandingsPage.SELECT_RESOURCES;

public class EnterToThe implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NFL_LINK),
                Click.on(STANDINGS_LINK),
                Remove.ads(),
                SelectFromOptions.byVisibleText("Playoff Machine").from(SELECT_RESOURCES),
                Remove.ads());
    }

    public static EnterToThe playoffMachine() {
        return Tasks.instrumented(EnterToThe.class);
    }
}
