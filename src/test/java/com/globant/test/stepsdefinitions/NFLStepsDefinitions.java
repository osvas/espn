package com.globant.test.stepsdefinitions;

import com.globant.test.questions.TheNFLTitle;
import com.globant.test.tasks.EnterToThe;
import com.globant.test.tasks.OpenThe;
import com.globant.test.tasks.Remove;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class NFLStepsDefinitions {
    private static String OS = System.getProperty("os.name").toLowerCase();

    @Before
    public void startDriver(){
        if (OS.indexOf("win") >= 0){
            System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
        }else if(OS.indexOf("mac") >= 0){
            System.getProperty("webdriver.chrome.driver", "chromedriver");
        }
    }

    @Managed(driver = "chrome")
    private WebDriver suNavegador;
    private static Actor oscar = Actor.named("Oscar");

    @Given("^Oscar enter the espn page$")
    public void iEnterTheEspnPage() {
        oscar.can(BrowseTheWeb.with(suNavegador));
        oscar.attemptsTo(
                OpenThe.browser());
        oscar.attemptsTo(Remove.ads());
    }

    @When("^I enter the nfl standings$")
    public void iEnterTheNflStandings() {
        oscar.attemptsTo(EnterToThe.standings());
        oscar.attemptsTo(Remove.ads());
    }

    @Then("^I verify that the (.*) is visible$")
    public void iVerifyThatTheTitleIsVisible(String title) {
        oscar.should(seeThat(TheNFLTitle.is(), equalTo(title)));
    }
}
