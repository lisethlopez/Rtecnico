package co.com.choucair.certification.academy.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippeType;
import net.serenitybdd.cucumber.CucumberwithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utest.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.academy.stepdefinitions",
        snippets = Snippettype.CAMELCASE)

public class RunnerTags {
}
