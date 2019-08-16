package com.globant.test.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TheNFLTitle implements Question<String> {
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getTitle();
    }

    public static TheNFLTitle is() {
        return new TheNFLTitle();
    }
}
