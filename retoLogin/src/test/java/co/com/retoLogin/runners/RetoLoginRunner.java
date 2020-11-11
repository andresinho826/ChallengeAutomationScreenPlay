package co.com.retoLogin.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src//test//resources//features//reto_login.feature",
        //tags = {"@second"},
        glue = "co.com.retoLogin.stepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class RetoLoginRunner {
}
