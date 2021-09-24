package co.com.choucair.academy.proyectoprueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automationTesting.feature",
        tags= "@stories",
        glue = "co.com.choucair.academy.proyectoprueba.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
