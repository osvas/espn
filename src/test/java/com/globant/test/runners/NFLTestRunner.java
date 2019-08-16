package com.globant.test.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
  features = "src/test/resources/features/nfl_test.feature",
  glue = {"com.globant.test.stepsdefinitions"}
)
public class NFLTestRunner {

}
