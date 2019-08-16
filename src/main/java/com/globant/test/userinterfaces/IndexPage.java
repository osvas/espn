package com.globant.test.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IndexPage {
    public static final Target NFL_LINK = Target.the("Nfl link").located(By.name("&lpos=sitenavdefault+sitenav_nfl"));
    public static final Target STANDINGS_LINK = Target.the("Standings link").located(By.name("&lpos=sitenavdefault+nfl_nflstandings"));
    public static final Target REMOVE_ADS = Target.the("Standings link").locatedBy("//div[contains(@class, 'ad-slot')]");
}
