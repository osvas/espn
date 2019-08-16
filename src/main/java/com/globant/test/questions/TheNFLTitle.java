package com.globant.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static com.globant.test.userinterfaces.NFLStandingsPage.NFL_STANDINGS_TITLE;

public class TheNFLTitle implements Question<String> {


    public String answeredBy(Actor actor) {
        return Text.of(NFL_STANDINGS_TITLE).viewedBy(actor).asString();
    }

    public static TheNFLTitle is() {
        return new TheNFLTitle();
    }
}
