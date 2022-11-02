package co.com.choucair.certification.pruebatecnica.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/uTest.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.pruebatecnica.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
// Runner
public class RunnerTags {
}
