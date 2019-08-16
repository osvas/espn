package com.globant.test.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NFLStandingsPage {
    public static final Target NFL_STANDINGS_TITLE = Target.the("Nfl standings title").locatedBy("//h1[contains(text(), 'NFL Preseason Standings 2019')]");
}
