package runner;

import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@Mobile",
        glue = {"stepsDefinition"}
//        junit = "--step-notifications"
)
public class DefinitionTestSuite {
}
